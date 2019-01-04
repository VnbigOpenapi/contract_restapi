package com.vnbig.demo.req;

/**
 * @ClassName PageReq
 * @Description TODO
 * @Author jiangyunpeng
 * @Date 2018/12/27 13:17
 * @Version 1.0
 */
public class PageReq extends BaseReq {
    /**
     * 请求分页默认页数
     */
    private Integer pageIndex = 1;
    /**
     * 请求分页默认页大小
     */
    private Integer pageSize = 100;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
