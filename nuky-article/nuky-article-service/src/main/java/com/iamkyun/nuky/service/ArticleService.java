package com.iamkyun.nuky.service;

import java.util.List;

import com.iamkyun.nuky.data.entity.Article;

/**
 * @author kyun
 */
public interface ArticleService {
    /**
     * get top 5 artcles
     * @return
     */
    List<Article> getIndexArticles();
}
