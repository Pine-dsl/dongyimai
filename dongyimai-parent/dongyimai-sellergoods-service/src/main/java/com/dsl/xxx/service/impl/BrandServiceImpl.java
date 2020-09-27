package com.dsl.xxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsl.xxx.entity.PageResult;
import com.dsl.xxx.mapper.TbBrandMapper;
import com.dsl.xxx.pojo.TbBrand;
import com.dsl.xxx.pojo.TbBrandExample;
import com.dsl.xxx.pojo.TbBrandExample.Criteria;
import com.dsl.xxx.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        return tbBrandMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page=(Page<TbBrand>) tbBrandMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public void addOneBrand(TbBrand tbBrand) {
        tbBrandMapper.insert(tbBrand);
    }

    @Override
    public TbBrand findOneBrand(long id) {
        return tbBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateOneBrand(TbBrand tbBrand) {
        tbBrandMapper.updateByPrimaryKey(tbBrand);
    }

    @Override
    public void deleteManyBrand(Long[] ids) {
        for(Long id : ids){
            tbBrandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        TbBrandExample example=new TbBrandExample();
        Criteria criteria = example.createCriteria();
        if(brand!=null){
            if(brand.getName()!=null && brand.getName().length()>0){
                criteria.andNameLike("%"+brand.getName()+"%");
            }
            if(brand.getFirstChar()!=null && brand.getFirstChar().length()>0){
                criteria.andFirstCharEqualTo(brand.getFirstChar());
            }
        }
        Page<TbBrand> page= (Page<TbBrand>)tbBrandMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public List<Map> selectBrandList() {
        return tbBrandMapper.selectBrandList();
    }
}
