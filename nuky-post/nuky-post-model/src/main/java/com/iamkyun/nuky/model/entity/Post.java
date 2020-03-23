package com.iamkyun.nuky.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
public class Post {
    private Long id;

    private String categoryId;

    private String title;

    private String excerpt;

    private String content;

    private Timestamp createDate;

    private Timestamp publishDate;

    private Timestamp modifiedDate;

    private Integer status;

    private Long commentCount;

    private Long views;

}
