package com.java.gmall.demo.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.java.gmall.demo.dao.ProductAttrValueDao;
import com.java.gmall.demo.entity.ProductAttrValue;
import com.java.gmall.demo.service.ProductAttrValueService;

@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValue> implements ProductAttrValueService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ProductAttrValue> page = this.page(
                new Query<ProductAttrValue>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}