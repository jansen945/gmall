package com.java.gmall.demo.dao;

import com.java.gmall.demo.entity.SkuInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfo> {
	
}
