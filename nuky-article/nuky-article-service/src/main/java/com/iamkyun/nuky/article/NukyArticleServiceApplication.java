package com.iamkyun.nuky.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableJpaRepositories("com.iamkyun.nuky.data.dao")
@EntityScan({"com.iamkyun.nuky.data.entity"})
@EnableJpaAuditing
public class NukyArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyArticleServiceApplication.class, args);
    }

}
