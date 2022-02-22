package com.ruoyi.project.system.project.mapper;

import java.util.List;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.user.domain.UserPost;
import org.springframework.stereotype.Repository;

/**
 * 项目成员Mapper接口
 * 
 * @author zxy
 * @date 2022-01-10
 */
@Repository
public interface ProjectMemberMapper 
{
    /**
     * 通过项目ID删除项目和成员关联
     *
     * @param projectId 项目ID
     * @return 结果
     */
    public int deleteProjectMemberByProjectId(Long projectId);

//    /**
//     * 通过岗位ID查询岗位使用数量
//     *
//     * @param postId 岗位ID
//     * @return 结果
//     */
//    public int countProjectMemberById(Long postId);

    /**
     * 批量删除项目和成员
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProjectMember(Long[] ids);

    /**
     * 批量新增项目成员信息
     *
     * @param memberList 成员列表
     * @return 结果
     */
    public int batchProjectMember(List<ProjectMember> memberList);
}
