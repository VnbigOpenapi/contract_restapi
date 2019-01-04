# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/entrust/{apiKey}/order   | 委托下单

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/entrust/{apiKey}/order
访问频率 20次/2秒
# Response
{
  "code": "11001",
  "msg": "处理成功",
  "data": {
    "entrustId": "746448047167848448"
  }
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据
entrustId(String)：订单号
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|tradeType               |Integer            |是      |买卖类型： 限价单（1） 市价单（2）计划委托单（3）
|direction               |Integer  |是   | 委托方向 买（1）卖（-1）          |
|quantity               | BigDecimal           |是     | 委托数量（注意合约对数量小数位限制）  |
|price                     | BigDecimal        |否      |委托价格 （注意合约对价格小数位限制）市价单可不填
|triggerPrice   |BigDecimal   |否   |触发价格 计划委托单必填   |
|sign                      | String            |是      |请求参数的签名
