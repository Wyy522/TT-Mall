package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.SkuInfoEntity;
import com.market.mall.product.vo.SkuItemVo;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * sku信息
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    List<SkuInfoEntity> getSkusBySpuId(Long spuId);

    /**
     * 查询商品详情
     * @param skuId
     * @return
     */
    SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException;
}

