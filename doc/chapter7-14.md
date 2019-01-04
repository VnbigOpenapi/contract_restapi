# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/position/{apiKey}/query   | 获取持仓记录

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/position/{apiKey}/query
访问频率 20次/2秒
# Response
{
    "code": "11001",
    "msg": "处理成功",
    "data": {
        "pageIndex": 0,
        "count": 2,
        "list": [
            "contractPair": "CONTRACT_USD_BTC",
            "direction": 1,
            "openQuantity": "32.00000000000000000000",
            "openAvgPrice": "17.49999999999999999989",
            "contractValue": "1.82857142857142857142",
            "occupyDeposit": "0.91428571428571428572",
            "leverageMultiple": "2",
            "forceClearPrice": "11.71446488294314381273",
            "profitLoss": "0.00000000000000000000",
            "unDealAmt": "1.7144648829",
            "createTime":"2018/9/26/15:23"
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
openQuantity(String)：仓位数量((张)
openAvgPrice(String)：开仓价格
contractValue(String)：合约价值
occupyDeposit(String)：占用保证金
leverageMultiple(String)：杠杆倍数
forceClearPrice(String)：强平价格
profitLoss(String)：已实现盈亏
unDealAmt(String)：未实现盈亏
createTime(String)：创建时间
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|sign                      | String            |是      |请求参数的签名
|size                      | String            |是      |页大小
