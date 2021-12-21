package com.ruoyi.project.system.project.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 项目对象 m_project
 * 
 * @author zxy
 * @date 2021-12-21
 */
public class Project extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 项目代码 */
    @Excel(name = "项目代码")
    private String code;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 客户 */
    private Long customerId;

    /** 人天 */
    @Excel(name = "人天")
    private Long manDay;

    /** 是否需要供应商 */
    @Excel(name = "是否需要供应商")
    private Long vendorNeeded;

    /** 委托方式(请负1|委托2) */
    private Long entrustType;

    /** 供应商 */
    @Excel(name = "供应商")
    private String vendorName;

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
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public Date getStartDate()
    {
        return startDate;
    }
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }
    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public Long getCustomerId()
    {
        return customerId;
    }
    public void setManDay(Long manDay)
    {
        this.manDay = manDay;
    }

    public Long getManDay()
    {
        return manDay;
    }
    public void setVendorNeeded(Long vendorNeeded)
    {
        this.vendorNeeded = vendorNeeded;
    }

    public Long getVendorNeeded()
    {
        return vendorNeeded;
    }
    public void setEntrustType(Long entrustType)
    {
        this.entrustType = entrustType;
    }

    public Long getEntrustType()
    {
        return entrustType;
    }
    public void setVendorName(String vendorName)
    {
        this.vendorName = vendorName;
    }

    public String getVendorName()
    {
        return vendorName;
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
            .append("code", getCode())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("customerId", getCustomerId())
            .append("manDay", getManDay())
            .append("vendorNeeded", getVendorNeeded())
            .append("entrustType", getEntrustType())
            .append("vendorName", getVendorName())
            .append("available", getAvailable())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
