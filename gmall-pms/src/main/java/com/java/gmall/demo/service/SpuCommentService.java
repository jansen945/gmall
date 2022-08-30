package com.java.gmall.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.demo.entity.SpuComment;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;

/**
 * 商品评价
 *
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageVo queryPage(QueryCondition params);
}

