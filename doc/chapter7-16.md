# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/deal/{apiKey}/query   | 获取成交记录列表

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/deal/{apiKey}/query
访问频率 20次/2秒
# Response
{
  "code": "11001",
  "msg": "处理成功",
  "data": {
    "pageIndex": 1,
    "count": 1,
    "list": [
      {
        "dealId": "fabe1765ab084578b47bfffa20886c0c",
        "dealPrice": "3300.00000000000000000000",
        "dealQuantity": "10.00000000000000000000",
        "direction": "1",
        "dealWay": "1",
        "dealFeeType": "taker",
        "dealFee": "0.00000227272727272727"
      }
    ]
  }
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据

dealId(String)：成交id
dealPrice(BigDecimal)：成交价
dealQuantity(BigDecimal)：成交数量
direction(Integer)：方向 1:买多,-1:卖空
dealWay(Integer): 成交方式 1:开仓 -1:平仓
dealFeeType(String): 成交佣金类型 maker,taker
dealFee(BigDecimal)：手续费
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair              | String            |是      |交易对:CONTRACT_USD_BTC等
|sign                      | String            |是      |请求参数的签名
|size|Integer|否|页面大小 默认100|
