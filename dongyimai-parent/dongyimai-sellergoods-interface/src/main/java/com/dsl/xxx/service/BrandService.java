package com.dsl.xxx.service;

import com.dsl.xxx.entity.PageResult;
import com.dsl.xxx.pojo.TbBrand;

import java.util.List;
import java.util.Map;

public interface BrandService {
    List<TbBrand> findAll();

    PageResult findPage(int pageNum, int pageSize);

    void addOneBrand(TbBrand tbBrand);

    TbBrand findOneBrand(long id);

    void updateOneBrand(TbBrand tbBrand);

    void deleteManyBrand(Long[] ids);

    PageResult findPage(TbBrand brand, int pageNum,int pageSize);

    public List<Map> selectBrandList();
}
