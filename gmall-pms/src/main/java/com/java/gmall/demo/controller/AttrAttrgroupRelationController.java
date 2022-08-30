package com.java.gmall.demo.controller;

import java.util.Arrays;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.java.gmall.demo.service.AttrAttrgroupRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.java.gmall.demo.entity.AttrAttrgroupRelation;

/**
 * 属性&属性分组关联
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
@Api(tags = "属性&属性分组关联 管理")
@RestController
@RequestMapping("demo/attrattrgrouprelation")
public class AttrAttrgroupRelationController {
    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('demo:attrattrgrouprelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = attrAttrgroupRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('demo:attrattrgrouprelation:info')")
    public Resp<AttrAttrgroupRelation> info(@PathVariable("id") Long id){
		AttrAttrgroupRelation attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return Resp.ok(attrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('demo:attrattrgrouprelation:save')")
    public Resp<Object> save(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('demo:attrattrgrouprelation:update')")
    public Resp<Object> update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('demo:attrattrgrouprelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
