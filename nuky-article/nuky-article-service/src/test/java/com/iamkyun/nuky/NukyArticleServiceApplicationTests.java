package com.iamkyun.nuky;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.iamkyun.nuky.dao.ArticleDao;
import com.iamkyun.nuky.data.entity.Article;
import com.iamkyun.nuky.data.entity.Comment;
import com.iamkyun.nuky.data.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NukyArticleServiceApplication.class)
public class NukyArticleServiceApplicationTests {

    @Autowired
    ArticleDao articleDao;

    @Test
    public void contextLoads() {
        User kyun = new User();
        kyun.setId(1L);
        User wahnna = new User();
        wahnna.setId(2L);

        Article article = new Article();
        article.setTitle("hahaha");
        article.setContent("ddddddddddddddddddddddddddddddddddddddd");
        article.setPostDate(new Timestamp(new java.util.Date().getTime()));
        article.setUser(kyun);

        List<Comment> comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.setContent("dasdqwe");
        comment.setArticle(article);
        comment.setUser(kyun);
        comments.add(comment);

        comment = new Comment();
        comment.setContent("gerewf");
        comment.setArticle(article);
        comment.setUser(wahnna);
        comments.add(comment);

        article.setComments(comments);

        articleDao.save(article);

    }

}
