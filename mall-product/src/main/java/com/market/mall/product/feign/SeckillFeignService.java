package com.market.mall.product.feign;

import com.market.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(value = "mall-seckill", fallback = SeckillFallbackService.class)
public interface SeckillFeignService {
//    @GetMapping("/sku/seckill/{skuId}")
//    R getSkuSeckillInfo(@PathVariable("skuId") Long skuId);
}
