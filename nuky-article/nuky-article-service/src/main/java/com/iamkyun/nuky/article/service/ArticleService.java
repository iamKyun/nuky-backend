package com.iamkyun.nuky.article.service;

import java.util.List;

import com.iamkyun.nuky.article.data.dao.ArticleDao;
import com.iamkyun.nuky.article.data.entity.Article;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

/**
 * @author kyun
 *
 */
@Service
public class ArticleService {
    private final ArticleDao articleDao;

    public ArticleService(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    public List<Article> getIndexArticles() {
        return articleDao.findFirst5(Sort.by(Order.desc("postDate")));
    }
}
