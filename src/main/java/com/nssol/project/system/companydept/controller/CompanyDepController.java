package com.nssol.project.system.companydept.controller;

import java.util.List;

import com.nssol.project.system.company.service.ICompanyService;
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
import com.nssol.project.system.companydept.domain.CompanyDep;
import com.nssol.project.system.companydept.service.ICompanyDepService;
import com.nssol.framework.web.controller.BaseController;
import com.nssol.framework.web.domain.AjaxResult;
import com.nssol.common.utils.poi.ExcelUtil;
import com.nssol.framework.web.page.TableDataInfo;

/**
 * 公司部门Controller
 * 
 * @author zxy
 * @date 2022-02-22
 */
@Controller
@RequestMapping("/system/companydept")
public class CompanyDepController extends BaseController
{
    private String prefix = "system/companydept";

    @Autowired
    private ICompanyDepService companyDepService;

    @Autowired
    private ICompanyService companyService;

    @RequiresPermissions("system:companydept:view")
    @GetMapping()
    public String companydept(ModelMap mmap)
    {
        mmap.put("companies", companyService.selectCompaniesAll());
        return prefix + "/companydept";
    }

    /**
     * 查询公司部门列表
     */
    @RequiresPermissions("system:companydept:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CompanyDep companyDep)
    {
        startPage();
        List<CompanyDep> list = companyDepService.selectCompanyDepList(companyDep);
        return getDataTable(list);
    }

    /**
     * 导出公司部门列表
     */
    @RequiresPermissions("system:companydept:export")
    @Log(title = "公司部门", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CompanyDep companyDep)
    {
        List<CompanyDep> list = companyDepService.selectCompanyDepList(companyDep);
        ExcelUtil<CompanyDep> util = new ExcelUtil<CompanyDep>(CompanyDep.class);
        return util.exportExcel(list, "公司部门数据");
    }

    /**
     * 新增公司部门
     */
    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        mmap.put("companies", companyService.selectCompaniesAll());
        return prefix + "/add";
    }

    /**
     * 新增保存公司部门
     */
    @RequiresPermissions("system:companydept:add")
    @Log(title = "公司部门", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CompanyDep companyDep)
    {
        return toAjax(companyDepService.insertCompanyDep(companyDep));
    }

    /**
     * 修改公司部门
     */
    @RequiresPermissions("system:companydept:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CompanyDep companyDep = companyDepService.selectCompanyDepById(id);
        mmap.put("companyDep", companyDep);
        mmap.put("companies", companyService.selectCompaniesAll());
        return prefix + "/edit";
    }

    /**
     * 修改保存公司部门
     */
    @RequiresPermissions("system:companydept:edit")
    @Log(title = "公司部门", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CompanyDep companyDep)
    {
        return toAjax(companyDepService.updateCompanyDep(companyDep));
    }

    /**
     * 删除公司部门
     */
    @RequiresPermissions("system:companydept:remove")
    @Log(title = "公司部门", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(companyDepService.deleteCompanyDepByIds(ids));
    }
}
