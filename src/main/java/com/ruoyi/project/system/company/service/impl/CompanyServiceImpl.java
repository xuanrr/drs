package com.ruoyi.project.system.company.service.impl;

import java.util.List;

import com.ruoyi.common.utils.CreateCodeUtils;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.company.mapper.CompanyMapper;
import com.ruoyi.project.system.company.domain.Company;
import com.ruoyi.project.system.company.service.ICompanyService;
import com.ruoyi.common.utils.text.Convert;


/**
 * 公司Service业务层处理
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Service
public class CompanyServiceImpl implements ICompanyService 
{
    @Autowired
    @Lazy
    private CreateCodeUtils createCodeUtils;
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 查询公司
     * 
     * @param id 公司主键
     * @return 公司
     */
    @Override
    public Company selectCompanyById(Long id)
    {
        return companyMapper.selectCompanyById(id);
    }

    @Override
    public List<Company> selectCompaniesAll() {
        return companyMapper.selectCompaniesAll();
    }

    @Override
    public List<Company> selectCustomerAll() {
        return companyMapper.selectCustomerAll();
    }

    @Override
    public Company selectLastCode() {
        return companyMapper.selectLastCode();
    }

    @Override
    public List<Company> selectVendorAll() {
        return companyMapper.selectVendorAll();
    }

    /**
     * 查询公司列表
     * 
     * @param company 公司
     * @return 公司
     */
    @Override
    public List<Company> selectCompanyList(Company company)
    {
        return companyMapper.selectCompanyList(company);
    }

    /**
     * 新增公司
     * 
     * @param company 公司
     * @return 结果
     */
    @Override
    public int insertCompany(Company company)
    {
        company.setCode(createCodeUtils.createCompanyCode());
        company.setCreateBy(ShiroUtils.getLoginName());
        company.setCreateTime(DateUtils.getNowDate());
        company.setUpdateBy(ShiroUtils.getLoginName());
        return companyMapper.insertCompany(company);
    }

    /**
     * 修改公司
     * 
     * @param company 公司
     * @return 结果
     */
    @Override
    public int updateCompany(Company company)
    {
        company.setUpdateBy(ShiroUtils.getLoginName());
        company.setUpdateTime(DateUtils.getNowDate());
        return companyMapper.updateCompany(company);
    }

    /**
     * 批量删除公司
     * 
     * @param ids 需要删除的公司主键
     * @return 结果
     */
    @Override
    public int deleteCompanyByIds(String ids)
    {
        return companyMapper.deleteCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司信息
     * 
     * @param id 公司主键
     * @return 结果
     */
    @Override
    public int deleteCompanyById(Long id)
    {
        return companyMapper.deleteCompanyById(id);
    }
}
