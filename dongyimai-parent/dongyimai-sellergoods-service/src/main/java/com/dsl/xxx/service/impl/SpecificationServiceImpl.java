package com.dsl.xxx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dsl.xxx.group.Specification;
import com.dsl.xxx.mapper.TbSpecificationOptionMapper;
import com.dsl.xxx.pojo.TbSpecificationOption;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.dsl.xxx.entity.PageResult;
import com.dsl.xxx.mapper.TbSpecificationMapper;
import com.dsl.xxx.pojo.TbSpecification;
import com.dsl.xxx.pojo.TbSpecificationExample;
import com.dsl.xxx.pojo.TbSpecificationExample.Criteria;
import com.dsl.xxx.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {



	@Autowired
	private TbSpecificationMapper specificationMapper;

	@Autowired
	private TbSpecificationOptionMapper specificationOptionMapper;

	@Override
	public List<Map> selectSpecList() {
		return specificationMapper.selectSpecList();
	}
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbSpecification> findAll() {
		return specificationMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbSpecification> page=   (Page<TbSpecification>) specificationMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbSpecification specification) {
		specificationMapper.insert(specification);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbSpecification specification){
		specificationMapper.updateByPrimaryKey(specification);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbSpecification findOne(Long id){
		return specificationMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			specificationMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbSpecificationExample example=new TbSpecificationExample();
		Criteria criteria = example.createCriteria();
		
		if(specification!=null){			
						if(specification.getSpecName()!=null && specification.getSpecName().length()>0){
				criteria.andSpecNameLike("%"+specification.getSpecName()+"%");
			}	
		}
		
		Page<TbSpecification> page= (Page<TbSpecification>)specificationMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(Specification specification) {
		specificationMapper.insert(specification.getSpecification());//插入规格
		//循环插入规格选项
		Long id = specification.getSpecification().getId();
		for(TbSpecificationOption specificationOption:specification.getSpecificationOptionList()){
			specificationOption.setSpecId(id);//设置规格ID
			specificationOptionMapper.insert(specificationOption);
		}
	}

}
