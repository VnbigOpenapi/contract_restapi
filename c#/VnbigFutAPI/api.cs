using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VnbigFutAPI
{
    public class api
    {
        private static string rest_url = "http://demo.contract.vnbig.com/openweb";
        private static string api_key = "api_key";
        private static string secret_key = "secret_key";

        #region Public API
        /// <summary>
        /// 获取所有交易对
        /// </summary>
        /// <returns></returns>
        public static string contract()
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("api_key", api_key);
            return http.Get(rest_url + "/openapi/noauth/contract/" + api_key + "/bases", util.getParam(mParam));
        }

        /// <summary>
        /// 获取市场行情
        /// </summary>
        /// <returns></returns>
        public static string ticket(string contractPair)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("api_key", api_key);
            mParam.Add("contractPair", contractPair);
            return http.Get(rest_url + "/openapi/noauth/contract/" + api_key + "/ticket", util.getParam(mParam));
        }

        /// <summary>
        /// 获取市场深度
        /// </summary>
        /// <returns></returns>
        public static string depth(string contractPair)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("api_key", api_key);
            mParam.Add("contractPair", contractPair);
            return http.Get(rest_url + "/openapi/noauth/contract/" + api_key + "/depthMarket", util.getParam(mParam));
        }
        #endregion

        #region Private API
        /// <summary>
        /// 获取账户余额
        /// </summary>
        /// <returns></returns>
        public static string account(string contractPair)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("contractPair", contractPair);
            return sign(mParam, rest_url, "/openapi/auth/account/" + api_key + "/base", api_key, secret_key);
        }

        /// <summary>
        /// 委托下单
        /// </summary>
        /// <returns></returns>
        public static string placeOrder(string contractPair, string tradeType, string direction, string quantity, string price)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("contractPair", contractPair);
            mParam.Add("tradeType", tradeType);
            mParam.Add("direction", direction);
            mParam.Add("quantity", quantity);
            mParam.Add("price", price);
            return sign(mParam, rest_url, "/openapi/auth/entrust/" + api_key + "/order", api_key, secret_key);
        }

        /// <summary>
        /// 取消委托
        /// </summary>
        /// <returns></returns>
        public static string cancel(string contractPair, string entrustNo)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("contractPair", contractPair);
            mParam.Add("entrustNo", entrustNo);
            return sign(mParam, rest_url, "/openapi/auth/entrust/" + api_key + "/cancel", api_key, secret_key);
        }

        /// <summary>
        /// 获取委托记录
        /// </summary>
        /// <param name="contractPair"></param>
        /// <param name="size"></param>
        /// <returns></returns>
        public static string query(string contractPair, string size)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("contractPair", contractPair);
            mParam.Add("size", size);
            return sign(mParam, rest_url, "/openapi/auth/entrust/" + api_key + "/query", api_key, secret_key);
        }

        /// <summary>
        /// 获取成交记录
        /// </summary>
        /// <param name="contractPair"></param>
        /// <param name="size"></param>
        /// <returns></returns>
        public static string queryDeal(string contractPair, string size)
        {
            Dictionary<string, string> mParam = new Dictionary<string, string>();
            mParam.Add("contractPair", contractPair);
            mParam.Add("size", size);
            return sign(mParam, rest_url, "/openapi/auth/entrust/" + api_key + "/queryDeal", api_key, secret_key);
        }
        #endregion

        public static string sign(Dictionary<string, string> mParam, string mUrl, string mAction, string apiKey, string secretKey)
        {
            mParam.Add("api_key", apiKey);
            string mPre = util.createLinkString(mParam);
            string mSign = mPre + "&secret_key=" + secretKey;
            string mMd5 = util.getMD5String(mSign);
            mPre += "&sign=" + mMd5;
            return http.requestHttpPost(mUrl, mAction, mPre);
        }
    }
}
