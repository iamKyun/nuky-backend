package com.iamkyun.nuky.web.controller;

import java.util.List;

import com.iamkyun.nuky.client.UserClient;
import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.data.entity.User;
import com.iamkyun.nuky.service.ArticleService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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

    private final UserClient userClient;

    @Value("${nuky.env}")
    String env;

    public ArticleController(ArticleService articleService, UserClient userClient) {
        this.articleService = articleService;
        this.userClient = userClient;
    }

    @GetMapping("/index")
    public List<Article> getIndexArticles() {
        return articleService.getIndexArticles();
    }

    @GetMapping("/user/{id}")
    public User testUserService(@PathVariable Long id) {
        return userClient.getUserById(id);
    }
}
