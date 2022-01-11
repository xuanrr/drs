package com.ruoyi.project.system.project.controller;

import java.util.List;

import com.ruoyi.project.system.company.service.ICompanyService;
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.domain.ProjectMemberRel;
import com.ruoyi.project.system.project.service.IProjectMemberRelService;
import com.ruoyi.project.system.project.service.IProjectMemberService;
import com.ruoyi.project.system.user.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.project.domain.Project;
import com.ruoyi.project.system.project.service.IProjectService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 项目Controller
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Controller
@RequestMapping("/system/project")
public class ProjectController extends BaseController
{
    private String prefix = "system/project";

    @Autowired
    private IProjectService projectService;

    @Autowired
    private ICompanyService companyService;

    @Autowired
    private IProjectMemberRelService projectMemberRelService;

    @Autowired
    private IUserService userService;

    @RequiresPermissions("system:project:view")
    @GetMapping()
    public String project()
    {
        return prefix + "/project";
    }

    /**
     * 查询项目列表
     */
    @RequiresPermissions("system:project:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Project project)
    {
        startPage();
        List<Project> list = projectService.selectProjectList(project);
        return getDataTable(list);
    }

    /**
     * 导出项目列表
     */
    @RequiresPermissions("system:project:export")
    @Log(title = "项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Project project)
    {
        List<Project> list = projectService.selectProjectList(project);
        ExcelUtil<Project> util = new ExcelUtil<Project>(Project.class);
        return util.exportExcel(list, "项目数据");
    }

    /**
     * 新增项目
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        mmap.put("users", userService.selectNormalUserList());
        mmap.put("vendors",companyService.selectVendorAll());
        mmap.put("customers",companyService.selectCustomerAll());
        return prefix + "/add";
    }

    /**
     * 新增保存项目
     */
    @RequiresPermissions("system:project:add")
    @Log(title = "项目", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProjectMemberRel projectMemberRel)
    {
        return toAjax(projectMemberRelService.insertProjectMemberRel(projectMemberRel));
    }

    /**
     * 修改项目
     */
    @RequiresPermissions("system:project:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProjectMemberRel projectMemberRel = projectMemberRelService.selectProjectMemberRelById(id);
        mmap.put("users", userService.selectNormalUserList());
        mmap.put("vendors",companyService.selectVendorAll());
        mmap.put("customers",companyService.selectCustomerAll());
        mmap.put("project", projectMemberRel);
        return prefix + "/edit";
    }

    /**
     * 修改保存项目
     */
    @RequiresPermissions("system:project:edit")
    @Log(title = "项目", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProjectMemberRel projectMemberRel)
    {
        return toAjax(projectMemberRelService.updateProjectMemberRel(projectMemberRel));
    }

    /**
     * 删除项目
     */
    @RequiresPermissions("system:project:remove")
    @Log(title = "项目", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(projectService.deleteProjectByIds(ids));
    }
}
