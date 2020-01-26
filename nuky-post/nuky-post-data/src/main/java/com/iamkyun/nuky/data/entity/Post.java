package com.iamkyun.nuky.data.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.data.view.PublicPagedQuery;
import com.iamkyun.nuky.data.view.PublicSingleQuery;
import lombok.Data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author kyun
 *
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonView(PublicPagedQuery.class)
    private Long id;

    @Basic
    @Column(name = "title")
    @JsonView(PublicPagedQuery.class)
    private String title;

    @Basic
    @Column(name = "content")
    @JsonView(PublicPagedQuery.class)
    private String content;

    @Basic
    @Column(name = "create_date")
    @CreatedDate
    @JsonView(PublicPagedQuery.class)
    private Timestamp createDate;

    @Basic
    @Column(name = "publish_date")
    @JsonView(PublicPagedQuery.class)
    private Timestamp publishDate;

    @ManyToOne
    @JsonView(PublicPagedQuery.class)
    private User user;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL, fetch =
            FetchType.LAZY)
    @JsonView(PublicSingleQuery.class)
    private List<Comment> comments;
}
