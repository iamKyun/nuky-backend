package com.iamkyun.nuky.model.entity;

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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.model.view.PublicPagedQuery;
import com.iamkyun.nuky.model.view.PublicSingleQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(PublicPagedQuery.class)
    private Long id;

    @Basic
    @Column(name = "title")
    @JsonView(PublicPagedQuery.class)
    private String title;

    @Basic
    @Column(name = "excerpt")
    private String excerpt;

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

    @Basic
    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @ManyToOne
    @JsonView(PublicPagedQuery.class)
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @JsonView(PublicSingleQuery.class)
    private List<Comment> comments;

    @Basic
    @Column(name = "status")
    private Integer status;

    @Basic
    @Column(name = "comment_count")
    private Long commentCount;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToMany
    @JoinTable(name = "post_tag", joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

    @OneToMany(mappedBy = "post")
    public List<Comment> getComments() {
        return comments;
    }
}
