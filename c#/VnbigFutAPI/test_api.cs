using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceProcess;
using System.Text;
using System.Threading.Tasks;

namespace VnbigFutAPI
{
    static class test_api
    {
        /// <summary>
        /// 应用程序的主入口点。
        /// </summary>
        static void Main()
        {
            string mJson = string.Empty;
            //获取市场行情
            mJson = api.ticket("CONTRACT_USD_BTC");
            //获取账户余额
            //mJson = api.account("CONTRACT_USD_BTC");
            //委托下单
            //mJson = api.placeOrder("CONTRACT_USD_BTC", "1", "1", "10000", "3550");
        }
    }
}
