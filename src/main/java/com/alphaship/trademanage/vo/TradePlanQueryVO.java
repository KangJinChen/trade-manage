package com.alphaship.trademanage.vo;

import lombok.Data;

import java.util.Date;

@Data
public class TradePlanQueryVO {

    private String symbol;

    private Integer status;

    private Integer side;

    private String entryDateFrom;

    private String entryDateTo;
}
