package com.alphaship.trademanage.service;

import com.alphaship.trademanage.pojo.TradePlan;
import com.alphaship.trademanage.vo.TradePlanQueryVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface TradePlanServiceI extends IService<TradePlan> {

    IPage<TradePlan> listByPage(Page<TradePlan> page, TradePlanQueryVO tradePlanQueryVO);

    void saveTradePlan(TradePlan tradePlan);
}
