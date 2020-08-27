package com.alphaship.trademanage.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "trade_plan")
public class TradePlan implements Serializable {
    private static final long serialVersionUID = -7791156645628261965L;

    private String id;

    @NotNull(message = "入场日期不能为空")
    private Date entryDate;

    @NotBlank(message = "品种代码不能为空")
    private String symbol;

    @NotBlank(message = "时间级别不能为空")
    private String timeLevel;

    @NotNull(message = "入场点不能为空")
    @DecimalMin(value = "0", inclusive = false, message = "入场点必须大于0")
    private BigDecimal entryPrice;

    @NotNull(message = "多空方向不能为空")
    private Integer side;

    @NotBlank(message = "入场理由不能为空")
    private String entryReason;

    @NotNull(message = "仓位不能为空")
    @DecimalMin(value = "0", inclusive = false, message = "仓位必须大于0")
    private BigDecimal position;

    @NotNull(message = "止损点不能为空")
    @DecimalMin(value = "0", inclusive = false, message = "止损点必须大于0")
    private BigDecimal slPrice;

    @NotNull(message = "止盈TP1不能为空")
    @DecimalMin(value = "0", inclusive = false, message = "止盈TP1必须大于0")
    private BigDecimal spPriceOne;

    private BigDecimal spPriceTwo;

    @NotNull(message = "盈亏比不能为空")
    @DecimalMin(value = "1", message = "盈亏比必须大于等于1")
    private BigDecimal pnlRatio;

    private BigDecimal realizedPnl;

    @NotNull(message = "计价单位不能为空")
    private Integer valuationUnit;

    @NotNull(message = "状态不能为空")
    private Integer status;
}
