# *contract_restapi* #
合约的客户端调用接口说明，目前只提供C# 、Java、NodeJs、Python
 
 模拟环境地址：  
   open api：https://democontract.vnbig.com/openweb  
   open socket：wss://demoopensocket.vnbig.com
 
 正式环境：  
   open api：https://contract.vnbig.com/openweb  
   open socket：wss://prodopensocket.vnbig.com

# *合约API概述* #

VNBIG为用户提供了一整套简单而又强大的开发工具，旨在帮助用户快速、高效地将VNBIG交易功能整合到自己的应用当中。

VNBIG接口是提供服务的基础，开发者在VNBIG网站创建账号后，可以根据自身需求建立不同权限的API，并利用API进行自动交易或者提现。

通过API可以快速实现以下功能：

•获取交易对

•获取市场行情

•获取K线数据(每个周期数据条数为1000条)


获取接口权限后，可以通过阅读本接口文档来帮助开发。

如果您在使用过程中遇到任何问题，请联系API技术讨论QQ群： 774185245，我们将在第一时间为您做出解答。
# *合约API目录* #
* [合约API概述](/doc/README.md)
* [调用模式](/doc/chapter1.md)
* [开启API](/doc/chapter2.md)
* [参数签名](/doc/chapter3.md)
* [更新日志](/doc/chapter4.md)

REST API
* [开始使用](/doc/chapter5.md)
* [请求交互](/doc/chapter6.md)
* [API参考](/doc/chapter7.md)
* [获取所有交易对](/doc/chapter7-1.md)
* [获取市场行情](/doc/chapter7-2.md)
* [获取市场行情列表](/doc/chapter7-3.md)
* [获取市场深度](/doc/chapter7-4.md)
* [获取交易信息](/doc/chapter7-5.md)
* [获取交易信息](/doc/chapter7-6.md)
* [委托下单](/doc/chapter7-7.md)
* [取消委托](/doc/chapter7-8.md)
* [调整杠杆倍数](/doc/chapter7-17.md)
* [获取委托订单详情](/doc/chapter7-9.md)
* [获取成交记录列表](/doc/chapter7-16.md)
* [获取成交详情](/doc/chapter7-10.md)
* [获取委托记录](/doc/chapter7-11.md)
* [获取成交记录](/doc/chapter7-12.md)
* [获取账户余额](/doc/chapter7-13.md)
* [获取持仓记录](/doc/chapter7-14.md)
* [追加保证金](/doc/chapter7-15.md)

WebSocket API
* [获取市场行情](/doc/wchapter3-1.md)
* [获取市场深度](/doc/wchapter3-2.md)
* [获取成交记录](/doc/wchapter3-3.md)
* [获取持仓记录](/doc/wchapter3-4.md)
* [获取市场行情列表](/doc/wchapter3-5.md)
