package com.ruoyi.project.system.record.controller;

import java.util.List;

import com.ruoyi.project.system.developtype.mapper.DevelopTypeMapper;
import com.ruoyi.project.system.project.mapper.ProjectMapper;
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
import com.ruoyi.project.system.record.domain.Record;
import com.ruoyi.project.system.record.service.IRecordService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 运维记录Controller
 * 
 * @author zxy
 * @date 2022-02-24
 */
@Controller
@RequestMapping("/system/record")
public class RecordController extends BaseController
{
    private String prefix = "system/record";

    @Autowired
    private IRecordService recordService;

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private DevelopTypeMapper developTypeMapper;

    @RequiresPermissions("system:record:view")
    @GetMapping()
    public String record()
    {
        return prefix + "/record";
    }

    /**
     * 查询运维记录列表
     */
    @RequiresPermissions("system:record:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Record record)
    {
        startPage();
        List<Record> list = recordService.selectRecordList(record);
        return getDataTable(list);
    }

    /**
     * 导出运维记录列表
     */
    @RequiresPermissions("system:record:export")
    @Log(title = "运维记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Record record)
    {
        List<Record> list = recordService.selectRecordList(record);
        ExcelUtil<Record> util = new ExcelUtil<Record>(Record.class);
        return util.exportExcel(list, "运维记录数据");
    }

    /**
     * 新增运维记录
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        mmap.put("developTypes", developTypeMapper.selectAllDevelopType());
        mmap.put("projects", projectMapper.selectAllProjects());
        return prefix + "/add";
    }

    /**
     * 新增保存运维记录
     */
    @RequiresPermissions("system:record:add")
    @Log(title = "运维记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Record record)
    {
        return toAjax(recordService.insertRecord(record));
    }

    /**
     * 修改运维记录
     */
    @RequiresPermissions("system:record:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Record record = recordService.selectRecordById(id);
        mmap.put("developtypes", developTypeMapper.selectAllDevelopType());
        mmap.put("projects", projectMapper.selectAllProjects());
        mmap.put("record", record);
        return prefix + "/edit";
    }

    /**
     * 修改保存运维记录
     */
    @RequiresPermissions("system:record:edit")
    @Log(title = "运维记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Record record)
    {
        return toAjax(recordService.updateRecord(record));
    }

    /**
     * 删除运维记录
     */
    @RequiresPermissions("system:record:remove")
    @Log(title = "运维记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(recordService.deleteRecordByIds(ids));
    }
}
