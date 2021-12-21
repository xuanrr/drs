package com.ruoyi.project.system.vendor.mapper;

import java.util.List;
import com.ruoyi.project.system.vendor.domain.Vendor;

/**
 * 供应商Mapper接口
 * 
 * @author zxy
 * @date 2021-12-21
 */
public interface VendorMapper 
{
    /**
     * 查询供应商
     * 
     * @param id 供应商主键
     * @return 供应商
     */
    public Vendor selectVendorById(Long id);

    /**
     * 查询供应商列表
     * 
     * @param vendor 供应商
     * @return 供应商集合
     */
    public List<Vendor> selectVendorList(Vendor vendor);

    /**
     * 新增供应商
     * 
     * @param vendor 供应商
     * @return 结果
     */
    public int insertVendor(Vendor vendor);

    /**
     * 修改供应商
     * 
     * @param vendor 供应商
     * @return 结果
     */
    public int updateVendor(Vendor vendor);

    /**
     * 删除供应商
     * 
     * @param id 供应商主键
     * @return 结果
     */
    public int deleteVendorById(Long id);

    /**
     * 批量删除供应商
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVendorByIds(String[] ids);
}
