package com.iamkyun.nuky.service;

import java.util.List;

import com.iamkyun.nuky.data.entity.Article;

import org.springframework.data.domain.Page;

/**
 * @author kyun
 */
public interface ArticleService {
    /**
     * get top 5 artcles
     * @return
     */
    List<Article> getIndexArticles();

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
