package com.ruoyi.project.system.project.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.project.mapper.ProjectMemberMapper;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.service.IProjectMemberService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 项目成员Service业务层处理
 * 
 * @author zxy
 * @date 2022-01-10
 */
@Service
public class ProjectMemberServiceImpl implements IProjectMemberService 
{
    @Autowired
    private ProjectMemberMapper projectMemberMapper;

    /**
     * 查询项目成员
     * 
     * @param userId 项目成员主键
     * @return 项目成员
     */
    @Override
    public ProjectMember selectProjectMemberByUserId(Long userId)
    {
        return projectMemberMapper.selectProjectMemberByUserId(userId);
    }

    /**
     * 查询项目成员列表
     * 
     * @param projectMember 项目成员
     * @return 项目成员
     */
    @Override
    public List<ProjectMember> selectProjectMemberList(ProjectMember projectMember)
    {
        return projectMemberMapper.selectProjectMemberList(projectMember);
    }

    /**
     * 新增项目成员
     * 
     * @param projectMember 项目成员
     * @return 结果
     */
    @Override
    public int insertProjectMember(ProjectMember projectMember)
    {
        return projectMemberMapper.insertProjectMember(projectMember);
    }

    /**
     * 修改项目成员
     * 
     * @param projectMember 项目成员
     * @return 结果
     */
    @Override
    public int updateProjectMember(ProjectMember projectMember)
    {
        return projectMemberMapper.updateProjectMember(projectMember);
    }

    /**
     * 批量删除项目成员
     * 
     * @param userIds 需要删除的项目成员主键
     * @return 结果
     */
    @Override
    public int deleteProjectMemberByUserIds(String userIds)
    {
        return projectMemberMapper.deleteProjectMemberByUserIds(Convert.toStrArray(userIds));
    }

    /**
     * 删除项目成员信息
     * 
     * @param userId 项目成员主键
     * @return 结果
     */
    @Override
    public int deleteProjectMemberByUserId(Long userId)
    {
        return projectMemberMapper.deleteProjectMemberByUserId(userId);
    }
}
