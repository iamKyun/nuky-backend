package com.iamkyun.nuky.article.data.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author kyun
 */
@Data
public class Comment {
    /**
     * author
     */
    private String author;

    /**
     * comment content
     */
    private String content;

    /**
     * post date
     */
    private Date postDate;
}
