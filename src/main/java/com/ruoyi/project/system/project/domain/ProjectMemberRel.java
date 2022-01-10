package com.ruoyi.project.system.project.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

import java.util.Date;

public class ProjectMemberRel extends BaseEntity {

    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

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

    private String customerName;

    private String entrustName;

    @Excel(name = "人天")
    private Long manDay;

    /** 是否需要供应商 */
    @Excel(name = "是否需要供应商")
    private Long vendorNeeded;

    /** 委托方式(请负1|委托2) */
    private Long entrustType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEntrustName() {
        return entrustName;
    }

    public void setEntrustName(String entrustName) {
        this.entrustName = entrustName;
    }

    public Long getManDay() {
        return manDay;
    }

    public void setManDay(Long manDay) {
        this.manDay = manDay;
    }

    public Long getVendorNeeded() {
        return vendorNeeded;
    }

    public void setVendorNeeded(Long vendorNeeded) {
        this.vendorNeeded = vendorNeeded;
    }

    public Long getEntrustType() {
        return entrustType;
    }

    public void setEntrustType(Long entrustType) {
        this.entrustType = entrustType;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Long getAvailable() {
        return available;
    }

    public void setAvailable(Long available) {
        this.available = available;
    }

    public Long getVendorManday() {
        return vendorManday;
    }

    public void setVendorManday(Long vendorManday) {
        this.vendorManday = vendorManday;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /** 供应商 */
    @Excel(name = "供应商")
    private String vendorName;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private Long available;

    @Excel(name = "供应商人天")
    private Long vendorManday;

    @Excel(name = "")
    private Long userId;

    /**  */
    @Excel(name = "")
    private Long projectId;


}
