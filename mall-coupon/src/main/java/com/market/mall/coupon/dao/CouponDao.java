package com.market.mall.coupon.dao;

import com.market.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:00:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
