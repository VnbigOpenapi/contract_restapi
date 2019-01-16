# **接口调用方式说明** #

VNBIG为用户提供了二种调用接口的方式，开发者可根据自己的使用场景和偏好选择适合自己的方式来查询行情、进行交易或深度等。

[REST API](chapter5.md)

REST，即Representational State Transfer的缩写，是目前最流行的一种互联网软件架构。它结构清晰、符合标准、易于理解、扩展方便，正得到越来越多网站的采用。其优点如下：

1. 在RESTful架构中，每一个URL代表一种资源；
2. 客户端和服务器之间，传递这种资源的某种表现层；
3. 客户端通过四个HTTP指令，对服务器端资源进行操作，实现“表现层状态转化”。

建议开发者使用REST API进行现货交易或者资产提现等操作。

[WebSocket API](wchapter1.md)

WebSocket是HTML5一种新的协议(Protocol)。它实现了客户端与服务器全双工通信，使得数据可以快速地双向传播。通过一次简单的握手就可以建立客户端和服务器连接，服务器根据业务规则可以主动推送信息给客户端。其优点如下：

1. 客户端和服务器进行数据传输时，请求头信息比较小，大概2个字节;
2. 客户端和服务器皆可以主动地发送数据给对方；
3. 不需要多次创建TCP请求和销毁，节约宽带和服务器的资源。

强烈建议开发者使用WebSocket API获取市场行情和买卖深度等信息。