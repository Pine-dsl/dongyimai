package com.dsl.xxx.mapper;

import com.dsl.xxx.pojo.TbTypeTemplate;
import com.dsl.xxx.pojo.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int countByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insert(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insertSelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    TbTypeTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKeySelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKey(TbTypeTemplate record);
}