package com.vnbig.demo.req;

/**
 * @ClassName EntrustCancelReq
 * @Description 取消订单请求参数
 * @Author jiangyunpeng
 * @Date 2018/12/27 15:51
 * @Version 1.0
 */
public class EntrustCancelReq extends BaseReq {
    private String entrustNo;

    public String getEntrustNo() {
        return entrustNo;
    }

    public void setEntrustNo(String entrustNo) {
        this.entrustNo = entrustNo;
    }
}
