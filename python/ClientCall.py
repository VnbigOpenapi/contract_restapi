import urllib2
from urllib import urlencode
import json
import hashlib


def buildSign(params, secretKey):
    sign = ''
    for key in sorted(params.keys()):
        sign += key + '=' + str(params[key]) + '&'
    data = sign + 'secret_key=' + secretKey
    return hashlib.md5(data.encode("utf8")).hexdigest().upper()


def httpGet(url, resource, params=''):
    req = urllib2.Request(url='%s%s%s' % (url + resource, '?', params))
    res = urllib2.urlopen(req)
    res = res.read()
    return json.loads(res)


def httpPost(url, resource, params):
    headers = {
        "Content-type": "application/x-www-form-urlencoded",
    }
    url = url + resource
    params = urlencode(params)
    req = urllib2.Request(url=url, data=params, headers=headers)
    res = urllib2.urlopen(req)
    res = res.read()
    return res
