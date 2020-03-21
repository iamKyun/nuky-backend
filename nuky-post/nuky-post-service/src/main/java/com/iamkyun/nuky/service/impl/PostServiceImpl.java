package com.iamkyun.nuky.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iamkyun.nuky.mapper.PostMapper;
import com.iamkyun.nuky.model.entity.Post;
import com.iamkyun.nuky.service.PostService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author kyun
 */
@Service
public class PostServiceImpl implements PostService {
    private final PostMapper postMapper;

    @Value("${nuky.post.page-size:10}")
    private Integer pageSize;

    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Override
    public Post getPostById(Long id) {
        return postMapper.selectById(id);
    }

    @Override
    public Page<Post> getPostPage(Integer pageNumber) {
        if (pageNumber == null) {
            pageNumber = 1;
        }
        Page<Post> page = new Page<>();
        page.setCurrent(pageNumber);
        return postMapper.selectPage(page, null);
    }
}
