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
public class Comment {
    private Long id;

    private Comment repliedComment;

    private String userId;

    private Long postId;

    private Timestamp createDate;

    private String content;

    private Integer status;
}
