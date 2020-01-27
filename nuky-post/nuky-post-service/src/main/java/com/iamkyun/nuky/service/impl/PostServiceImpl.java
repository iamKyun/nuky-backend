package com.iamkyun.nuky.service.impl;

import com.iamkyun.nuky.model.entity.Post;
import com.iamkyun.nuky.repository.PostRepository;
import com.iamkyun.nuky.service.PostService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author kyun
 */
@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Value("${nuky.post.page-size:10}")
    private Integer pageSize;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.getOne(id);
    }

    @Override
    public Page<Post> getPostPage(Integer page) {
        if (page == null) {
            page = 1;
        }
        return postRepository.findAll(PageRequest.of(page - 1, pageSize));
    }
}
