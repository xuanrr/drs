package com.ruoyi.project.system.developtype.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 运维类型对象 m_develop_type
 *
 * @author zxy
 * @date 2022-02-21
 */
public class DevelopType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 运维类型名称 */
    @Excel(name = "运维类型名称")
    private String name;

    /** 运维id */
    private Long id;

    /** 运维类型代码 */
    @Excel(name = "运维类型代码")
    private String code;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long sort;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private Long available;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setSort(Long sort)
    {
        this.sort = sort;
    }

    public Long getSort()
    {
        return sort;
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
                .append("name", getName())
                .append("id", getId())
                .append("code", getCode())
                .append("sort", getSort())
                .append("remark", getRemark())
                .append("available", getAvailable())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}