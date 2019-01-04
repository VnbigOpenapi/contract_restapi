# 行情 API #
**获取VNBIG合约市场支持合约对数据**

| 接口        	            |  描述
|:------------------------- |:-------------
| Get /openapi/noauth/contract/{apiKey}/bases  | 获取所有合约对

**示例**
<pre>
# Request
GET http://demo.contract.vnbig.com/openweb/openapi/noauth/contract/{apiKey}/bases
访问频率 2000次/60秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": [{
			"symbol": "CONTRACT_USD_BTC",
			"price_fixed": "10",
			"volume_fixed": "1"
		},
		{
			"symbol": "CONTRACT_USD_ETH",
			"price_fixed": "8",
			"volume_fixed": "1"
		}
	]
}

</pre>

**返回值说明**
<pre>
symbol(String)：交易对
price_fixed(String):价格小数位
volume_fixed(String):数量小数位
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKe
