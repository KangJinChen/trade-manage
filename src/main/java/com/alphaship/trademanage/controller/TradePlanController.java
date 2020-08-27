package com.alphaship.trademanage.controller;


import com.alphaship.trademanage.pojo.TradePlan;
import com.alphaship.trademanage.service.TradePlanServiceI;
import com.alphaship.trademanage.vo.CommonResult;
import com.alphaship.trademanage.vo.TradePlanQueryVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/trade/plan")
@AllArgsConstructor
public class TradePlanController {

    private final TradePlanServiceI tradePlanServiceI;

    @GetMapping("/list")
    public CommonResult<IPage<TradePlan>> list(Page<TradePlan> page, TradePlanQueryVO tradePlanQueryVO) {
        IPage<TradePlan> tradePlanIPage = tradePlanServiceI.listByPage(page, tradePlanQueryVO);
        return CommonResult.success(tradePlanIPage);
    }

    @PostMapping("/save")
    public CommonResult<?> saveOrUpdate(@Valid @RequestBody TradePlan tradePlan) {
        tradePlanServiceI.saveTradePlan(tradePlan);
        return CommonResult.success(null, "保存成功");
    }

    @PostMapping("/remove/{id}")
    public CommonResult<?> remove(@PathVariable(name = "id") String id) {
        tradePlanServiceI.removeById(id);
        return CommonResult.success(null, "删除成功");
    }

    @GetMapping("/detail/{id}")
    public CommonResult<TradePlan> detail(@PathVariable(name = "id") String id) {
        TradePlan tradePlan = tradePlanServiceI.getById(id);
        return CommonResult.success(tradePlan);
    }
}
