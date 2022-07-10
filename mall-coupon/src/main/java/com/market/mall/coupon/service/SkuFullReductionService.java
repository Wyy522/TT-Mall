package com.market.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.to.SkuReductionTo;
import com.market.common.utils.PageUtils;
import com.market.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:00:49
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void saveSkuReduction(SkuReductionTo reductionTo);
}

