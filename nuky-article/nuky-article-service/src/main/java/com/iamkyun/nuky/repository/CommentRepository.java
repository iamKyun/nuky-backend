package com.iamkyun.nuky.repository;

import com.iamkyun.nuky.data.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 *
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
