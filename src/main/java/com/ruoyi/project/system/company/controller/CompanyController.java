package com.ruoyi.project.system.company.controller;

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
import com.ruoyi.project.system.company.domain.Company;
import com.ruoyi.project.system.company.service.ICompanyService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 公司Controller
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Controller
@RequestMapping("/system/company")
public class CompanyController extends BaseController
{
    private String prefix = "system/company";

    @Autowired
    private ICompanyService companyService;

    @RequiresPermissions("system:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询公司列表
     */
    @RequiresPermissions("system:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Company company)
    {
        startPage();
        List<Company> list = companyService.selectCompanyList(company);
        return getDataTable(list);
    }

    /**
     * 导出公司列表
     */
    @RequiresPermissions("system:company:export")
    @Log(title = "公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Company company)
    {
        List<Company> list = companyService.selectCompanyList(company);
        ExcelUtil<Company> util = new ExcelUtil<Company>(Company.class);
        return util.exportExcel(list, "公司数据");
    }

    /**
     * 新增公司
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公司
     */
    @RequiresPermissions("system:company:add")
    @Log(title = "公司", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Company company)
    {
        return toAjax(companyService.insertCompany(company));
    }

    /**
     * 修改公司
     */
    @RequiresPermissions("system:company:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Company company = companyService.selectCompanyById(id);
        mmap.put("company", company);
        return prefix + "/edit";
    }

    /**
     * 修改保存公司
     */
    @RequiresPermissions("system:company:edit")
    @Log(title = "公司", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Company company)
    {
        return toAjax(companyService.updateCompany(company));
    }

    /**
     * 删除公司
     */
    @RequiresPermissions("system:company:remove")
    @Log(title = "公司", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(companyService.deleteCompanyByIds(ids));
    }
}
