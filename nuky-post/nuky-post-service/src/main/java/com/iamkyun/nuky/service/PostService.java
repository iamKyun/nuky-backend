package com.iamkyun.nuky.service;

import com.iamkyun.nuky.model.entity.Post;

import org.springframework.data.domain.Page;

/**
 * @author kyun
 */
public interface PostService {
    /**
     * get post
     * @param id
     * @return
     */
    Post getPostById(Long id);

    /**
     * paged query
     *
     * @param page start from 1
     * @return
     */
    Page<Post> getPostPage(Integer page);
}
