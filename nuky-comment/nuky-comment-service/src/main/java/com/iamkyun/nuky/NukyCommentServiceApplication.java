package com.iamkyun.nuky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableCircuitBreaker
@MapperScan("com.iamkyun.nuky.mapper")
public class NukyCommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyCommentServiceApplication.class, args);
    }

}
