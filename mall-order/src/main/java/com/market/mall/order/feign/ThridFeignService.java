package com.market.mall.order.feign;

import com.market.mall.order.vo.PayVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-07-08 21:14
 **/

@FeignClient("mall  -third-party")
public interface ThridFeignService {
//
//    @GetMapping(value = "/pay",consumes = "application/json")
//    String pay(@RequestBody PayVo vo) throws AlipayApiException;

}
