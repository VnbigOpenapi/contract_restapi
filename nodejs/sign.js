/*
 *  签名工具
 * */
const md5 = require('crypto-js/md5')
const { secretKey, apiKey } = require('./config')

function sign(data) {
    data = data || {}
    data.api_key = apiKey
    const keys = Object.keys(data).sort((a, b) => {
        if (a < b) {
            return -1
        }
        if (a > b) {
            return 1
        }
        return 0
    })
    let str = ''
    keys.forEach((item) => {
        str += `&${item}=${data[item]}`
    })
    str += '&secret_key=' + secretKey
    data.sign = md5(str.substring(1)).toString().toUpperCase()
    return data
}

module.exports = sign

