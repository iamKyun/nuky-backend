package com.iamkyun.nuky.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.common.PagedData;
import com.iamkyun.nuky.model.entity.Post;
import com.iamkyun.nuky.model.view.PublicPagedQuery;
import com.iamkyun.nuky.model.view.PublicSingleQuery;
import com.iamkyun.nuky.service.PostService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author kyun
 */
@RestController
@RefreshScope
public class PublicPostController {
    private final PostService postService;

    public PublicPostController(PostService postService) {
        this.postService = postService;
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
}
