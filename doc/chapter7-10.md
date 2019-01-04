# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/deal/{apiKey}/detail   | 获取成交订单详情

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/deal/{apiKey}/detail
访问频率 20次/2秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": {
		"orderNo": "000cedb4f63c45ebbcc4a46da4b005f4",
		"direction": "1",
		"dealQuantity": "10",
		"dealPrice": "3165",
		"dealFee": "10.36"
	}
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据

dealId(String)：订单单号
direction(Integer)：方向 买多（1）卖空（-1）
dealQuantity(BigDecimal)：成交数量
dealPrice(BigDecimal)：成交均价
dealFee(BigDecimal)：手续费
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|dealId               |String            |是      |订单单号
|sign                      | String            |是      |请求参数的签名
