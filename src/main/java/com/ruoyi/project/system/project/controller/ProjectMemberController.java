package com.ruoyi.project.system.project.controller;

import java.util.List;
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
import com.ruoyi.project.system.project.domain.ProjectMember;
import com.ruoyi.project.system.project.service.IProjectMemberService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 项目成员Controller
 * 
 * @author zxy
 * @date 2022-01-10
 */
@Controller
@RequestMapping("/system/projectmember")
public class ProjectMemberController extends BaseController
{
    private String prefix = "system/projectmember";

    @Autowired
    private IProjectMemberService projectMemberService;

    @RequiresPermissions("system:projectmember:view")
    @GetMapping()
    public String projectmember()
    {
        return prefix + "/projectmember";
    }

    /**
     * 查询项目成员列表
     */
    @RequiresPermissions("system:projectmember:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProjectMember projectMember)
    {
        startPage();
        List<ProjectMember> list = projectMemberService.selectProjectMemberList(projectMember);
        return getDataTable(list);
    }

    /**
     * 导出项目成员列表
     */
    @RequiresPermissions("system:projectmember:export")
    @Log(title = "项目成员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProjectMember projectMember)
    {
        List<ProjectMember> list = projectMemberService.selectProjectMemberList(projectMember);
        ExcelUtil<ProjectMember> util = new ExcelUtil<ProjectMember>(ProjectMember.class);
        return util.exportExcel(list, "项目成员数据");
    }

    /**
     * 新增项目成员
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存项目成员
     */
    @RequiresPermissions("system:projectmember:add")
    @Log(title = "项目成员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProjectMember projectMember)
    {
        return toAjax(projectMemberService.insertProjectMember(projectMember));
    }

    /**
     * 修改项目成员
     */
    @RequiresPermissions("system:projectmember:edit")
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        ProjectMember projectMember = projectMemberService.selectProjectMemberByUserId(userId);
        mmap.put("projectMember", projectMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存项目成员
     */
    @RequiresPermissions("system:projectmember:edit")
    @Log(title = "项目成员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProjectMember projectMember)
    {
        return toAjax(projectMemberService.updateProjectMember(projectMember));
    }

    /**
     * 删除项目成员
     */
    @RequiresPermissions("system:projectmember:remove")
    @Log(title = "项目成员", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(projectMemberService.deleteProjectMemberByUserIds(ids));
    }
}
