package com.iamkyun.nuky.article.data.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author kyun
 */
@Data
public class Article {
    /**
     * author
     */
    private String author;

    /**
     * title
     */
    private String title;

    /**
     * content
     */
    private String content;

    /**
     * post date
     */
    private Date postDate;

    /**
     * tags
     */
    private List<String> tags;

    /**
     * comments
     */
    private List<Comment> comments;

}
