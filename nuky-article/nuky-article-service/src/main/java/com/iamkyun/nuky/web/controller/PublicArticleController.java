package com.iamkyun.nuky.web.controller;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.data.view.PublicPagedQuery;
import com.iamkyun.nuky.data.view.PublicSingleQuery;
import com.iamkyun.nuky.service.ArticleService;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kyun
 */
@RestController
@RefreshScope
public class PublicArticleController {
    private final ArticleService articleService;

    public PublicArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article/{id}")
    @JsonView(PublicSingleQuery.class)
    public Article getArticle(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

    @GetMapping("/articles/page/{pageNumber}")
    @JsonView(PublicPagedQuery.class)
    public Page<Article> getIndexArticles(@PathVariable(required = false) Integer pageNumber) {
        Page<Article> articlePage = articleService.getArticlePage(pageNumber);
        System.out.println("articlePage = " + articlePage);
        return articlePage;
    }

    @GetMapping("/articles/popular")
    public List<Article> getPopularArticles() {
        return Collections.emptyList();
    }
}
