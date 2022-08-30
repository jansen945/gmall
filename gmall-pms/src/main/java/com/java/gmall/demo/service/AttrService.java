package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.Attr;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}

