package com.iamkyun.nuky.common;

import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author kyun
 */
@Getter
public class PagedData<T> {
    private long totalElements;
    private int totalPages;
    private int pageNumber;
    private int pageSize;
    private List<T> content;

    private PagedData(Page<T> page) {
        if (page != null) {
            this.totalElements = page.getTotalElements();
            this.totalPages = page.getTotalPages();
            this.pageNumber = page.getPageable().getPageNumber();
            this.pageSize = page.getPageable().getPageSize();
            this.content = page.getContent();
        }
    }

    public static <T> PagedData<T> from(Page<T> page) {
        return new PagedData<T>(page);
    }
}
