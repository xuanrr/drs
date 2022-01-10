package com.ruoyi.project.system.project.service.impl;

import com.ruoyi.project.system.project.domain.Project;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.domain.ProjectMemberRel;
import com.ruoyi.project.system.project.mapper.ProjectMapper;
import com.ruoyi.project.system.project.mapper.ProjectMemberMapper;
import com.ruoyi.project.system.project.mapper.ProjectMemberRelMapper;
import com.ruoyi.project.system.project.service.IProjectMemberRelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectMemberRelImpl implements IProjectMemberRelService{
    @Autowired
    ProjectMemberRelMapper projectMemberRelMapper;
    @Autowired
    ProjectMember projectMember;
    @Autowired
    Project project;
    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    ProjectMemberMapper projectMemberMapper;

    @Override
    public List<ProjectMemberRel> selectProjectMemberRelList(ProjectMemberRel projectMemberRel) {
        return projectMemberRelMapper.selectProjectMemberRelList(projectMemberRel);
    }

    @Override
    public int insertProjectMemberRel(ProjectMemberRel projectMemberRel,Project project,ProjectMember projectMember) {
        project.setName(projectMemberRel.getName());
        project.setCode(projectMemberRel.getCode());
        project.setAvailable(projectMemberRel.getAvailable());
        project.setCustomerId(projectMemberRel.getCustomerId());
        project.setManDay(projectMemberRel.getManDay());
        project.setVendorNeeded(projectMemberRel.getVendorNeeded());
        project.setVendorName(projectMemberRel.getVendorName());
        project.setVendorManday(projectMemberRel.getVendorManday());


        projectMember.setProjectId(projectMemberRel.getId());
        projectMember.setUserId(projectMemberRel.getUserId());
        return projectMapper.insertProject(project);
    }

    @Override
    public int updateProjectMemberRel(ProjectMemberRel projectMemberRel) {
        return projectMemberRelMapper.updateProjectMemberRel(projectMemberRel);
    }

    @Override
    public int deleteProjectMemberRelById(Long id) {
        return projectMemberRelMapper.deleteProjectMemberRelById(id);
    }

    @Override
    public int deleteProjectMemberByUserIds(String[] ids) {
        return projectMemberRelMapper.deleteProjectMemberByUserIds(ids);
    }
}
