package com.store.domain.base;

import com.store.config.ProjectProperties;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;

/**
 * @Author guojunguang
 * @Date 2018/4/26 0026
 * @Description
 */
public abstract class PageEntity {
    int pageSize;//每页条数

    int currentPage;//当前页数

    int offset;//用于sql查询

    int limit;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
