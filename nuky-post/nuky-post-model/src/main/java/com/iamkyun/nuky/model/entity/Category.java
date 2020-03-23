package com.iamkyun.nuky.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
public class Category {
    private Long id;

    private String name;

    private String slug;

    private String parentId;
}
