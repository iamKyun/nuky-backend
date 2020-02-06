package com.iamkyun.nuky.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author kyun
 *
 */
@Data
@EqualsAndHashCode
@ToString
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "replied_comment_id", referencedColumnName = "id")
    @JsonIgnore
    private Comment repliedComment;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @Basic
    @Column(name = "post_id")
    private Long postId;

    @Basic
    @Column(name = "create_date")
    @CreatedDate
    private Timestamp createDate;

    @Basic
    @Column(name = "content")
    private String content;

    @Basic
    @Column(name = "status")
    private Integer status;
}
