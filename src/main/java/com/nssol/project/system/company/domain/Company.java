package com.nssol.project.system.company.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.nssol.framework.aspectj.lang.annotation.Excel;
import com.nssol.framework.web.domain.BaseEntity;

/**
 * 公司对象 m_company
 * 
 * @author zxy
 * @date 2021-12-23
 */
public class Company extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** Id */
    private Long id;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String name;

    /** 公司代码 */
    @Excel(name = "公司代码")
    private String code;

    /** 是否为客户 */
    @Excel(name = "是否为客户")
    private Long iscustomer;

    /** 是否为供应商 */
    @Excel(name = "是否为供应商")
    private Long isvendor;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private Long available;

    public Long getIscustomer() {
        return iscustomer;
    }

    public void setIscustomer(Long iscustomer) {
        this.iscustomer = iscustomer;
    }

    public Long getIsvendor() {
        return isvendor;
    }

    public void setIsvendor(Long isvendor) {
        this.isvendor = isvendor;
    }

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
            .append("code", getCode())
            .append("remark", getRemark())
            .append("available", getAvailable())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
