package com.iamkyun.nuky.service.impl;

import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.repository.ArticleRepository;
import com.iamkyun.nuky.service.ArticleService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author kyun
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Value("${nuky.article.page-size:10}")
    private Integer pageSize;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Article> getArticlePage(Integer page) {
        if (page == null) {
            page = 1;
        }
        return articleRepository.findAll(PageRequest.of(page - 1, pageSize));
    }
}
