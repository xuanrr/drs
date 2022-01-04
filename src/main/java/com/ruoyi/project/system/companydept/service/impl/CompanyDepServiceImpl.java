package com.ruoyi.project.system.companydept.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.companydept.mapper.CompanyDepMapper;
import com.ruoyi.project.system.companydept.domain.CompanyDep;
import com.ruoyi.project.system.companydept.service.ICompanyDepService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 公司部门Service业务层处理
 * 
 * @author zxy
 * @date 2022-01-04
 */
@Service
public class CompanyDepServiceImpl implements ICompanyDepService 
{
    @Autowired
    private CompanyDepMapper companyDepMapper;

    /**
     * 查询公司部门
     * 
     * @param name 公司部门主键
     * @return 公司部门
     */
    @Override
    public CompanyDep selectCompanyDepByName(String name)
    {
        return companyDepMapper.selectCompanyDepByName(name);
    }

    /**
     * 查询公司部门列表
     * 
     * @param companyDep 公司部门
     * @return 公司部门
     */
    @Override
    public List<CompanyDep> selectCompanyDepList(CompanyDep companyDep)
    {
        return companyDepMapper.selectCompanyDepList(companyDep);
    }

    /**
     * 新增公司部门
     * 
     * @param companyDep 公司部门
     * @return 结果
     */
    @Override
    public int insertCompanyDep(CompanyDep companyDep)
    {
        companyDep.setCreateTime(DateUtils.getNowDate());
        return companyDepMapper.insertCompanyDep(companyDep);
    }

    /**
     * 修改公司部门
     * 
     * @param companyDep 公司部门
     * @return 结果
     */
    @Override
    public int updateCompanyDep(CompanyDep companyDep)
    {
        companyDep.setUpdateTime(DateUtils.getNowDate());
        return companyDepMapper.updateCompanyDep(companyDep);
    }

    /**
     * 批量删除公司部门
     * 
     * @param names 需要删除的公司部门主键
     * @return 结果
     */
    @Override
    public int deleteCompanyDepByNames(String names)
    {
        return companyDepMapper.deleteCompanyDepByNames(Convert.toStrArray(names));
    }

    /**
     * 删除公司部门信息
     * 
     * @param name 公司部门主键
     * @return 结果
     */
    @Override
    public int deleteCompanyDepByName(String name)
    {
        return companyDepMapper.deleteCompanyDepByName(name);
    }
}
