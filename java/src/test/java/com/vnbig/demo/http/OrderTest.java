package com.vnbig.demo.http;

import com.vnbig.demo.req.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void queryContractPair() {
        /* 获取所有交易对 */
        System.out.println(Order.queryContractPair(new BaseReq()));
    }

    @Test
    public void ticket() {
        /* 获取市场行情 */
        System.out.println(Order.ticket(new BaseReq()));
    }

    @Test
    public void tickets() {
        /* 获取市场行情列表 */
        System.out.println(Order.tickets(new BaseReq()));
    }

    @Test
    public void depthMarket() {
        /* 获取市场深度 */
        System.out.println(Order.depthMarket(new BaseReq()));
    }

    @Test
    public void tradeInfo() {
        /* 获取交易信息(100条) */
        System.out.println(Order.tradeInfo(new BaseReq()));
    }

    @Test
    public void kline() {
        MarketrReq marketrReq = new MarketrReq();
        marketrReq.setNum(1000); //默认1000条
        marketrReq.setCycle("1m"); //周期:1m,5m,15m,30m,1h,4h,6h,12h,1d,1w
        /* kline */
        System.out.println(Order.kline(marketrReq));
    }

    @Test
    public void entrustOrder() {
        /* 委托下单 */
        EntrustOrderReq entrustOrderReq = new EntrustOrderReq();
        entrustOrderReq.setTradeType(1); // 1:限价,2:市价,3:计划委托
        entrustOrderReq.setPrice(new BigDecimal("3780"));
        entrustOrderReq.setQuantity(new BigDecimal("400"));
        entrustOrderReq.setDirection(-1); // 1:买入/做多 -1:卖出/做空
//        entrustOrderReq.setTriggerPrice(new BigDecimal("0")); // 如果不计划委托 不传
        entrustOrderReq.setContractPair("CONTRACT_USD_BTC");
        System.out.println(Order.entrustOrder(entrustOrderReq));
    }

    @Test
    public void entrustCancel() {
        /* 取消委托单 */
        EntrustCancelReq entrustCancelReq = new EntrustCancelReq();
        entrustCancelReq.setEntrustNo("1");
        System.out.println(Order.entrustCancel(entrustCancelReq));
    }

    @Test
    public void entrustDetail() {
        /* 获取委托订单详情 */
        System.out.println(Order.entrustDetail(new EntrustDetailReq("1111")));
    }

    @Test
    public void dealDetail() {
        /* 获取成交订单详情 */
        System.out.println(Order.dealDetail(new EntrustDetailReq("1111")));
    }

    @Test
    public void getEntrustList() {
        /* 委托单查询 */
        String entrustList = Order.getEntrustList(new PageReq());
        System.out.println(entrustList);
    }

    @Test
    public void entrustQuery() {
        /* 获取成交订单详情 */
        System.out.println(Order.entrustQuery(new PageReq()));
    }

    @Test
    public void accountBase() {
        /* 获取成交订单详情 */
        System.out.println(Order.accountBase(new BaseReq()));
    }

    @Test
    public void getPositioniList() {
        /* 持仓单查询 */
        String positioniList = Order.getPositioniList(new PageReq());
        System.out.println(positioniList);
    }

    @Test
    public void depositAdd() {
        /* 追加保证金 */
        System.out.println(Order.depositAdd(new PositionDepositReq("111",new BigDecimal("1"))));
    }

    @Test
    public void dealQuery() {
        /* 获取成交记录列表 */
        System.out.println(Order.dealQuery(new PageReq()));
    }

    @Test
    public void leverIncordec() {
        /* 调整杠杆倍数 */
        System.out.println(Order.leverIncordec(new IncOrDecLeveReq(1)));
    }
}