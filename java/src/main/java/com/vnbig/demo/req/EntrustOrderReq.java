package com.vnbig.demo.req;

import java.math.BigDecimal;

/**
 * @ClassName EntrustOrderReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 15:47
 * @Version 1.0
 */
public class EntrustOrderReq extends BaseReq {
    private Integer tradeType; // 交易类型 1:限价,2:市价,3:计划委托
    private BigDecimal quantity; // 委托数量
    private BigDecimal price; // 委托价格
    private BigDecimal triggerPrice; // 触发价格 // 如果不计划委托 不传
    private Integer direction; // 委托方向 1:买入/做多 -1:卖出/做空
    private String contractPair; // 合约对

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(BigDecimal triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getContractPair() {
        return contractPair;
    }

    public void setContractPair(String contractPair) {
        this.contractPair = contractPair;
    }
}
