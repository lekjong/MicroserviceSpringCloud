package com.lkq.micservice.service.servImp;

import com.lkq.api.entity.Supplier;
import com.lkq.micservice.mapper.SupplierMapper;
import com.lkq.micservice.service.SuppplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImp implements SuppplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public Supplier getByid(int sid) {
        return supplierMapper.findSupplierBySid(sid);
    }

    @Override
    public Supplier getByName(String scode) {
        return supplierMapper.findSupplierBySupplierName(scode);
    }

    @Override
    public List<Supplier> list() {
        return supplierMapper.listSupplier();
    }

    @Override
    public Boolean addSupplier(Supplier supplier) {
        return  supplierMapper.addSupplier(supplier);
    }

    @Override
    public Boolean deleteSupplier(int sid) {
        return deleteSupplier(sid);
    }
}
