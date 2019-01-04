using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace VnbigFutAPI
{
    public class util
    {
        public static string createLinkString(Dictionary<string, string> paras)
        {
            List<string> keys = new List<string>(paras.Keys);
            var paraSort = from objDic in paras orderby objDic.Key ascending select objDic;
            string prestr = "";
            int i = 0;
            foreach (KeyValuePair<string, string> kvp in paraSort)
            {
                if (i == keys.Count() - 1)
                {
                    // 拼接时，不包括最后一个&字符
                    prestr = prestr + kvp.Key + "=" + kvp.Value;
                }
                else
                {
                    prestr = prestr + kvp.Key + "=" + kvp.Value + "&";
                }
                i++;
                if (i == keys.Count())
                {
                    break;
                }
            }
            return prestr;
        }

        public static string getParam(Dictionary<string, string> param)
        {
            string prestr = "";
            int i = 0;
            List<string> keys = new List<string>(param.Keys);
            foreach (KeyValuePair<string,string> kvp in param)
            {
                if (i == keys.Count() - 1)
                {
                    // 拼接时，不包括最后一个&字符
                    prestr = prestr + kvp.Key + "=" + kvp.Value;
                }
                else
                {
                    prestr = prestr + kvp.Key + "=" + kvp.Value + "&";
                }
                i++;
                if (i == keys.Count())
                {
                    break;
                }
            }
            return prestr;
        }

        private static char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        public static String getMD5String(String str)
        {

            if (str == null || str.Trim().Length == 0)
            {
                return "";
            }
            byte[] bytes = System.Text.Encoding.Default.GetBytes(str);
            MD5CryptoServiceProvider md = new MD5CryptoServiceProvider();
            bytes = md.ComputeHash(bytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.Length; i++)
            {
                sb.Append(HEX_DIGITS[(bytes[i] & 0xf0) >> 4] + ""
                        + HEX_DIGITS[bytes[i] & 0xf]);
            }
            return sb.ToString();
        }
    }
}
