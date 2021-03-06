package com.nssol.project.system.companydept.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.nssol.framework.aspectj.lang.annotation.Excel;
import com.nssol.framework.web.domain.BaseEntity;

/**
 * 公司部门对象 m_company_dep
 * 
 * @author zxy
 * @date 2022-02-22
 */
public class CompanyDep extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门id */
    private Long id;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String name;

    /** 所屬公司 */
    @Excel(name= "所屬公司")
    private String companyName;

    /** 部门代码 */
    @Excel(name = "部门代码")
    private String code;

    /** 所属公司 */
    @Excel(name = "所属公司")
    private Long companyId;

    public String getCompanyName() {return companyName;}

    public void setCompanyName(String companyName) {this.companyName = companyName;}
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
    public void setCompanyId(Long companyId)
    {
        this.companyId = companyId;
    }

    public Long getCompanyId()
    {
        return companyId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("code", getCode())
            .append("companyId", getCompanyId())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
