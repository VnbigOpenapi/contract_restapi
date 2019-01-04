# 行情 API #
**获取成交记录**

| 接口        	            |  描述         
|:------------------------- |:-------------
| CONTRACT_X_Y_TRADE  | 订阅成交记录
websocket.send("{'event':'addChannel','channel':'CONTRACT_X_Y_TRADE'}");

X的值为USD

Y的值为BTC,ETH等

**示例**
<pre>
# Request				
{'event':'addChannel','channel':'CONTRACT_USD_BTC_TRADE'}
# Response				
{
	"channel": "CONTRACT_USD_BTC_TRADE",
	"data": ["1524205173032", "0.44862981", "66.97725312", "754481753023397888", 1]
}
</pre>

**返回值说明**
<pre>
[时间戳,价格,数量,交易生成id,方向]
[string, string, string, string, int]
</pre>
