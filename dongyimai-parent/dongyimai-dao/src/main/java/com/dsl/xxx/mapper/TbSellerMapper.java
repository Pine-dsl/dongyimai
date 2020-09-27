package com.dsl.xxx.mapper;

import com.dsl.xxx.pojo.TbSeller;
import com.dsl.xxx.pojo.TbSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int countByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByPrimaryKey(String sellerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insert(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insertSelective(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    List<TbSeller> selectByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    TbSeller selectByPrimaryKey(String sellerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKeySelective(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKey(TbSeller record);
}