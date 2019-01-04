# 行情 API #
**获取市场深度**

| 接口        	            |  描述         
|:------------------------- |:-------------
| CONTRACT_X_Y_DEPTH  | 订阅市场深度
websocket.send("{'event':'addChannel','channel':'CONTRACT_X_Y_DEPTH'}");

X的值为USD

Y的值为BTC,ETH等

**示例**
<pre>
# Request
{'event':'addChannel','channel':'CONTRACT_USD_BTC_DEPTH'}
# Response				
{
	"channel": "CONTRACT_USD_BTC_DEPTH",
	"data": {
		"timeStamp": "1524223631060",
		"buy": ["533", "1","40"],
		"sell":["500", "21","40"]
	}
}
</pre>

**返回值说明**
<pre>
timeStamp(String):时间戳
buy([String, String, String]):买方深度
sell([String, String, String]):卖方深度
</pre>