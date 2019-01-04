# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/entrust/{apiKey}/query   | 委托单查询（未完成订单,包括未成交和部分成交订单）

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/entrust/{apiKey}/query
访问频率 20次/2秒
# Response
{
    "code": "11001",
    "msg": "处理成功",
    "data": {
        "pageIndex": 0,
        "count": 2,
        "list": [
            {
                "contractPair": "CONTRACT_USD_BTC",
                "direction": "-1",
                "entrustType": "1",
                "entrustQuantity": "14.00000000000000000000",
                "createTime": "2018/11/01 14:19",
                "dealAvgPrice": "111.00000000000000000000",
                "dealQuantity": "0.00000000000000000000",
                "entrustId": "da363887f2bd4f7f9a0a77ad7d974ad9",
                "entrustPrice": "1.00000000000000000000",
                "status": "2"
                "leverageMultiple": "100",
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

contractPair(String)：交易对
direction(String)：方向 买多（1）卖空（-1）
entrustType(String)：委托类型:1:限价,2:市价,3:计划委托
entrustQuantity(String)：委托数量
createTime(String)：委托时间
dealAvgPrice(String)：平均成交价
dealQuantity(String)：成交数量
entrustId(String)：委托订单ID
entrustPrice(String)：委托价格
status(String)：订单状态
leverageMultiple(String)：杠杆倍数
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair              | String            |是      |交易对:CONTRACT_USD_BTC等
|sign                      | String            |是      |请求参数的签名
|size                      | int            |是      |记录条数
