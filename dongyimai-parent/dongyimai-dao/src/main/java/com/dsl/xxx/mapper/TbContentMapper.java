package com.dsl.xxx.mapper;

import com.dsl.xxx.pojo.TbContent;
import com.dsl.xxx.pojo.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int countByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insert(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insertSelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKey(TbContent record);
}