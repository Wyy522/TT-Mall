package com.market.mall.product.feign;

import com.market.common.to.es.SkuEsModel;
import com.market.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("mall-search")
public interface SearchFeignService {
    @PostMapping("/search/save/product")
    R productUp(@RequestBody List<SkuEsModel> skuEsModelList);
}
