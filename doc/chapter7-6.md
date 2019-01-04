# 行情 API #
**获取交易信息**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/kline  |获取K线数据(每个周期数据条数为1000条)

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/kline
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [
		{
			"timestamp": "1505674568967",
			"open": "567.87",
			"high": "589.98",
			"low": "420.89",
			"close":"420",
			"volume":"787879"
		},
		{
			"timestamp": "1505674568967",
			"open": "567.87",
			"high": "589.98",
			"low": "420.89",
			"close":"420",
			"volume":"787879"
		},
		{
			"timestamp": "1505674568967",
			"open": "567.87",
			"high": "589.98",
			"low": "420.89",
			"close":"420",
			"volume":"787879"
		}
	]
}
</pre>

**返回值说明**
<pre>
timestamp(String):时间戳
open(String):开盘价
high(String):最高价
low(String):最低价
close(String):收盘价
volume(String):成交量
</pre>

**请求参数**

| 参数名       | 参数类型 | 必填 |                                       |
|:------------ |:-------- |:---- |:------------------------------------- |
| contractPair | String   | 是   | 交易对:CONTRACT_USD_BTC等             |
| cycle        | String   | 是   | 周期:1m,5m,15m,30m,1h,4h,6h,12h,1d,1w |
| num          | int      | 否   | 条数 默认1000条                       |
|api_key       | String   |是  |用户申请的apiKe           |
