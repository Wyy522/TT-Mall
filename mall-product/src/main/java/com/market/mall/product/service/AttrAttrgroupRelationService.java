package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.AttrAttrgroupRelationEntity;
import com.market.mall.product.vo.AttrGroupRelationVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrGroupRelationVo> vos);
}

