package com.market.mall.member.dao;

import com.market.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:08:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
