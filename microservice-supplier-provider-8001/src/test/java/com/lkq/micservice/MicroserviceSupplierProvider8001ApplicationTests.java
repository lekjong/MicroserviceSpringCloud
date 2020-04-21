package com.lkq.micservice;

import com.lkq.api.entity.Supplier;
import com.lkq.micservice.mapper.SupplierMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public  class MicroserviceSupplierProvider8001ApplicationTests {


    @Autowired
    SupplierMapper supplierMapper;

//    @Test
////    void contextLoads() {
////
////    }

    @Test
    public void testSupplier(){

        System.out.println("查询结果为：++++"+supplierMapper.findSupplierBySid(1).toString());

    }



}
