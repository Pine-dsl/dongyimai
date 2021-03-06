package com.dsl.xxx.mapper;

import com.dsl.xxx.pojo.TbSpecificationOption;
import com.dsl.xxx.pojo.TbSpecificationOptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSpecificationOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int countByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insert(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insertSelective(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    List<TbSpecificationOption> selectByExample(TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    TbSpecificationOption selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExample(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKeySelective(TbSpecificationOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKey(TbSpecificationOption record);
}