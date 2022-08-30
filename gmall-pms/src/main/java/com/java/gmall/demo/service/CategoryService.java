package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.Category;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

