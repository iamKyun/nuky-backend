package com.iamkyun.nuky.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
@Entity
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "create_date")
    @CreatedDate
    private Timestamp createDate;

    @Basic
    @Column(name = "IP")
    private String ip;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
}
