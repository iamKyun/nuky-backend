package com.iamkyun.nuky.data.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "content")
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id")
    @JsonIgnore
    private Article article;

    @ManyToOne
    @JsonIgnore
    private Comment replyComment;

    @OneToMany(mappedBy = "replyComment", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Comment> comments;

    @ManyToOne
    private User user;

    @Column(name = "create_date")
    @Basic
    @CreatedDate
    private Timestamp createDate;
}
