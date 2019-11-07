package com.iamkyun.nuky.service;

import com.iamkyun.nuky.data.entity.Article;

import org.springframework.data.domain.Page;

/**
 * @author kyun
 */
public interface ArticleService {
    /**
     * get article
     * @param id
     * @return
     */
    Article getArticleById(Long id);

    /**
     * paged query
     *
     * @param page start from 1
     * @return
     */
    Page<Article> getArticlePage(Integer page);
}
