**WebSocket服务连接地址：ws://161.117.142.212:8090** 

# 发送请求 #


请求数据格式为：{'event':'addChannel','channel':'channelValue'}

其中event: addChannel(注册请求数据)/removeChannel(注销请求数据)

channel：vnibig提供请求数据类型

例如：websocket.send("{'event':'addChannel','channel':'CONTRACT_USD_BTC_1m_TICKER'}")

{'event':'addChannel','channel':'CONTRACT_USD_BTC_1m_TICKER'}]");

# 服务器响应 #
返回数据格式为： [{"channel":"channel","data":{}}

channel:请求的数据类型

data：返回结果数据

# 错误代码说明 #

| 错误代码       | 详细描述           
| ------------- |:-------------
| 20000         | 数据事件类型无效
| 20001         | JSON格式错误      
| 20002         | 参数错误      
| 20003         | 数据订阅类型无效
| 20004         | 交易对不存在
