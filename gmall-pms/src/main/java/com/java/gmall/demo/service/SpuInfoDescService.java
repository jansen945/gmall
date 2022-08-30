package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.SpuInfoDesc;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * spu信息介绍
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageVo queryPage(QueryCondition params);
}

