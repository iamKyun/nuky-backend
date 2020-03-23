package com.iamkyun.nuky.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iamkyun.nuky.model.entity.Post;

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
