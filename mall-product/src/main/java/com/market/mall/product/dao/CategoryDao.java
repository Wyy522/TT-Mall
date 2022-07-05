package com.market.mall.product.dao;

import com.market.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
