package com.iamkyun.nuky.dao;

import com.iamkyun.nuky.data.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 *
 */
@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
}
