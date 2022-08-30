package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.AttrAttrgroupRelation;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * 属性&属性分组关联
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);
}

