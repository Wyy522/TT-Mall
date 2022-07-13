package com.market.mall.product.feign;


import com.market.common.to.SkuReductionTo;
import com.market.common.to.SpuBoundTo;
import com.market.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("mall-coupon")
public interface CouponFeignService {
    /**
     * product  --->   cloud   ---> coupon
     * ->SpuBoundsTo  ->Json      ->SpuBounds
     *
     * @param spuBoundsTo
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundsTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(SkuReductionTo skuReductionTo);
}
