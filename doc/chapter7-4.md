# 行情 API #
**获取市场深度**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/depthMarket | 获取市场深度(20条)

**示例**
<pre>
# Request
GET http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/depthMarket
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [
		"buy": [
		{
			"price": "533",
			"entrustNumber": 1,
			"entrustQuantity": "42"
		},
		{
			"price": "511",
			"entrustNumber": 2,
			"entrustQuantity": "12"
		},
		{
			"price": "510",
			"entrustNumber": 2,
			"entrustQuantity": "52"
		}
		],
		"sell": [
		{
			"price": "500",
			"entrustNumber": 1,
			"entrustQuantity": "42"
		},
		{
			"price": "501",
			"entrustNumber": 2,
			"entrustQuantity": "12"
		},
		{
			"price": "502",
			"entrustNumber": 2,
			"entrustQuantity": "52"
		}
		],
		"timestamp":"1503245607543"
	]
}

</pre>

**返回值说明**
<pre>
buy(String):买方深度
sell(String):卖方深度
timestamp(String):时间戳
price(string):委托价格
entrustNumber(string):仓位数量
entrustQuantity(string):总量

</pre>

**请求参数**

| 参数名       | 参数类型 | 必填 | 描述                      |
|:------------ |:-------- |:---- |:------------------------- |
| contractPair | String   | 是   | 交易对:CONTRACT_USD_BTC等 |
|api_key                   | String            |是      |用户申请的apiKe
