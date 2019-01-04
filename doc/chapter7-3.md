# 行情 API #
**获取市场行情列表**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/tickets  | 获取市场行情列表

**示例**
<pre>
# Request
GET http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/tickets
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [{
		    "contractPair": "CONTRACT_USD_BTC",
			"timestamp": "1548657613457",
			"buy": "6437.25",
			"max": "6437.25",
			"latest": "6437.25",
			"exponent": "6437.25",
			"tag": "6437.25",
			"min": "6437.25",
			"sell": "6437.25",
			"volume": "6437.25",
			"applies": "7.25%"
		},{
		    "contractPair": "CONTRACT_USD_ETH",
			"timestamp": "1548657613457",
			"buy": "6437.25",
			"max": "6437.25",
			"latest": "6437.25",
			"exponent": "6437.25",
			"tag": "6437.25",
			"min": "6437.25",
			"sell": "6437.25",
			"volume": "6437.25",
			"applies": "7.25%"
		}
	]
}

</pre>

**返回值说明**
<pre>
contractPair(String):交易对
timestamp(String):时间戳
max(String):最高价
min(String):最低价
latest(String):最新成交价
exponent(String):指数价格
tag(String):标记价格
buy(String)：买一价
sell(String):卖一价
volume(String):成交量
applies(String):涨跌幅
</pre>

**请求参数**

| 参数名       	            |  参数类型       | 必填|描述
|:------------------------- |:-------------- |:----|:----------
|api_key                   | String            |是      |用户申请的apiKe
