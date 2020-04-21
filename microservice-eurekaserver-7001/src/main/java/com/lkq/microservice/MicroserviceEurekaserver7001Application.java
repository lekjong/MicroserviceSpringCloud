package com.lkq.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaserver7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaserver7001Application.class, args);
    }

}
