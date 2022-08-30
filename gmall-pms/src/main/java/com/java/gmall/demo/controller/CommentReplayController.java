package com.java.gmall.demo.controller;

import java.util.Arrays;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.java.gmall.demo.entity.CommentReplay;
import com.java.gmall.demo.service.CommentReplayService;

/**
 * 商品评价回复关系
 * @author zhangsheng
 * @since  2022-08-30 10:28:06
 */
@Api(tags = "商品评价回复关系 管理")
@RestController
@RequestMapping("demo/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('demo:commentreplay:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = commentReplayService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('demo:commentreplay:info')")
    public Resp<CommentReplay> info(@PathVariable("id") Long id){
		CommentReplay commentReplay = commentReplayService.getById(id);

        return Resp.ok(commentReplay);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('demo:commentreplay:save')")
    public Resp<Object> save(@RequestBody CommentReplay commentReplay){
		commentReplayService.save(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('demo:commentreplay:update')")
    public Resp<Object> update(@RequestBody CommentReplay commentReplay){
		commentReplayService.updateById(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('demo:commentreplay:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
