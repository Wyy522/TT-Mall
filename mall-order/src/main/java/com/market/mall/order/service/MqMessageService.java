package com.market.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:19:19
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

