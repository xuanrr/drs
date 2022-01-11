package com.ruoyi.project.system.project.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.project.system.project.domain.Project;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.domain.ProjectMemberRel;
import com.ruoyi.project.system.project.mapper.ProjectMapper;
import com.ruoyi.project.system.project.mapper.ProjectMemberMapper;
import com.ruoyi.project.system.project.mapper.ProjectMemberRelMapper;
import com.ruoyi.project.system.project.service.IProjectMemberRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectMemberRelImpl implements IProjectMemberRelService{
    @Autowired
    ProjectMemberRelMapper projectMemberRelMapper;

    @Autowired
    ProjectMapper projectMapper;
    @Autowired
    ProjectMemberMapper projectMemberMapper;

//    @Autowired
//    private ApplicationContext applicationContext;

    @Override
    public ProjectMemberRel selectProjectMemberRelById(Long id) {
        return projectMemberRelMapper.selectProjectMemberRelById(id);
    }

    @Override
    public List<ProjectMemberRel> selectProjectMemberRelList(ProjectMemberRel projectMemberRel) {
        return projectMemberRelMapper.selectProjectMemberRelList(projectMemberRel);
    }

    @Override
    public int insertProjectMemberRel(ProjectMemberRel projectMemberRel) {
        Project project = new Project();
        project.setName(projectMemberRel.getName());
        project.setCode(projectMemberRel.getCode());
        project.setAvailable(projectMemberRel.getAvailable());
        project.setCustomerId(projectMemberRel.getCustomerId());
        project.setManDay(projectMemberRel.getManDay());
        project.setVendorNeeded(projectMemberRel.getVendorNeeded());
        project.setVendorName(projectMemberRel.getVendorName());
        project.setVendorManday(projectMemberRel.getVendorManday());
        project.setEntrustType(projectMemberRel.getEntrustType());
        project.setRemark(projectMemberRel.getRemark());
        project.setCreateBy(ShiroUtils.getLoginName());
        project.setCreateTime(DateUtils.getNowDate());
        project.setUpdateBy(ShiroUtils.getLoginName());
        project.setUpdateTime(DateUtils.getNowDate());
        project.setStartDate(projectMemberRel.getStartDate());
        project.setEndDate(projectMemberRel.getEndDate());
        int i = projectMapper.insertProject(project);

        System.out.println(project.getId());


        ProjectMember projectMember = new ProjectMember();
        projectMember.setProjectId(project.getId());
        projectMember.setUserId(projectMemberRel.getUserId());

        return i & projectMemberMapper.insertProjectMember(projectMember);
    }

    @Override
    public int updateProjectMemberRel(ProjectMemberRel projectMemberRel) {
        Project project = new Project();
        project.setId(projectMemberRel.getId());
        project.setName(projectMemberRel.getName());
        project.setCode(projectMemberRel.getCode());
        project.setAvailable(projectMemberRel.getAvailable());
        project.setCustomerId(projectMemberRel.getCustomerId());
        project.setManDay(projectMemberRel.getManDay());
        project.setVendorNeeded(projectMemberRel.getVendorNeeded());
        project.setVendorName(projectMemberRel.getVendorName());
        project.setVendorManday(projectMemberRel.getVendorManday());
        project.setEntrustType(projectMemberRel.getEntrustType());
        project.setRemark(projectMemberRel.getRemark());
        project.setUpdateBy(ShiroUtils.getLoginName());
        project.setUpdateTime(DateUtils.getNowDate());
        int i = projectMapper.updateProject(project);

        ProjectMember projectMember = new ProjectMember();
        projectMember.setProjectId(project.getId());
        projectMember.setUserId(projectMemberRel.getUserId());
        return i & projectMemberMapper.updateProjectMember(projectMember);
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
