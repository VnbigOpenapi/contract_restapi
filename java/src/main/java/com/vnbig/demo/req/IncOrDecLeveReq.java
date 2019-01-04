package com.vnbig.demo.req;

/**
 * @ClassName IncOrDecLeveReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 20:49
 * @Version 1.0
 */
public class IncOrDecLeveReq extends BaseReq {
    private Integer leverageMultiple; // 杠杆倍数 1 2 3 5 10 25 50 100

    public IncOrDecLeveReq(Integer leverageMultiple) {
        this.leverageMultiple = leverageMultiple;
    }
}
