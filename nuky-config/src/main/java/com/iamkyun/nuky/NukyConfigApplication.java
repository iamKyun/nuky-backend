package com.iamkyun.nuky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author kyun
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class NukyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NukyConfigApplication.class, args);
    }

}
