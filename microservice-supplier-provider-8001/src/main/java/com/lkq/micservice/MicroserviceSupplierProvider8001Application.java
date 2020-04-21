package com.lkq.micservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    //指明为eureka c端，本服务会注册到注册中心。
public class MicroserviceSupplierProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSupplierProvider8001Application.class, args);
    }

}
