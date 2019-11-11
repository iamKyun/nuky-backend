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
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonView(PagedQuery.class)
    private Long id;

    @Basic
    @Column(name = "title")
    @JsonView(PagedQuery.class)
    private String title;

    @Basic
    @Column(name = "content")
    @JsonView(PagedQuery.class)
    private String content;

    @Basic
    @Column(name = "create_date")
    @CreatedDate
    @JsonView(PagedQuery.class)
    private Timestamp createDate;

    @Basic
    @Column(name = "post_date")
    @JsonView(PagedQuery.class)
    private Timestamp postDate;

    @ManyToOne
    @JsonView(PagedQuery.class)
    private User user;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonView(SingleQuery.class)
    private List<Comment> comments;

    // paged query view
    public interface PagedQuery {}

    public interface SingleQuery extends PagedQuery {}
}
