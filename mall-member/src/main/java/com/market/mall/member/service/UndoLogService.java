package com.market.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.market.common.utils.PageUtils;
import com.market.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author weiyiye
 * @email weiyiye@gmail.com
 * @date 2022-03-11 15:08:46
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

