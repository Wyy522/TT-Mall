package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseAttrlistforspu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);

    void saveProductAttr(List<ProductAttrValueEntity> collect);
}

