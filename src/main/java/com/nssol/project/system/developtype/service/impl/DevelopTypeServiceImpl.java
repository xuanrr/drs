package com.nssol.project.system.developtype.service.impl;

import java.util.List;
import com.nssol.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nssol.project.system.developtype.mapper.DevelopTypeMapper;
import com.nssol.project.system.developtype.domain.DevelopType;
import com.nssol.project.system.developtype.service.IDevelopTypeService;
import com.nssol.common.utils.text.Convert;

/**
 * 运维类型Service业务层处理
 * 
 * @author zxy
 * @date 2022-03-01
 */
@Service
public class DevelopTypeServiceImpl implements IDevelopTypeService 
{
    @Autowired
    private DevelopTypeMapper developTypeMapper;

    /**
     * 查询运维类型
     * 
     * @param id 运维类型主键
     * @return 运维类型
     */
    @Override
    public DevelopType selectDevelopTypeById(Long id)
    {
        return developTypeMapper.selectDevelopTypeById(id);
    }

    /**
     * 查询所有运维类型
     * @return 运维类型集合
     */
    @Override
    public List<DevelopType> selectAllDevelopType(){
        return developTypeMapper.selectAllDevelopType();
    };
    /**
     * 查询运维类型列表
     * 
     * @param developType 运维类型
     * @return 运维类型
     */
    @Override
    public List<DevelopType> selectDevelopTypeList(DevelopType developType)
    {
        return developTypeMapper.selectDevelopTypeList(developType);
    }

    /**
     * 新增运维类型
     * 
     * @param developType 运维类型
     * @return 结果
     */
    @Override
    public int insertDevelopType(DevelopType developType)
    {
        developType.setCreateTime(DateUtils.getNowDate());
        return developTypeMapper.insertDevelopType(developType);
    }

    /**
     * 修改运维类型
     * 
     * @param developType 运维类型
     * @return 结果
     */
    @Override
    public int updateDevelopType(DevelopType developType)
    {
        developType.setUpdateTime(DateUtils.getNowDate());
        return developTypeMapper.updateDevelopType(developType);
    }

    /**
     * 批量删除运维类型
     * 
     * @param ids 需要删除的运维类型主键
     * @return 结果
     */
    @Override
    public int deleteDevelopTypeByIds(String ids)
    {
        return developTypeMapper.deleteDevelopTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除运维类型信息
     * 
     * @param id 运维类型主键
     * @return 结果
     */
    @Override
    public int deleteDevelopTypeById(Long id)
    {
        return developTypeMapper.deleteDevelopTypeById(id);
    }
}
