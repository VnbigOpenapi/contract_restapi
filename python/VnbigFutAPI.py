# encoding: utf-8
from ClientCall import buildSign, httpGet, httpPost


class VnbigFutAPI:
    def __init__(self, url, apikey, secretkey):
        self.url = url
        self.apikey = apikey
        self.secretkey = secretkey

    def sign(self, params):
        params['api_key'] = self.apikey
        params['sign'] = buildSign(params, self.secretkey)
        return params

    # -------------------------------------------Public API-----------------------------------------------------------
    def contract(self):
        """获取所有交易对"""
        action = '/openapi/noauth/contract/' + self.apikey + '/bases'
        return httpGet(self.url, action, 'api_key=' + self.apikey)

    def ticket(self, contractPair):
        """获取市场行情"""
        action = '/openapi/noauth/contract/' + self.apikey + '/ticket'
        return httpGet(self.url, action, 'api_key=' + self.apikey + '&contractPair=' + contractPair)

    def depth(self, contractPair):
        """获取市场深度"""
        action = '/openapi/noauth/contract/' + self.apikey + '/depthMarket'
        return httpGet(self.url, action, 'api_key=' + self.apikey + '&contractPair=' + contractPair)

    # -------------------------------------------Public API-----------------------------------------------------------

    # -------------------------------------------Private API-----------------------------------------------------------
    def account(self, contractPair):
        """获取账户余额"""
        action = "/openapi/auth/account/" + self.apikey + "/base"
        params = {}
        params['contractPair'] = contractPair
        params = self.sign(params)
        return httpPost(self.url, action, params)

    def placeOrder(self, contractPair, tradeType, direction, quantity, price):
        """委托下单"""
        action = "/openapi/auth/entrust/" + self.apikey + "/order"
        params = {}
        params['contractPair'] = contractPair
        params['tradeType'] = tradeType
        params['direction'] = direction
        params['quantity'] = quantity
        params['price'] = price
        params = self.sign(params)
        return httpPost(self.url, action, params)

    def cancel(self, contractPair, entrustNo):
        """取消委托"""
        action = "/openapi/auth/entrust/" + self.apikey + "/cancel"
        params = {}
        params['contractPair'] = contractPair
        params['entrustNo'] = entrustNo
        params = self.sign(params)
        return httpPost(self.url, action, params)

    def query(self, contractPair, size):
        """获取委托记录"""
        action = "/openapi/auth/entrust/" + self.apikey + "/query"
        params = {}
        params['contractPair'] = contractPair
        params['size'] = size
        params = self.sign(params)
        return httpPost(self.url, action, params)

    def queryDeal(self, contractPair, size):
        """获取成交记录"""
        action = "/openapi/auth/entrust/" + self.apikey + "/queryDeal"
        params = {}
        params['contractPair'] = contractPair
        params['size'] = size
        params = self.sign(params)
        return httpPost(self.url, action, params)
    # -------------------------------------------Private API-----------------------------------------------------------


apikey = 'apikey'
secretkey = 'secretkey'
url = 'http://p.contract.vnbig.com/openweb'
mApi = VnbigFutAPI(url, apikey, secretkey)

# print(mApi.depth('CONTRACT_USD_BTC'))
# print(mApi.account('CONTRACT_USD_BTC'))
# print(mApi.placeOrder('CONTRACT_USD_BTC', '1', '1', '100', '3550'))
# print(mApi.queryDeal('CONTRACT_USD_BTC', '50'))
