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
public class User {
    private Long id;

    private String username;

    private String email;

    private Timestamp createDate;

    private String ip;
}
