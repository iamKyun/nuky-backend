package com.iamkyun.nuky.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.client.UserClient;
import com.iamkyun.nuky.common.PagedData;
import com.iamkyun.nuky.model.entity.Post;
import com.iamkyun.nuky.model.entity.User;
import com.iamkyun.nuky.model.view.PublicPagedQuery;
import com.iamkyun.nuky.model.view.PublicSingleQuery;
import com.iamkyun.nuky.service.PostService;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kyun
 */
@RestController
@RefreshScope
public class PublicPostController {

    private final PostService postService;

    private final UserClient userClient;

    public PublicPostController(PostService postService, UserClient userClient) {
        this.postService = postService;
        this.userClient = userClient;
    }

    @GetMapping("/post/{id}")
    @JsonView(PublicSingleQuery.class)
    public Post getPost(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping("/posts/page/{pageNumber}")
    @JsonView(PublicPagedQuery.class)
    public PagedData<Post> getIndexPosts(@PathVariable(required = false) Integer pageNumber) {
        Page<Post> postPage = postService.getPostPage(pageNumber);
        System.out.println("postPage = " + postPage);
        return PagedData.of(postPage);
    }

    @GetMapping("/posts/popular")
    public List<Post> getPopularPosts() {
        return Collections.emptyList();
    }

    @GetMapping("/posts/user/{id}")
    public User testFeignUser (@PathVariable Long id){
        User userById = userClient.getUserById(id);
        return userById;
    }
}
