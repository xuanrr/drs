package com.ruoyi.project.system.customer.service.impl;

import java.util.List;

import com.ruoyi.common.utils.CreateCodeUtils;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.customer.mapper.CustomerMapper;
import com.ruoyi.project.system.customer.domain.Customer;
import com.ruoyi.project.system.customer.service.ICustomerService;
import com.ruoyi.common.utils.text.Convert;

import static com.ruoyi.common.utils.CreateCodeUtils.CSTM_CODE;

/**
 * 客户Service业务层处理
 * 
 * @author zxy
 * @date 2021-12-21
 */
@Service
public class CustomerServiceImpl implements ICustomerService 
{

//    private CreateCodeUtils createCodeUtils;
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public Customer selectCustomerById(Long id)
    {
        return customerMapper.selectCustomerById(id);
    }



    /**
     * 查询客户列表
     * 
     * @param customer 客户
     * @return 客户
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer)
    {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增客户
     * 
     * @param customer 客户
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer)
    {
        CSTM_CODE++;
        customer.setCode(CreateCodeUtils.createCode());
        customer.setCreateBy(ShiroUtils.getLoginName());
        customer.setCreateTime(DateUtils.getNowDate());
        customer.setUpdateBy(ShiroUtils.getLoginName());
        customer.setUpdateTime(DateUtils.getNowDate());
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改客户
     * 
     * @param customer 客户
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer)
    {
        customer.setUpdateBy(ShiroUtils.getLoginName());
        customer.setUpdateTime(DateUtils.getNowDate());
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomerByIds(String ids)
    {
        return customerMapper.deleteCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomerById(Long id)
    {
        return customerMapper.deleteCustomerById(id);
    }


}
