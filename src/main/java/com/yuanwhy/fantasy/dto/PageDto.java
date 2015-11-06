package com.yuanwhy.fantasy.dto;

import java.util.List;

/**
 * Created by yuanwhy on 2015/11/6.
 */
public class PageDto<T> {
    List<T> items;

    int pageCount;

    int pageNum;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
