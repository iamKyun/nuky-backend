package com.iamkyun.nuky.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
public class Post {
    private Long id;

    private Category category;

    private List<Tag> tags;

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
