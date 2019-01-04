package com.vnbig.demo.ws;

import com.vnbig.demo.auth.WsApiAuth;
import com.vnbig.demo.util.CfgPropertiesUtil;
import com.vnbig.demo.util.MD5Util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @ClassName WsMain
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 16:42
 * ws://10.10.11.178:7090/socket.io/?EIO=3&transport=websocket&sid=03c6ab91-1e07-49cf-acdc-3a9356f574d9
 * @Version 1.0
 */
public class WsMain {

    private static final String WS_HOST = CfgPropertiesUtil.get("ws_host");
    private static final String APIKEY = CfgPropertiesUtil.get("apiKey");
    private static final String SIGN = WsApiAuth.getWsSign();
    private static final String USD = "USD";
    private static final String BTC = "BTC";
    private static final String ETH = "ETH";

    public static void main(String[] args) {
        try {
            // 建立连接
            final WsClient clientEndPoint = new WsClient(new URI(WS_HOST));
            // 监听
            clientEndPoint.addMessageHandler(new WsClient.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);

                }
            });
            // 订阅市场行情 X 的值为USD Y 的值为BTC,ETH等 Z 的值为1m,5m,15m,30m,1h,4h,6h,12h,1d,1w
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'CONTRACT_"+USD+"_"+BTC+"_"+"1m"+"_TICKER'}");
            // 获取市场深度 X 的值为USD Y 的值为BTC,ETH等
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'CONTRACT_"+USD+"_"+ETH+"_DEPTH'}"); // TODO
            // 获取成交记录 X 的值为USD Y 的值为BTC,ETH等
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'CONTRACT_"+USD+"_"+BTC+"_TRADE'}");
            // 获取持仓记录 X 的值为apiKey等 Y 的值为签名
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'CONTRACT_"+APIKEY+"_"+SIGN+"_POSITIONRECORD'}"); // TODO
            // 获取市场行情列表
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'CONTRACT_TICKETLIST'}"); // TODO

            // 阻塞程序
            System.in.read();
        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
