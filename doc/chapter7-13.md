# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/account/{apiKey}/base   | 获取账户余额

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/account/{apiKey}/base
访问频率 6次/2秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": {
		"balance": "3165",
		"freeze": "10.36"
	}
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据

balance(BigDecimal)：账户余额
freeze(BigDecimal)：冻结金额
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|sign                      | String            |是      |请求参数的签名
