package com.iamkyun.nuky.article.web;

import java.util.List;

import com.iamkyun.nuky.article.data.entity.Article;
import com.iamkyun.nuky.article.service.ArticleService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/test")
    public String test() {
        return env;
    }
}
