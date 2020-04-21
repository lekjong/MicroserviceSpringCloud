package com.lkq.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSupplierConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSupplierConsumer80Application.class, args);
    }

}
