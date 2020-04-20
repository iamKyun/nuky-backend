package com.iamkyun.nuky.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import lombok.Getter;

/**
 * paged data
 *
 * @author kyun
 */
@Getter
public class PagedData<T> {
    private long totalElements;
    private long totalPages;
    private long pageNumber;
    private long pageSize;
    private List<T> content;

    private PagedData(Page<T> page) {
        if (page != null) {
            this.totalElements = page.getTotal();
            this.totalPages = page.getPages();
            this.pageNumber = page.getCurrent();
            this.pageSize = page.getSize();
            this.content = page.getRecords();
        }
    }

    public static <T> PagedData<T> of(Page<T> page) {
        return new PagedData<T>(page);
    }
}
