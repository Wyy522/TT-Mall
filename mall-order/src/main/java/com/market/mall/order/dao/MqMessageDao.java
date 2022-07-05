package com.market.mall.order.dao;

import com.market.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:19:19
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
