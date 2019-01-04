package com.vnbig.demo.req;

/**
 * @ClassName MarketrReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 20:38
 * @Version 1.0
 */
public class MarketrReq extends BaseReq {
    private String cycle; // 交易类型
    private Integer num;

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
