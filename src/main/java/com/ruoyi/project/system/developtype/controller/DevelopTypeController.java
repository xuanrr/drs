package com.ruoyi.project.system.developtype.controller;

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
import com.ruoyi.project.system.developtype.domain.DevelopType;
import com.ruoyi.project.system.developtype.service.IDevelopTypeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 运维类型Controller
 *
 * @author zxy
 * @date 2022-02-21
 */
@Controller
@RequestMapping("/system/developtype")
public class DevelopTypeController extends BaseController
{
    private String prefix = "system/developtype";

    @Autowired
    private IDevelopTypeService developTypeService;

    @RequiresPermissions("system:developtype:view")
    @GetMapping()
    public String developtype()
    {
        return prefix + "/developtype";
    }

    /**
     * 查询运维类型列表
     */
    @RequiresPermissions("system:developtype:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DevelopType developType)
    {
        startPage();
        List<DevelopType> list = developTypeService.selectDevelopTypeList(developType);
        return getDataTable(list);
    }

    /**
     * 导出运维类型列表
     */
    @RequiresPermissions("system:developtype:export")
    @Log(title = "运维类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DevelopType developType)
    {
        List<DevelopType> list = developTypeService.selectDevelopTypeList(developType);
        ExcelUtil<DevelopType> util = new ExcelUtil<DevelopType>(DevelopType.class);
        return util.exportExcel(list, "运维类型数据");
    }

    /**
     * 新增运维类型
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存运维类型
     */
    @RequiresPermissions("system:developtype:add")
    @Log(title = "运维类型", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DevelopType developType)
    {
        return toAjax(developTypeService.insertDevelopType(developType));
    }

    /**
     * 修改运维类型
     */
    @RequiresPermissions("system:developtype:edit")
    @GetMapping("/edit/{name}")
    public String edit(@PathVariable("name") String name, ModelMap mmap)
    {
        DevelopType developType = developTypeService.selectDevelopTypeByName(name);
        mmap.put("developType", developType);
        return prefix + "/edit";
    }

    /**
     * 修改保存运维类型
     */
    @RequiresPermissions("system:developtype:edit")
    @Log(title = "运维类型", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DevelopType developType)
    {
        return toAjax(developTypeService.updateDevelopType(developType));
    }

    /**
     * 删除运维类型
     */
    @RequiresPermissions("system:developtype:remove")
    @Log(title = "运维类型", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(developTypeService.deleteDevelopTypeByNames(ids));
    }
}