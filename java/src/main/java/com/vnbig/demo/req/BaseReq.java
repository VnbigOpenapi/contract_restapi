package com.vnbig.demo.req;

import com.vnbig.demo.util.CfgPropertiesUtil;

/**
 * @ClassName BaseReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 13:16
 * @Version 1.0
 */
public class BaseReq {
    private String api_key = CfgPropertiesUtil.get("apiKey"); // 秘钥
    private String userId = CfgPropertiesUtil.get("userId"); // 用户ID
    private String contractPair = CfgPropertiesUtil.get("contractPair"); // 交易对

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContractPair() {
        return contractPair;
    }

    public void setContractPair(String contractPair) {
        this.contractPair = contractPair;
    }
}
