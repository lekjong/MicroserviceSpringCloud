package com.lkq.microservice.cfgBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MycfgBeans {

    /*
     * 配置rest风格的微服务调用模板对象
     */
    @Bean
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

}
