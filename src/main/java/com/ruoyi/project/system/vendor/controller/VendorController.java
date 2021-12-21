package com.ruoyi.project.system.vendor.controller;

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
import com.ruoyi.project.system.vendor.domain.Vendor;
import com.ruoyi.project.system.vendor.service.IVendorService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 供应商Controller
 * 
 * @author zxy
 * @date 2021-12-21
 */
@Controller
@RequestMapping("/system/vendor")
public class VendorController extends BaseController
{
    private String prefix = "system/vendor";

    @Autowired
    private IVendorService vendorService;

    @RequiresPermissions("system:vendor:view")
    @GetMapping()
    public String vendor()
    {
        return prefix + "/vendor";
    }

    /**
     * 查询供应商列表
     */
    @RequiresPermissions("system:vendor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Vendor vendor)
    {
        startPage();
        List<Vendor> list = vendorService.selectVendorList(vendor);
        return getDataTable(list);
    }

    /**
     * 导出供应商列表
     */
    @RequiresPermissions("system:vendor:export")
    @Log(title = "供应商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Vendor vendor)
    {
        List<Vendor> list = vendorService.selectVendorList(vendor);
        ExcelUtil<Vendor> util = new ExcelUtil<Vendor>(Vendor.class);
        return util.exportExcel(list, "供应商数据");
    }

    /**
     * 新增供应商
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供应商
     */
    @RequiresPermissions("system:vendor:add")
    @Log(title = "供应商", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Vendor vendor)
    {
        return toAjax(vendorService.insertVendor(vendor));
    }

    /**
     * 修改供应商
     */
    @RequiresPermissions("system:vendor:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Vendor vendor = vendorService.selectVendorById(id);
        mmap.put("vendor", vendor);
        return prefix + "/edit";
    }

    /**
     * 修改保存供应商
     */
    @RequiresPermissions("system:vendor:edit")
    @Log(title = "供应商", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Vendor vendor)
    {
        return toAjax(vendorService.updateVendor(vendor));
    }

    /**
     * 删除供应商
     */
    @RequiresPermissions("system:vendor:remove")
    @Log(title = "供应商", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vendorService.deleteVendorByIds(ids));
    }
}
