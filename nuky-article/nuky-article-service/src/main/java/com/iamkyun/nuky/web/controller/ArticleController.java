package com.iamkyun.nuky.web.controller;

import java.util.List;

import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.service.ArticleService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kyun
 */
@RestController
@RequestMapping("/article")
@RefreshScope
public class ArticleController {
    private final ArticleService articleService;

    @Value("${nuky.env}")
    String env;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/index")
    public List<Article> getIndexArticles() {
        return articleService.getIndexArticles();
    }

    @GetMapping("/{id}")
    public Article testUserService(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

    @GetMapping("/page/{pageNumber}")
    public Page<Article> getIndexArticles(@PathVariable Integer pageNumber) {
        return articleService.getArticlePage(pageNumber);
    }
}
