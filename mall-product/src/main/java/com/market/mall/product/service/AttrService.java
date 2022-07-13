package com.market.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.product.entity.AttrEntity;
import com.market.mall.product.vo.AttrGroupRelationVo;
import com.market.mall.product.vo.AttrRespVo;
import com.market.mall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 12:53:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    //AttrRespVo getAttrInfo(Long attrId);

    //void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

   // void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);


    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    void deleteRelation(AttrGroupRelationVo[] vos);


    List<Long> selectSearchAttrs(List<Long> attrIds);
}

