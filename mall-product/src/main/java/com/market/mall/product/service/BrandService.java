package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

