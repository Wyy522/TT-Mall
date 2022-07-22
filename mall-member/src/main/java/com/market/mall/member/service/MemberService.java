package com.market.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.member.entity.MemberEntity;
import com.market.mall.member.exception.PhoneException;
import com.market.mall.member.exception.UsernameException;
import com.market.mall.member.vo.MemberUserLoginVo;
import com.market.mall.member.vo.MemberUserRegisterVo;
import com.market.mall.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:08:46
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(MemberUserRegisterVo vo);

    /**
     * 判断邮箱是否重复
     * @param phone
     * @return
     */
    void checkPhoneUnique(String phone) throws PhoneException;

    /**
     * 判断用户名是否重复
     * @param userName
     * @return
     */
    void checkUserNameUnique(String userName) throws UsernameException;

    MemberEntity login(MemberUserLoginVo vo);

    MemberEntity login(SocialUser socialUser) throws Exception;
}

