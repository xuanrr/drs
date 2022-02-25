package com.nssol.project.system.companydept.mapper;

import java.util.List;
import com.nssol.project.system.companydept.domain.CompanyDep;
import org.springframework.stereotype.Repository;

/**
 * 公司部门Mapper接口
 * 
 * @author zxy
 * @date 2022-02-22
 */
@Repository
public interface CompanyDepMapper 
{
    /**
     * 查询公司部门
     * 
     * @param id 公司部门主键
     * @return 公司部门
     */
    public CompanyDep selectCompanyDepById(Long id);

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
     * 删除公司部门
     * 
     * @param id 公司部门主键
     * @return 结果
     */
    public int deleteCompanyDepById(Long id);

    /**
     * 批量删除公司部门
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCompanyDepByIds(String[] ids);
}
