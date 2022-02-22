package com.ruoyi.project.system.project.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.mapper.ProjectMemberMapper;
import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.domain.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.project.mapper.ProjectMapper;
import com.ruoyi.project.system.project.domain.Project;
import com.ruoyi.project.system.project.service.IProjectService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 项目Service业务层处理
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Service
public class ProjectServiceImpl implements IProjectService 
{
    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private ProjectMemberMapper projectMemberMapper;

    /**
     * 查询项目
     * 
     * @param id 项目主键
     * @return 项目
     */
    @Override
    public Project selectProjectById(Long id)
    {
        return projectMapper.selectProjectById(id);
    }

    @Override
    public List<Project> selectAllProjectList() {
        return projectMapper.selectAllProjectList();
    }

    /**
     * 查询项目列表
     * 
     * @param project 项目
     * @return 项目
     */
    @Override
    public List<Project> selectProjectList(Project project)
    {
        return projectMapper.selectProjectList(project);
    }

    /**
     * 新增项目
     * 
     * @param project 项目
     * @return 结果
     */
    @Override
    public int insertProject(Project project)
    {
        project.setCreateBy(ShiroUtils.getLoginName());
        project.setCreateTime(DateUtils.getNowDate());
        project.setUpdateBy(ShiroUtils.getLoginName());
        project.setUpdateTime(DateUtils.getNowDate());

        int rows=projectMapper.insertProject(project);

        insertProjectMember(project);
        return rows;
    }

    /**
     * 修改项目
     * 
     * @param project 项目
     * @return 结果
     */
    @Override
    public int updateProject(Project project)
    {
        Long projectId = project.getId();

        project.setUpdateBy(ShiroUtils.getLoginName());
        project.setUpdateTime(DateUtils.getNowDate());

        projectMemberMapper.deleteProjectMemberByProjectId(projectId);
        insertProjectMember(project);
        return projectMapper.updateProject(project);
    }

    /**
     * 批量删除项目
     * 
     * @param ids 需要删除的项目主键
     * @return 结果
     */
    @Override
    public int deleteProjectByIds(String ids)
    {
        Long[] projectIds = Convert.toLongArray(ids);
        projectMemberMapper.deleteProjectMember(projectIds);
        return projectMapper.deleteProjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除项目信息
     * 
     * @param id 项目主键
     * @return 结果
     */
    @Override
    public int deleteProjectById(Long id)
    {
        projectMemberMapper.deleteProjectMemberByProjectId(id);
        return projectMapper.deleteProjectById(id);
    }

    /**
     * 新增项目成员信息
     *
     * @param project 用户对象
     */
    public void insertProjectMember(Project project)
    {
        Long[] users = project.getUserIds();
        if (StringUtils.isNotNull(users))
        {
            // 新增项目和成员
            List<ProjectMember> list = new ArrayList<ProjectMember>();
            for (Long userId : project.getUserIds())
            {
                ProjectMember pm = new ProjectMember();
                pm.setProjectId(project.getId());
                pm.setUserId(userId);
                list.add(pm);
            }
            if (list.size() > 0)
            {
                projectMemberMapper.batchProjectMember(list);
            }
        }
    }
}
