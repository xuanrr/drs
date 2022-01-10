package com.ruoyi.project.system.project.service;

import java.util.List;
import com.ruoyi.project.system.project.domain.ProjectMember;

/**
 * 项目成员Service接口
 * 
 * @author zxy
 * @date 2022-01-10
 */
public interface IProjectMemberService 
{
    /**
     * 查询项目成员
     * 
     * @param userId 项目成员主键
     * @return 项目成员
     */
    public ProjectMember selectProjectMemberByUserId(Long userId);

    /**
     * 查询项目成员列表
     * 
     * @param projectMember 项目成员
     * @return 项目成员集合
     */
    public List<ProjectMember> selectProjectMemberList(ProjectMember projectMember);

    /**
     * 新增项目成员
     * 
     * @param projectMember 项目成员
     * @return 结果
     */
    public int insertProjectMember(ProjectMember projectMember);

    /**
     * 修改项目成员
     * 
     * @param projectMember 项目成员
     * @return 结果
     */
    public int updateProjectMember(ProjectMember projectMember);

    /**
     * 批量删除项目成员
     * 
     * @param userIds 需要删除的项目成员主键集合
     * @return 结果
     */
    public int deleteProjectMemberByUserIds(String userIds);

    /**
     * 删除项目成员信息
     * 
     * @param userId 项目成员主键
     * @return 结果
     */
    public int deleteProjectMemberByUserId(Long userId);
}
