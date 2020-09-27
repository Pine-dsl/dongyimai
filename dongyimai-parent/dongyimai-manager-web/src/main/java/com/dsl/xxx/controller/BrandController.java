package com.dsl.xxx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dsl.xxx.entity.PageResult;
import com.dsl.xxx.entity.Result;
import com.dsl.xxx.pojo.TbBrand;
import com.dsl.xxx.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    @RequestMapping("findPage")
    public PageResult findPage(int page,int rows){
        return brandService.findPage(page,rows);
    }

    @RequestMapping("addOneBrand")
    public Result addOneBrand(@RequestBody TbBrand brand){
        try {
            brandService.addOneBrand(brand);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");
        }
    }

    @RequestMapping("findOneBrand")
    public TbBrand findOneBrand(Long id){
        return brandService.findOneBrand(id);
    }

    @RequestMapping("updateOneBrand")
    public Result updateOneBrand(@RequestBody TbBrand brand){
        try {
            brandService.updateOneBrand(brand);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("deleteManyBrand")
    public Result deleteManyBrand(@RequestBody Long[] ids){
        try {
            brandService.deleteManyBrand(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @RequestMapping("/search")
    public PageResult search(@RequestBody TbBrand brand, int page, int rows  ){
        return brandService.findPage(brand, page, rows);
    }

    @RequestMapping("/selectBrandList")
    public List<Map> selectBrandList(){
        return brandService.selectBrandList();
    }

}
