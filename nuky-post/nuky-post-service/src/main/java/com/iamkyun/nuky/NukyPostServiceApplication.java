package com.iamkyun.nuky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@MapperScan("com.iamkyun.nuky.mapper")
public class NukyPostServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyPostServiceApplication.class, args);
    }

}
