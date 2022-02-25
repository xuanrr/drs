package com.nssol.project.system.project.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.nssol.framework.aspectj.lang.annotation.Excel;
import com.nssol.framework.web.domain.BaseEntity;

/**
 * 项目成员对象 m_project_member
 * 
 * @author zxy
 * @date 2022-01-10
 */
public class ProjectMember extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private Long userId;

    /**  */
    @Excel(name = "")
    private Long projectId;

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("projectId", getProjectId())
            .toString();
    }
}
