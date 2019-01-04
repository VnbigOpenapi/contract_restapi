package com.vnbig.demo.req;

/**
 * @ClassName EntrustDetailReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 20:43
 * @Version 1.0
 */
public class EntrustDetailReq extends BaseReq {
    private String entrustNo;

    public EntrustDetailReq(String entrustNo) {
        this.entrustNo = entrustNo;
    }

    public String getEntrustNo() {
        return entrustNo;
    }

    public void setEntrustNo(String entrustNo) {
        this.entrustNo = entrustNo;
    }
}
