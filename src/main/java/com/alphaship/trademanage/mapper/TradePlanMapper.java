package com.alphaship.trademanage.mapper;

import com.alphaship.trademanage.pojo.TradePlan;
import com.alphaship.trademanage.vo.TradePlanQueryVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TradePlanMapper extends BaseMapper<TradePlan> {

    IPage<TradePlan> listByPage(Page<?> page, @Param("query") TradePlanQueryVO tradePlanQueryVO);

}
