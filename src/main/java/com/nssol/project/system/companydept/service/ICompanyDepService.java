package com.nssol.project.system.companydept.service;

import java.util.List;
import com.nssol.project.system.companydept.domain.CompanyDep;

/**
 * 公司部门Service接口
 * 
 * @author zxy
 * @date 2022-02-22
 */
public interface ICompanyDepService 
{
    /**
     * 查询公司部门
     * 
     * @param id 公司部门主键
     * @return 公司部门
     */
    public CompanyDep selectCompanyDepById(Long id);

    /**
     * 查询最后公司代码的公司部门
     *
     * @return 公司部门
     */
    public CompanyDep selectLastCode();
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
     * 批量删除公司部门
     * 
     * @param ids 需要删除的公司部门主键集合
     * @return 结果
     */
    public int deleteCompanyDepByIds(String ids);

    /**
     * 删除公司部门信息
     * 
     * @param id 公司部门主键
     * @return 结果
     */
    public int deleteCompanyDepById(Long id);
}
