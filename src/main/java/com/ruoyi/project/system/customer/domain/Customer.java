package com.ruoyi.project.system.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户对象 m_customer
 * 
 * @author zxy
 * @date 2021-12-21
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 客户(公司)名称 */
    @Excel(name = "客户(公司)名称")
    private String name;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private Long customerType;

    /** 客户代码 */
    @Excel(name = "客户代码")
    private String code;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private Long available;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setCustomerType(Long customerType)
    {
        this.customerType = customerType;
    }

    public Long getCustomerType()
    {
        return customerType;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setAvailable(Long available)
    {
        this.available = available;
    }

    public Long getAvailable()
    {
        return available;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("customerType", getCustomerType())
            .append("remark", getRemark())
            .append("code", getCode())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("available", getAvailable())
            .append("createTime", getCreateTime())
            .toString();
    }
}
