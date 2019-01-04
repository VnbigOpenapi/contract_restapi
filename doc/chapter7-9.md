# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/entrust/{apiKey}/detail   | 获取委托订单详情

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/entrust/{apiKey}/detail
访问频率 20次/2秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
	"data": {
		"entrustNo": "41ab4937c9674f3ebca6a0d48620e2c4",
		"direction": "1",
		"createTime": "2018-10-10 10:10:10",
		"entrustQuantity": "8",
		"entrustPrice": "2365",
		"entrustDeposit": "2.36541",
		"dealQuantity": "4",
		"dealAvgPrice": "2364.8",
		"entrustType": "1",
		"triggerPrice": "",
		"leverageMultiple": "10",
		"status": "1"
	}
}
</pre>

**返回值说明**
<pre>
code(String)：返回结果编码
msg(String)：返回结果描述
data(String)：返回数据

entrustNo(String)：委托单号
direction(Integer)：方向 买多（1）卖空（-1）
createTime(String)：委托时间 yyyy-MM-dd HH:mm:ss
entrustQuantity(BigDecimal)：委托数量
entrustPrice(BigDecimal)：委托价格
entrustDeposit(BigDecimal)：委托保证金
dealQuantity(BigDecimal)：成交数量
dealAvgPrice(BigDecimal)：成交均价
entrustType(Integer)：委托类型 1:限价,2:市价,3:计划委托
triggerPrice(BigDecimal)：触发价格
leverageMultiple(Integer)：杠杆倍数
status(Integer)：状态 1:进行中,2:部分成交 3:全部成交 4:取消 5.待处理
</pre>

**请求参数**

| 参数名       	           |      参数类型      |   必填  |描述
|:-------------------------|:-----------------:|:--------:|:----------
|api_key                   | String            |是      |用户申请的apiKey
|contractPair                    | String            |是      |交易对:CONTRACT_USD_BTC等
|entrustNo               |String            |是      |委托单号
|sign                      | String            |是      |请求参数的签名
