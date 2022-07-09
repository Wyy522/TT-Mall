package com.market.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.market.mall.product.entity.BrandEntity;
import com.market.mall.product.service.BrandService;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("成功");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("测试");
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
