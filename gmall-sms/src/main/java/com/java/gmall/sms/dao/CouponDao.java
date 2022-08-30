package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhangsheng
 * @email 824890106@qq.com
 * @date 2022-08-30 17:26:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
