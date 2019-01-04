# 如何对请求参数进行签名 #

用户提交的参数除sign外，都要参与签名。

首先，将待签名字符串要求按照参数名进行排序(首先比较所有参数名的第一个字母，按abcd顺序排列，若遇到相同首字母，则看第二个字母，以此类推)。

例如：对于如下的参数进行签名

string[] parameters={"api_key=c821db84-6fbd-11e4-a9e3-c86000d26d7c","symbol=btc_cny","type=buy","price=680","amount=1.0"}; 生成待签名的字符串 amount=1.0&api_key=c821db84-6fbd-11e4-a9e3-c86000d26d7c&price=680&symbol=btc_cny&type=buy

然后，将待签名字符串添加私钥参数生成最终待签名字符串。

例如：

amount=1.0&api_key=c821db84-6fbd-11e4-a9e3-c86000d26d7c&price=680&symbol=btc_cny&type=buy&secret_key=secretKey

注意，"&secret_key=secretKey"为签名必传参数。

最后，是利用32位MD5算法，对最终待签名字符串进行签名运算，从而得到签名结果字符串(该字符串赋值于参数sign)，MD5计算结果中字母全部大写。