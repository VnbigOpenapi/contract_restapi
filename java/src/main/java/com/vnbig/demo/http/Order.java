package com.vnbig.demo.http;

import com.vnbig.demo.auth.ApiKeyAuth;
import com.vnbig.demo.req.*;
import com.vnbig.demo.util.BeanUtil;
import com.vnbig.demo.util.CfgPropertiesUtil;
import com.vnbig.demo.util.HttpUtil;

import java.util.Map;

/**
 * @ClassName Order
 * @Description 订单相关
 * @Author jiangyunpeng
 * @Date 2018/12/27 12:54
 *
 *[获取所有交易对](chapter7-1.md)
 *[获取市场行情](chapter7-2.md)
 *[获取市场行情列表](chapter7-3.md)
 *[获取市场深度](chapter7-4.md)
 *[获取交易信息](chapter7-5.md)
 *[获取交易信息](chapter7-6.md)
 *[委托下单](chapter7-7.md)
 *[取消委托](chapter7-8.md)
 *[调整杠杆倍数](chapter7-17.md)
 *[获取委托订单详情](chapter7-9.md)
 *[获取成交记录列表](chapter7-16.md)
 *[获取成交详情](chapter7-10.md)
 *[获取委托记录](chapter7-11.md)
 *[获取成交记录](chapter7-12.md)
 *[获取账户余额](chapter7-13.md)
 *[获取持仓记录](chapter7-14.md)
 *[追加保证金](chapter7-15.md)
 *
 * @Version 1.0
 */
public class Order {

    private static final String APIKEY = CfgPropertiesUtil.get("apiKey");
    private static final String HTTP_HOST = CfgPropertiesUtil.get("http_host");

    /**
     * 获取所有交易对
     * /openapi/noauth/contract/{apiKey}/bases
     */
    public static String queryContractPair(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/bases";
        return callHttpGet(url, baseReq);
    }

    /**
     * 获取市场行情
     * /openapi/noauth/contract/{apiKey}/ticket
     */
    public static String ticket(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/ticket";
        return callHttpGet(url, baseReq);
    }

    /**
     * 获取市场行情列表
     * /openapi/noauth/contract/{apiKey}/tickets
     */
    public static String tickets(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/tickets";
        return callHttpGet(url, baseReq);
    }

    /**
     * 获取市场深度
     * /openapi/noauth/contract/{apiKey}/depthMarket
     */
    public static String depthMarket(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/depthMarket";
        return callHttpGet(url, baseReq);
    }

    /**
     * 获取交易信息(100条)
     * /openapi/noauth/contract/{apiKey}/tradeInfo
     */
    public static String tradeInfo(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/tradeInfo";
        return callHttpGet(url, baseReq);
    }

    /**
     * 获取K线数据(每个周期数据条数为1000条)
     * /openapi/noauth/contract/{apiKey}/kline
     */
    public static String kline(MarketrReq marketrReq){
        String url= HTTP_HOST + "/openapi/noauth/contract/"+APIKEY+"/kline";
        return callHttpPost(url, marketrReq);
    }

    /**
     * 委托下单
     * /openapi/auth/entrust/{apiKey}/order
     */
    public static String entrustOrder(EntrustOrderReq entrustOrderReq){
        String url= HTTP_HOST + "/openapi/auth/entrust/"+APIKEY+"/order";
        return callHttpPost(url, entrustOrderReq);
    }

    /**
     * 取消委托
     * /openapi/auth/entrust/{apiKey}/cancel
     */
    public static String entrustCancel(EntrustCancelReq entrustCancelReq){
        String url= HTTP_HOST + "/openapi/auth/entrust/"+APIKEY+"/cancel";
        return callHttpPost(url, entrustCancelReq);
    }

    /**
     * 获取委托订单详情
     * /openapi/auth/entrust/{apiKey}/detail
     * @return
     */
    public static String entrustDetail(EntrustDetailReq entrustDetailReq){
        String url= HTTP_HOST + "/openapi/auth/entrust/"+APIKEY+"/detail";
        return callHttpPost(url, entrustDetailReq);
    }

    /**
     * 获取成交订单详情
     * /openapi/auth/deal/{apiKey}/detail
     */
    public static String dealDetail(EntrustDetailReq entrustDetailReq){
        String url= HTTP_HOST + "/openapi/auth/deal/"+APIKEY+"/detail";
        return callHttpPost(url, entrustDetailReq);
    }

    /**
     * 委托单查询 (未完成订单,包括未成交和部分成交订单）
     * /openapi/auth/entrust/{apiKey}/query
     */
    public static String getEntrustList(PageReq pageParam){
        String url= HTTP_HOST + "/openapi/auth/entrust/"+APIKEY+"/query";
        return callHttpPost(url, pageParam);
    }

    /**
     * 委托成交查询（已完成订单,包括已成交和已撤单）
     * /openapi/auth/entrust/{apiKey}/queryDeal
     */
    public static String entrustQuery(PageReq pageParam){
        String url= HTTP_HOST + "/openapi/auth/entrust/"+APIKEY+"/queryDeal";
        return callHttpPost(url, pageParam);
    }

    /**
     * 获取账户余额
     * /openapi/auth/account/{apiKey}/base
     */
    public static String accountBase(BaseReq baseReq){
        String url= HTTP_HOST + "/openapi/auth/account/"+APIKEY+"/base";
        return callHttpPost(url, baseReq);
    }

    /**
     * 持仓单查询
     * /openapi/auth/position/{apiKey}/query
     */
    public static String getPositioniList(PageReq pageParam){
        String url= HTTP_HOST + "/openapi/auth/position/"+APIKEY+"/query";
        return callHttpPost(url, pageParam);
    }

    /**
     * 追加保证金
     * /openapi/auth/position/{apiKey}/deposit/add
     * @return
     */
    public static String depositAdd(PositionDepositReq positionDepositReq){
        String url= HTTP_HOST + "/openapi/auth/position/"+APIKEY+"/deposit/add";
        return callHttpPost(url, positionDepositReq);
    }

    /**
     * 获取成交记录列表
     * /openapi/auth/deal/{apiKey}/query
     * @return
     */
    public static String dealQuery(PageReq pageParam){
        String url= HTTP_HOST + "/openapi/auth/deal/"+APIKEY+"/query";
        return callHttpPost(url, pageParam);
    }

    /**
     * 调整杠杆倍数
     * /openapi/auth/position/{apiKey}/lever/incordec
     * @return
     */
    public static String leverIncordec(IncOrDecLeveReq incOrDecLeveReq){
        String url= HTTP_HOST + "/openapi/auth/position/"+APIKEY+"/lever/incordec";
        return callHttpPost(url, incOrDecLeveReq);
    }

    /**
     * 调用post
     * @param url
     * @param param
     * @return
     */
    private static String callHttpPost(String url,Object param){
        Map<String, String[]> stringObjectMap = BeanUtil.transBean2Map(param);
        StringBuffer paramBuffer = ApiKeyAuth.generateParam(stringObjectMap);
        String paramStr = ApiKeyAuth.generateSign(paramBuffer);
        return HttpUtil.sendPost(url, paramStr);
    }

    /**
     * 调用get
     * @param url
     * @param param
     * @return
     */
    private static String callHttpGet(String url,Object param){
        Map<String, String[]> stringObjectMap = BeanUtil.transBean2Map(param);
        StringBuffer paramBuffer = ApiKeyAuth.generateParam(stringObjectMap);
        String paramStr = ApiKeyAuth.generateSign(paramBuffer);
        return HttpUtil.sendGet(url, paramStr);
    }

}
