package com.iamkyun.nuky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableJpaRepositories("com.iamkyun.nuky.dao")
@EntityScan({"com.iamkyun.nuky.data.entity"})
@EnableJpaAuditing
@EnableCircuitBreaker
public class NukyUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyUserServiceApplication.class, args);
    }

}
