# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/position/{apiKey}/lever/incordec   | 调整杠杆倍数

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/position/{apiKey}/lever/incordec
访问频率 1次/3秒
# Response
{
  "code": "11001",
  "msg": "处理成功",
  "data": {}
}
</pre>

**返回值说明**
<pre>

</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|sign                      | String            |是      |请求参数的签名
|contractPair              | String            |是      |交易对:CONTRACT_USD_BTC等
|leverageMultiple          | Integer           |是      |杠杆倍数 1 2 3 5 10 25 50 100
