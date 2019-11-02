package com.iamkyun.nuky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableZuulProxy
public class NukyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyGatewayApplication.class, args);
    }

}
