# 交易 API #
**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
| Post /openapi/auth/position/{apiKey}/deposit/add   | 追加保证金

**示例**
<pre>
# Request
POST http://demo.contract.vnbig.com/openweb/openapi/auth/position/{apiKey}/deposit/add
访问频率 6次/2秒
# Response
{
	"code": "11001",
	"msg": "处理成功",
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
|positionId                    | String            |是      |持仓单号
|quantity   |Bigdecimal   |是   |追加保证金数量   |
|sign                      | String            |是      |请求参数的签名
