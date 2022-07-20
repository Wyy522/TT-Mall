package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.SkuSaleAttrValueEntity;
import com.market.mall.product.vo.SkuItemSaleAttrVo;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuItemSaleAttrVo> getSaleAttrBySpuId(Long spuId);
}

