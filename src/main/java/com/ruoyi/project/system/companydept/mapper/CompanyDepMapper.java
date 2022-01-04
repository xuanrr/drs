package com.ruoyi.project.system.companydept.mapper;

import java.util.List;
import com.ruoyi.project.system.companydept.domain.CompanyDep;

/**
 * 公司部门Mapper接口
 * 
 * @author zxy
 * @date 2022-01-04
 */
public interface CompanyDepMapper 
{
    /**
     * 查询公司部门
     * 
     * @param name 公司部门主键
     * @return 公司部门
     */
    public CompanyDep selectCompanyDepByName(String name);

    /**
     * 查询公司部门列表
     * 
     * @param companyDep 公司部门
     * @return 公司部门集合
     */
    public List<CompanyDep> selectCompanyDepList(CompanyDep companyDep);

    /**
     * 新增公司部门
     * 
     * @param companyDep 公司部门
     * @return 结果
     */
    public int insertCompanyDep(CompanyDep companyDep);

    /**
     * 修改公司部门
     * 
     * @param companyDep 公司部门
     * @return 结果
     */
    public int updateCompanyDep(CompanyDep companyDep);

    /**
     * 删除公司部门
     * 
     * @param name 公司部门主键
     * @return 结果
     */
    public int deleteCompanyDepByName(String name);

    /**
     * 批量删除公司部门
     * 
     * @param names 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCompanyDepByNames(String[] names);
}
