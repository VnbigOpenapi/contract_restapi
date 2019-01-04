package com.vnbig.demo.req;

import java.math.BigDecimal;

/**
 * @ClassName PositionDepositReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 20:46
 * @Version 1.0
 */
public class PositionDepositReq extends BaseReq {
    private String positionId; // 持仓ID
    private BigDecimal quantity; // 数量

    public PositionDepositReq(String positionId, BigDecimal quantity) {
        this.positionId = positionId;
        this.quantity = quantity;
    }
}
