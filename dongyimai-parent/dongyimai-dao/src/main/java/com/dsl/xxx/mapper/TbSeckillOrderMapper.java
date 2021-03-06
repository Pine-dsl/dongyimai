package com.dsl.xxx.mapper;

import com.dsl.xxx.pojo.TbSeckillOrder;
import com.dsl.xxx.pojo.TbSeckillOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSeckillOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int countByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insert(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int insertSelective(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    TbSeckillOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByExample(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKeySelective(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    int updateByPrimaryKey(TbSeckillOrder record);
}