package com.iamkyun.nuky.repository;

import com.iamkyun.nuky.data.entity.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kyun
 *
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
