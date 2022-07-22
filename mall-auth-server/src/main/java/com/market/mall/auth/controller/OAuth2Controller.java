package com.market.mall.auth.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.market.common.utils.HttpUtils;
import com.market.common.utils.R;
import com.market.common.vo.MemberResponseVo;
import com.market.mall.auth.feign.MemberFeignService;
import com.market.mall.auth.vo.GiteeIdVo;
import com.market.mall.auth.vo.SocialUser;
import lombok.extern.slf4j.Slf4j;

import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static com.market.common.constant.AuthServerConstant.LOGIN_USER;

@Slf4j
@Controller
public class OAuth2Controller {

    @Autowired
    private MemberFeignService memberFeignService;


    @GetMapping(value = "/oauth2.0/gitee/success")
    public String weibo(@RequestParam("code") String code ,HttpSession session) throws Exception {
//        https://gitee.com/oauth/token?grant_type=authorization_code&code={code}&client_id={client_id}&redirect_uri={redirect_uri}&client_secret={client_secret}
        Map<String, String> getTokenMap = new HashMap<>();
        getTokenMap.put("client_id","80a507923382625acfe644873b02d58c30ea6564e03e6c40c1118d358f179600");
        getTokenMap.put("client_secret","d80ec483e2de763cd9ec6628ddda971339efe0d4a4c20f0af1e6698d59252bfa");
        getTokenMap.put("grant_type","authorization_code");
        getTokenMap.put("redirect_uri","http://auth.mall.com/oauth2.0/gitee/success");
        getTokenMap.put("code",code);
//
//        //1、根据用户授权返回的code换取access_token
        HttpResponse response = HttpUtils.doPost("https://gitee.com", "/oauth/token", "post", new HashMap<>(), getTokenMap, new HashMap<>());

//        //2、处理
        if (response.getStatusLine().getStatusCode() == 200) {
            //获取到了access_token,转为通用社交登录对象
            String json = EntityUtils.toString(response.getEntity());

            SocialUser socialUser = JSON.parseObject(json, SocialUser.class);
            //知道了哪个社交用户
            //1）、当前用户如果是第一次进网站，自动注册进来（为当前社交用户生成一个会员信息，以后这个社交账号就对应指定的会员）
            //登录或者注册这个社交用户
            System.out.println(socialUser.getAccess_token());


            //查询Uid
            Map<String, String> getIdMap = new HashMap<>();
            getIdMap.put("access_token",socialUser.getAccess_token());
            HttpResponse getId = HttpUtils.doGet("https://gitee.com", "/api/v5/user", "get", new HashMap<String, String>(), getIdMap);
            if (getId.getStatusLine().getStatusCode() == 200) {
                String json1 = EntityUtils.toString(getId.getEntity());
                GiteeIdVo giteeIdVo = JSON.parseObject(json1, GiteeIdVo.class);
                System.out.println(giteeIdVo.getId());
                socialUser.setUid(giteeIdVo.getId());
            }



            //调用远程服务
            R oauthLogin = memberFeignService.oauthLogin(socialUser);
            if (oauthLogin.getCode() == 0) {
                MemberResponseVo data = oauthLogin.getData("data", new TypeReference<MemberResponseVo>() {});
                log.info("登录成功：用户信息：{}",data.toString());

                //1、第一次使用session，命令浏览器保存卡号，JSESSIONID这个cookie
                //以后浏览器访问哪个网站就会带上这个网站的cookie
                //TODO 1、默认发的令牌。当前域（解决子域session共享问题）
                //TODO 2、使用JSON的序列化方式来序列化对象到Redis中
                session.setAttribute(LOGIN_USER,data);

                //2、登录成功跳回首页
                return "redirect:http://mall.com";
            } else {

                return "redirect:http://mall.com/login.html";
            }

        } else {
            return "redirect:http://mall.com/login.html";
        }
    }

}
