package com.dsl.xxx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dsl.xxx.pojo.TbContent;
import com.dsl.xxx.service.ContentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("content")
public class ContentController {
    @Reference
    private ContentService contentService;

    /** * 根据广告分类ID查询广告列表	 */
    @RequestMapping("/findByCategoryId")
    public List<TbContent> findByCategoryId(Long categoryId) {
        return contentService.findByCategoryId(categoryId);
    }
}
