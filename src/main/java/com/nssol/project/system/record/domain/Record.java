package com.nssol.project.system.record.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.nssol.framework.aspectj.lang.annotation.Excel;
import com.nssol.framework.web.domain.BaseEntity;

/**
 * 运维记录对象 m_record
 * 
 * @author zxy
 * @date 2022-02-24
 */
public class Record extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** Id */
    private Long id;

    /** 项目 */
    @Excel(name = "项目")
    private Long projectId;

    /** 运维类型Id */
    @Excel(name= "运维类型")
    private Long developTypeId;

    /** 运维类型名称 */
    @Excel(name = "运维类型名称")
    private String developName;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 运维详细信息 */
    @Excel(name = "运维详细信息")
    private String developDetail;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDevelopName() {return developName;}

    public void setDevelopName(String developName) {this.developName = developName;}

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
    }
    public void setDevelopType(Long developTypeId)
    {
        this.developTypeId = developTypeId;
    }

    public Long getDevelopType()
    {
        return developTypeId;
    }
    public void setDevelopDetail(String developDetail)
    {
        this.developDetail = developDetail;
    }

    public String getDevelopDetail()
    {
        return developDetail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectId", getProjectId())
            .append("developType", getDevelopType())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("developDetail", getDevelopDetail())
            .toString();
    }
}
