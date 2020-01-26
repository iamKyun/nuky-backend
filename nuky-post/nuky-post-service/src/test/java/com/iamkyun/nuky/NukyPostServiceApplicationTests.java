package com.iamkyun.nuky;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iamkyun.nuky.repository.PostRepository;
import com.iamkyun.nuky.repository.CommentRepository;
import com.iamkyun.nuky.data.entity.Post;
import com.iamkyun.nuky.data.entity.Comment;
import com.iamkyun.nuky.data.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NukyPostServiceApplication.class)
public class NukyPostServiceApplicationTests {

    @Value("${nuku.post.pageSize:10}")
    private Integer pageSize;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Test
    @Transactional
    public void testSaveEntiries() {
        User kyun = new User();
        kyun.setId(1L);
        User wahnna = new User();
        wahnna.setId(2L);

        Post post = new Post();
        post.setTitle("hahaha");
        post.setContent("ddddddddddddddddddddddddddddddddddddddd");
        post.setPostDate(new Timestamp(new Date().getTime()));
        post.setUser(kyun);
        postRepository.save(post);


        List<Comment> comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.setContent("dasdqwe");
        comment.setPost(post);
        comment.setUser(kyun);
        comments.add(comment);

        comment = new Comment();
        comment.setContent("gerewf");
        comment.setPost(post);
        comment.setUser(wahnna);
        comments.add(comment);
        commentRepository.saveAll(comments);

    }

    @Test
    public void testPageSizeConfig() {
        System.out.println(pageSize);
    }

    @Test
    @Transactional
    public void testLazyLoad(){
        Post one = postRepository.getOne(4L);
        System.out.println(one);
    }

}
