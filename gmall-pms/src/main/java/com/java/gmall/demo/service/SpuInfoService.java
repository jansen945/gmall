package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.SpuInfo;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * spu信息
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);
}

