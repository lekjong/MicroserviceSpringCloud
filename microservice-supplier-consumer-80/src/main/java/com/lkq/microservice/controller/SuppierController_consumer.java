package com.lkq.microservice.controller;

import com.lkq.api.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class SuppierController_consumer {

    public static final String  URL_PREFIX="http://localhost:8001";
  //通过restemplate接口调用微服务提供者提供的微服务。
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer/sup/{sid}")
    public Supplier getSup( @PathVariable("sid") int sid){

        //指定url，返回对象,路径变量
        return restTemplate.getForObject(URL_PREFIX+"/provider/sup/"+sid,Supplier.class);
    }

    @GetMapping("/consumer/sup/list")
    public List<Supplier> getSups(){

        //指定url，返回对象,路径变量
        return restTemplate.getForObject(URL_PREFIX+"/provider/sup/list",List.class);
    }

    @PostMapping("/consumer/sup/add")
    public Boolean postSup(Supplier supplier){

        //指定url，返回对象,路径变量
        return restTemplate.postForObject(URL_PREFIX+"/provider/sup/add",supplier,Boolean.class);
    }

    @DeleteMapping("/consumer/sup/{sid}")
    public void postSup(@PathVariable("sid") int sid){

        //指定url，返回对象,路径变量 。该delete方没有返回值。
         restTemplate.delete(URL_PREFIX+"/provider/sup",sid);

    }






}
