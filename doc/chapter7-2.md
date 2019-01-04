# 行情 API #
**获取市场行情**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/ticket  | 获取市场行情

**示例**
<pre>
# Request
GET http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/ticket
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [{
			"buy": "6437.25",
			"max": "6437.25",
			"latest": "6437.25",
			"exponent": "6437.25",
			"tag": "6437.25",
			"fundsRate": "6437.25",
			"min": "6437.25",
			"sell": "6437.25",
			"timestamp": "1548657613457",
			"volume": "6437.25"
		}
	]
}

</pre>

**返回值说明**
<pre>
buy(String)：买一价
max(String):最高价
latest(String):最新成交价
exponent(String):指数价格
tag(String):标记价格
fundsRate(String):资金费率
min(String):最低价
sell(String):卖一价
timestamp(String):时间戳
volume(String):成交量
</pre>

**请求参数**

| 参数名       | 参数类型 | 必填 | 描述                      |
|:------------ |:-------- |:---- |:------------------------- |
| contractPair | String   | 是   | 交易对:CONTRACT_USD_BTC等 |
|api_key                   | String            |是      |用户申请的apiKe
