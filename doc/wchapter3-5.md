# 行情 API #
**获取市场行情列表**

| 接口        	            |  描述         
|:------------------------- |:-------------
| CONTRACT_TICKETLIST  | 订阅市场行情列表

websocket.send("{'event':'addChannel','channel':'CONTRACT_TICKETLIST'}");

**示例**
<pre>
# Request
{'event':'addChannel','channel':'CONTRACT_TICKETLIST'}			
# Response
{"channel":"CONTRACT_TICKETLIST","data"[["CONTRACT_USD_BTC","1528128000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","0.00000000","0.00000000"],["CONTRACT_USD_ETH","1528128000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","0.00000000","0.00000000"],["CONTRACT_USD_BCH","1528128000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","1.00000000","0.00000000","0.00000000"]]}
</pre>

**返回值说明**
<pre>
[交易对, 时间戳, 卖一价, 买一价, 最新价, 最高价, 最低价, 成交量]
[string, string, string, string, string, string, string, string]
</pre>