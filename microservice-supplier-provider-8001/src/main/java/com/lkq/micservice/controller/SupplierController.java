package com.lkq.micservice.controller;

import com.lkq.api.entity.Supplier;
import com.lkq.micservice.service.servImp.SupplierServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SupplierController {

    @Autowired
    private   SupplierServiceImp supplierService;

    @GetMapping("/provider/sup/{sid}")
    public Supplier getSupplierByid(@PathVariable("sid") int sid){

        Supplier supplier = supplierService.getByid(sid);

        return supplier;
    }

//    @GetMapping("/supplier/gn/{sname}")
//    public Supplier getSupplierByName(@PathVariable("sname")String sname){
//
//        Supplier supplier = supplierService.getByName(sname);
//
//        return supplier;
//    }

    @GetMapping("/provider/sup/list")
    public List<Supplier> list(){
        return  supplierService.list();
    }

    @PostMapping("/provider/sup/add")
    public Boolean addSup(Supplier supplier){
        return supplierService.addSupplier(supplier);
    }

    @DeleteMapping("/provider/sup/{sid}")
    public  Boolean deleteSup(@PathVariable("sid") int sid){
        return  supplierService.deleteSupplier(sid);
    }



}
