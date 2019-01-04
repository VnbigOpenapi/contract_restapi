# 行情 API #
**获取交易信息**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/tradeInfo  | 获取交易信息(100条)

**示例**
<pre>
# Request
GET http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/tradeInfo
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [
		{
			"timestamp": "1505674568967",
			"latest": "567.87",
			"latestNumber": "42",
			"direction":1
		},
		{
			"timestamp": "1505674568967",
			"latest": "567.87",
			"latestNumber": "42",
			"direction":1
		},
		{
			"timestamp": "1505674568967",
			"latest": "567.87",
			"latestNumber": "42",
			"direction":-1
		}
	]
}
</pre>

**返回值说明**
<pre>
timestamp(String):时间戳
latest(String):最新成交价
latestNumber(string):交易生成id
direction(int):方向 买:1，卖:-1
</pre>

**请求参数**

| 参数名       | 参数类型 | 必填 | 描述                      |
|:------------ |:-------- |:---- |:------------------------- |
| contractPair | String   | 是   | 交易对:CONTRACT_USD_BTC等 |
|api_key                   | String            |是      |用户申请的apiKe
