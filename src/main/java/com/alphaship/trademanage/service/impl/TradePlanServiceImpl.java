package com.alphaship.trademanage.service.impl;

import com.alphaship.trademanage.mapper.TradePlanMapper;
import com.alphaship.trademanage.pojo.TradePlan;
import com.alphaship.trademanage.service.TradePlanServiceI;
import com.alphaship.trademanage.vo.TradePlanQueryVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class TradePlanServiceImpl extends ServiceImpl<TradePlanMapper, TradePlan> implements TradePlanServiceI {

    private final TradePlanMapper tradePlanMapper;


    @Override
    public IPage<TradePlan> listByPage(Page<TradePlan> page, TradePlanQueryVO tradePlanQueryVO) {
        return tradePlanMapper.listByPage(page, tradePlanQueryVO);
    }

    @Override
    public void saveTradePlan(TradePlan tradePlan) {
        saveOrUpdate(tradePlan);
    }


}
