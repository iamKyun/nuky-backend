package com.iamkyun.nuky.model.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.iamkyun.nuky.model.view.PublicPagedQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(PublicPagedQuery.class)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @ManyToMany
    @JoinTable(name = "post_tag", joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

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

    @Basic
    @Column(name = "status")
    private Integer status;

    @Basic
    @Column(name = "comment_count")
    private Long commentCount;

    @Basic
    @Column(name = "views")
    private Long views;

}
