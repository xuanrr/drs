package com.nssol.project.system.company.service;

import java.util.List;
import com.nssol.project.system.company.domain.Company;

/**
 * 公司Service接口
 * 
 * @author zxy
 * @date 2021-12-23
 */
public interface ICompanyService 
{
    /**
     * 查询公司
     * 
     * @param id 公司主键
     * @return 公司
     */
    public Company selectCompanyById(Long id);

    public List<Company> selectCompaniesAll();


    public List<Company> selectCustomerAll();

    public Company selectLastCode();

    public List<Company> selectVendorAll();
    /**
     * 查询公司列表
     * 
     * @param company 公司
     * @return 公司集合
     */
    public List<Company> selectCompanyList(Company company);

    /**
     * 新增公司
     * 
     * @param company 公司
     * @return 结果
     */
    public int insertCompany(Company company);

    /**
     * 修改公司
     * 
     * @param company 公司
     * @return 结果
     */
    public int updateCompany(Company company);

    /**
     * 批量删除公司
     * 
     * @param ids 需要删除的公司主键集合
     * @return 结果
     */
    public int deleteCompanyByIds(String ids);

    /**
     * 删除公司信息
     * 
     * @param id 公司主键
     * @return 结果
     */
    public int deleteCompanyById(Long id);
}
