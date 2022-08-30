package com.java.gmall.demo.dao;

import com.java.gmall.demo.entity.SpuComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuComment> {
	
}
