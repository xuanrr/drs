package com.ruoyi.project.system.companydept.service.impl;

import java.util.List;

import com.ruoyi.common.utils.CreateCodeUtils;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.companydept.mapper.CompanyDepMapper;
import com.ruoyi.project.system.companydept.domain.CompanyDep;
import com.ruoyi.project.system.companydept.service.ICompanyDepService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 公司部门Service业务层处理
 * 
 * @author zxy
 * @date 2022-02-21
 */
@Service
public class CompanyDepServiceImpl implements ICompanyDepService 
{
    @Autowired
    private CompanyDepMapper companyDepMapper;

    @Autowired
    @Lazy
    private CreateCodeUtils createCodeUtils;

    /**
     * 查询公司部门
     * 
     * @param id 公司部门主键
     * @return 公司部门
     */
    @Override
    public CompanyDep selectCompanyDepById(Long id)
    {
        return companyDepMapper.selectCompanyDepById(id);
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
        companyDep.setUpdateBy(ShiroUtils.getLoginName());
        companyDep.setCreateBy(ShiroUtils.getLoginName());
        companyDep.setCreateTime(DateUtils.getNowDate());
        companyDep.setUpdateTime(DateUtils.getNowDate());
        companyDep.setCode(createCodeUtils.createCompanyDepCode());
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
        companyDep.setUpdateBy(ShiroUtils.getLoginName());
        companyDep.setUpdateTime(DateUtils.getNowDate());
        return companyDepMapper.updateCompanyDep(companyDep);
    }

    /**
     * 批量删除公司部门
     * 
     * @param ids 需要删除的公司部门主键
     * @return 结果
     */
    @Override
    public int deleteCompanyDepByIds(String ids)
    {
        return companyDepMapper.deleteCompanyDepByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司部门信息
     * 
     * @param id 公司部门主键
     * @return 结果
     */
    @Override
    public int deleteCompanyDepById(Long id)
    {
        return companyDepMapper.deleteCompanyDepById(id);
    }

    @Override
    public CompanyDep selectLastCode() {
        return companyDepMapper.selectLastCode();
    }
}
