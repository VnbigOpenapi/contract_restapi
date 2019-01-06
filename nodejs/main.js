const rp = require('request-promise')
const sign = require('./sign')
const { apiKey, apiUrl } = require('./config')

function request(opt) {
    opt.path = opt.path.replace('{apiKey}', apiKey)
    opt.qs = Object.assign({
        api_key: apiKey,
    }, opt.qs)

    const options = Object.assign({
        uri: apiUrl + opt.path,
        method: 'GET',
        headers: {
            contentType: 'application/x-www-form-urlencoded;charset=UTF-8'
        },
        json: true,
    }, opt)

    return rp(options)
}
// 请求合约对
request({
    path: '/noauth/contract/{apiKey}/bases',
})
    .then((res) => {
        console.log(res)
    })
    .catch((err) => {
        console.log(err)
    })

// 获取市场行情
request({
    path: '/noauth/contract/{apiKey}/ticket',
    qs: {
        contractPair: 'CONTRACT_USD_BTC',
    }
})
    .then((res) => {
        console.log(res)
    })
    .catch((err) => {
        console.log(err)
    })


// 下单
request({
    path: '/auth/entrust/{apiKey}/order',
    method: 'POST',
    qs: sign({
        contractPair: 'CONTRACT_USD_BTC',
        tradeType: 1,
        direction: 1,
        quantity: 2,
        price: 3880,
        leverageMultiple: 10,
    }),
})
    .then((res) => {
        console.log(res)
    })
    .catch((err) => {
        console.log(err)
    })
