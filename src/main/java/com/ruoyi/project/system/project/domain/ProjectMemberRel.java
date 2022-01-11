package com.ruoyi.project.system.project.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;
@Data
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
