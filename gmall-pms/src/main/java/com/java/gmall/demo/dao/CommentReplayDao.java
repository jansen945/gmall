package com.java.gmall.demo.dao;

import com.java.gmall.demo.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
