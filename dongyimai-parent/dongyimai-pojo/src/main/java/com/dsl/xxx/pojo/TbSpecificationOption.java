package com.dsl.xxx.pojo;

import java.io.Serializable;

public class TbSpecificationOption implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.option_name
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    private String optionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.spec_id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    private Long specId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_specification_option.orders
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    private Integer orders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_specification_option
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.id
     *
     * @return the value of tb_specification_option.id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.id
     *
     * @param id the value for tb_specification_option.id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.option_name
     *
     * @return the value of tb_specification_option.option_name
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.option_name
     *
     * @param optionName the value for tb_specification_option.option_name
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.spec_id
     *
     * @return the value of tb_specification_option.spec_id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.spec_id
     *
     * @param specId the value for tb_specification_option.spec_id
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_specification_option.orders
     *
     * @return the value of tb_specification_option.orders
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_specification_option.orders
     *
     * @param orders the value for tb_specification_option.orders
     *
     * @mbggenerated Wed Sep 02 20:50:03 CST 2020
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}