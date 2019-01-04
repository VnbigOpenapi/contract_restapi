# 行情 API #
**获取市场行情**

| 接口        	            |  描述         
|:------------------------- |:-------------
| CONTRACT_X_Y_Z_TICKER | 订阅市场行情

websocket.send("{'event':'addChannel','channel':'CONTRACT_X_Y_Z_TICKER'}");

X的值为USD

Y的值为BTC,ETH等

Z的值为1m,5m,15m,30m,1h,4h,6h,12h,1d,1w

**示例**
<pre>
# Request
{'event':'addChannel','channel':'CONTRACT_USD_BTC_1m_TICKER'}			
# Response
{
	"channel": "CONTRACT_USD_BTC_1m_TICKER",
	"data": ["0.50000000", "0.66667000", "0.48288114", "0.33333000", "0.00000000", "1524189420000", "50.13087087"]
}
</pre>

**返回值说明**
<pre>
[买一价,最高价,最新成交价,指数价格，标记价格，资金费率，最低价,卖一价,时间戳,成交量]
[string,string,string,string,string,string,string,string,string,string]
</pre>