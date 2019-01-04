# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/entrust/{apiKey}/cancel   | 取消委托

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/entrust/{apiKey}/cancel
访问频率 20次/2秒
# Response
{
  "code": "11002",
  "msg": "请求处理中",
  "data": ""
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|entrustNo               |String            |是      |委托单号
|sign                      | String            |是      |请求参数的签名
