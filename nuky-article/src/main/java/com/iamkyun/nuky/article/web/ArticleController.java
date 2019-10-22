package com.iamkyun.nuky.article.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.iamkyun.nuky.article.data.entity.Article;
import com.iamkyun.nuky.article.data.entity.Comment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kyun
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/index")
    public List<Article> getIndexArticles() {
        List<Article> articles = new ArrayList<>();
        List<Comment> comments = new ArrayList<>();
        Article article = new Article();
        article.setAuthor("kyun");
        article.setTitle("This is my frist article");
        article.setContent("Should say something ?");
        article.setPostDate(new Date());
        article.setTags(Arrays.asList("java", "spring"));
        article.setComments(comments);
        articles.add(article);

        Comment comment = new Comment();
        comment.setAuthor("wahnna");
        comment.setContent("That's aswsome!");
        comment.setPostDate(new Date());
        comments.add(comment);

        comment = new Comment();
        comment.setAuthor("kyun");
        comment.setContent("Hell Yeah!");
        comment.setPostDate(new Date());
        comments.add(comment);

        return articles;
    }
}
