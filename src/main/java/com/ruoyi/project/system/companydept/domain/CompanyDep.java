package com.ruoyi.project.system.companydept.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 公司部门对象 m_company_dep
 * 
 * @author zxy
 * @date 2022-01-04
 */
public class CompanyDep extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String name;

    /** 部门代码 */
    @Excel(name = "部门代码")
    private String code;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("code", getCode())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
