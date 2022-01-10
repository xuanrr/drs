package com.ruoyi.project.system.project.service;

import com.ruoyi.project.system.project.domain.Project;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.domain.ProjectMemberRel;

import java.util.List;

public interface IProjectMemberRelService {
    public List<ProjectMemberRel> selectProjectMemberRelList(ProjectMemberRel projectMemberRel);

    public int insertProjectMemberRel(ProjectMemberRel projectMemberRel, Project project, ProjectMember projectMember);

    public int updateProjectMemberRel(ProjectMemberRel projectMemberRel);

    public int deleteProjectMemberRelById(Long id);

    public int deleteProjectMemberByUserIds(String[] ids);
}
