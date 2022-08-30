package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.Brand;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

