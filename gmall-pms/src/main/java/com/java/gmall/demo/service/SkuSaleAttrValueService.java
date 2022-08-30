package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.SkuSaleAttrValue;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * sku销售属性&值
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

