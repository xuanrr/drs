package com.ruoyi.project.system.company.mapper;

import java.util.List;
import com.ruoyi.project.system.company.domain.Company;
import org.springframework.stereotype.Repository;

/**
 * 公司Mapper接口
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Repository
public interface CompanyMapper 
{
    /**
     * 查询公司
     * 
     * @param id 公司主键
     * @return 公司
     */
    public Company selectCompanyById(Long id);

    public List<Company> selectCompaniesAll();
    public List<Company> selectVendorAll();
    public List<Company> selectCustomerAll();
    /**
     * 查询公司列表
     * 
     * @param company 公司
     * @return 公司集合
     */
    public List<Company> selectCompanyList(Company company);

    public Company selectLastCode();

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
     * 删除公司
     * 
     * @param id 公司主键
     * @return 结果
     */
    public int deleteCompanyById(Long id);

    /**
     * 批量删除公司
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCompanyByIds(String[] ids);
}
