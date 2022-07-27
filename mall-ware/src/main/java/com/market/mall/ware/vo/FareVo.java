package com.market.mall.ware.vo;

import com.market.mall.ware.vo.MemberAddressVo;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}


