# 行情 API #
**获取VNBIG合约市场最新行情数据**

| 接口        	            |  描述
|:------------------------- |:-------------
|[Get /openapi/noauth/contract/{apiKey}/bases](chapter7-1.md)  	|获取所有合约对

# 交易 API #
| 接口        	            |  描述
|:------------------------- |:-------------
|[Get /openapi/noauth/contract/{apiKey}/ticket](chapter7-2.md)    | 获取市场行情 |
|[Get /openapi/noauth/contract/{apiKey}/tickets](chapter7-3.md)   |获取市场行情列表 |
|[Get /openapi/noauth/contract/{apiKey}/depthMarket](chapter7-4.md)   |获取市场深度   |
|[Get /openapi/noauth/contract/{apiKey}/tradeInfo](chapter7-5.md)   |获取交易信息|
|[Post /openapi/noauth/contract/{apiKey}/kline](chapter7-6.md)   |获取K线数据|

**用于VNBIG快速进行交易**

| 接口        	            |  描述
|:------------------------- |:-------------
|[Post /openapi/auth/entrust/{apiKey}/order](chapter7-7.md)    | 委托下单
|[Post /openapi/auth/entrust/{apiKey}/cancel](chapter7-8.md)   |取消委托   |
|[Post /openapi/auth/entrust/{apiKey}/detail](chapter7-9.md)   |获取委托单详情   |
|[Post /openapi/auth/deal/{apiKey}/query](chapter7-16.md)   |获取成交记录列表   |
|[Post /openapi/auth/deal/{apiKey}/detail](chapter7-10.md)   |获取成交详情   |
|[Post /openapi/auth/account/{apiKey}/base](chapter7-13.md)   |获取账户余额   |
|[Post /openapi/auth/position/{apiKey}/deposit/add](chapter7-15.md)   |追加保证金   |

注：**所有URL占位符"{apiKey}"填入api_key参数**
