package com.iamkyun.nuky.article.service.impl;

import java.util.List;

import com.iamkyun.nuky.article.service.ArticleService;
import com.iamkyun.nuky.data.dao.ArticleDao;
import com.iamkyun.nuky.data.entity.Article;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
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


    public List<Article> getIndexArticles() {
        return articleDao.findFirst5(Sort.by(Order.desc("postDate")));
    }
}
