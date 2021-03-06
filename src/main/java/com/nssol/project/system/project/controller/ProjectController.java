package com.nssol.project.system.project.controller;

import java.util.List;

import com.nssol.project.system.company.service.ICompanyService;
import com.nssol.project.system.user.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.nssol.framework.aspectj.lang.annotation.Log;
import com.nssol.framework.aspectj.lang.enums.BusinessType;
import com.nssol.project.system.project.domain.Project;
import com.nssol.project.system.project.service.IProjectService;
import com.nssol.framework.web.controller.BaseController;
import com.nssol.framework.web.domain.AjaxResult;
import com.nssol.common.utils.poi.ExcelUtil;
import com.nssol.framework.web.page.TableDataInfo;

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
    private IUserService userService;

    @RequiresPermissions("system:project:view")
    @GetMapping()
    public String project(ModelMap mmap)
    {
        mmap.put("users", userService.selectNormalUserList());
        mmap.put("vendors",companyService.selectVendorAll());
        mmap.put("customers",companyService.selectCustomerAll());
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
    public AjaxResult addSave(Project project)
    {
        return toAjax(projectService.insertProject(project));
    }

    /**
     * 修改项目
     */
    @RequiresPermissions("system:project:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Project project = projectService.selectProjectById(id);
        mmap.put("users", userService.selectUsersByProjectId(id));
        mmap.put("vendors",companyService.selectVendorAll());
        mmap.put("customers",companyService.selectCustomerAll());
        mmap.put("project", project);
        return prefix + "/edit";
    }

    /**
     * 修改保存项目
     */
    @RequiresPermissions("system:project:edit")
    @Log(title = "项目", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Project project)
    {
        return toAjax(projectService.updateProject(project));
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
