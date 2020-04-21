package com.lkq.micservice.service;

import com.lkq.api.entity.Supplier;

import java.util.List;

public interface SuppplierService {

    public Supplier getByid(int sid);

    public Supplier getByName(String scode);

    public List<Supplier> list();

    public Boolean addSupplier(Supplier supplier);

    public  Boolean deleteSupplier(int sid);

}
