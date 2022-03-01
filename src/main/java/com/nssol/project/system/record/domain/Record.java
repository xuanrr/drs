package com.nssol.project.system.record.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.nssol.framework.aspectj.lang.annotation.Excel;
import com.nssol.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 运维记录对象 m_record
 * 
 * @author zxy
 * @date 2022-03-01
 */
public class Record extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 画面 */
    @Excel(name = "画面")
    private String page;

    /** 项目Id */
    private Long projectId;

    /** 项目名称 */
    @Excel(name = "项目")
    private String projectName;

    /** 运维类型 */
    private Long developTypeId;



    /** 运维类型名称 */
    @Excel(name = "运维类型名称")
    private String developName;

    /** 问题 */
    @Excel(name = "问题")
    private String problem;

    /** 操作详细 */
    @Excel(name = "操作详细")
    private String developDetail;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 提出人 */
    @Excel(name = "提出人")
    private String presentor;

    /** 提出日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提出日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date presentDate;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 完成日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date completeDate;

    /** 确认日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "确认日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date confirmDate;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setPage(String page)
    {
        this.page = page;
    }

    public String getPage()
    {
        return page;
    }
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
    }
    public void setDevelopTypeId(Long developTypeId)
    {
        this.developTypeId = developTypeId;
    }

    public String getProjectName() {return projectName;}

    public void setProjectName(String projectName) {this.projectName = projectName;}

    public String getDevelopName() {return developName;}

    public void setDevelopName(String developName) {this.developName = developName;}

    public Long getDevelopTypeId()
    {
        return developTypeId;
    }
    public void setProblem(String problem)
    {
        this.problem = problem;
    }

    public String getProblem()
    {
        return problem;
    }
    public void setDevelopDetail(String developDetail)
    {
        this.developDetail = developDetail;
    }

    public String getDevelopDetail()
    {
        return developDetail;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setPresentor(String presentor)
    {
        this.presentor = presentor;
    }

    public String getPresentor()
    {
        return presentor;
    }
    public void setPresentDate(Date presentDate)
    {
        this.presentDate = presentDate;
    }

    public Date getPresentDate()
    {
        return presentDate;
    }
    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getOperator()
    {
        return operator;
    }
    public void setCompleteDate(Date completeDate)
    {
        this.completeDate = completeDate;
    }

    public Date getCompleteDate()
    {
        return completeDate;
    }
    public void setConfirmDate(Date confirmDate)
    {
        this.confirmDate = confirmDate;
    }

    public Date getConfirmDate()
    {
        return confirmDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("page", getPage())
            .append("projectId", getProjectId())
            .append("projectName", getProjectName())
            .append("developTypeId", getDevelopTypeId())
            .append("developName",getDevelopName())
            .append("problem", getProblem())
            .append("developDetail", getDevelopDetail())
            .append("status", getStatus())
            .append("presentor", getPresentor())
            .append("presentDate", getPresentDate())
            .append("operator", getOperator())
            .append("completeDate", getCompleteDate())
            .append("confirmDate", getConfirmDate())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
