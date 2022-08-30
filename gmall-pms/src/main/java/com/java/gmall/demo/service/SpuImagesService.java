package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.SpuImages;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

