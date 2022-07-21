package com.market.mall.party.component;

import com.market.mall.party.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class SmsComponent {

    public  void sendSmsCode(String phone,String code){
        String host = "https://miitangs09.market.alicloudapi.com";
        String path = "/v1/tools/sms/code/sender";
        String method = "POST";
        String appcode = "0340a66023664dadba66b79427f62ac2";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        //需要给X-Ca-Nonce的值生成随机字符串，每次请求不能相同
        headers.put("X-Ca-Nonce", UUID.randomUUID().toString());
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("filterVirtual", "false");
        bodys.put("phoneNumber", phone);
        bodys.put("reqNo", "miitangtest01");
        bodys.put("smsSignId", "0000");
        bodys.put("smsTemplateNo", "0020");
        bodys.put("verifyCode", code);


        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
