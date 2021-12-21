package com.ruoyi.project.system.vendor.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.vendor.mapper.VendorMapper;
import com.ruoyi.project.system.vendor.domain.Vendor;
import com.ruoyi.project.system.vendor.service.IVendorService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 供应商Service业务层处理
 * 
 * @author zxy
 * @date 2021-12-21
 */
@Service
public class VendorServiceImpl implements IVendorService 
{
    @Autowired
    private VendorMapper vendorMapper;

    /**
     * 查询供应商
     * 
     * @param id 供应商主键
     * @return 供应商
     */
    @Override
    public Vendor selectVendorById(Long id)
    {
        return vendorMapper.selectVendorById(id);
    }

    /**
     * 查询供应商列表
     * 
     * @param vendor 供应商
     * @return 供应商
     */
    @Override
    public List<Vendor> selectVendorList(Vendor vendor)
    {
        return vendorMapper.selectVendorList(vendor);
    }

    /**
     * 新增供应商
     * 
     * @param vendor 供应商
     * @return 结果
     */
    @Override
    public int insertVendor(Vendor vendor)
    {
        vendor.setCreateBy(ShiroUtils.getLoginName());
        vendor.setCreateTime(DateUtils.getNowDate());
        vendor.setUpdateBy(ShiroUtils.getLoginName());
        vendor.setUpdateTime(DateUtils.getNowDate());
        return vendorMapper.insertVendor(vendor);
    }

    /**
     * 修改供应商
     * 
     * @param vendor 供应商
     * @return 结果
     */
    @Override
    public int updateVendor(Vendor vendor)
    {
        vendor.setUpdateBy(ShiroUtils.getLoginName());
        vendor.setUpdateTime(DateUtils.getNowDate());
        return vendorMapper.updateVendor(vendor);
    }

    /**
     * 批量删除供应商
     * 
     * @param ids 需要删除的供应商主键
     * @return 结果
     */
    @Override
    public int deleteVendorByIds(String ids)
    {
        return vendorMapper.deleteVendorByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除供应商信息
     * 
     * @param id 供应商主键
     * @return 结果
     */
    @Override
    public int deleteVendorById(Long id)
    {
        return vendorMapper.deleteVendorById(id);
    }
}
