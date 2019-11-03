package com.iamkyun.nuky.service.impl;

import java.util.List;

import com.iamkyun.nuky.dao.ArticleDao;
import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.service.ArticleService;

import org.springframework.stereotype.Service;

/**
 * @author kyun
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleDao articleDao;

    public ArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }


    @Override
    public List<Article> getIndexArticles() {
        return articleDao.findTop5ByPostDateNotNullOrderByPostDateDesc();
    }

    @Override
    public Article getArticleById(Long id) {
       return articleDao.findById(id).orElse(null);
    }
}
