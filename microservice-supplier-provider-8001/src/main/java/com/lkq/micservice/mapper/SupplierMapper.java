package com.lkq.micservice.mapper;

import com.lkq.api.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper {

    public Supplier findSupplierBySid(int sid);

    public Supplier findSupplierBySupplierName(String sname);

    public List<Supplier> listSupplier();

    public Boolean addSupplier(Supplier supplier);

    public Boolean deleteSupplierBysid(int sid);
}
