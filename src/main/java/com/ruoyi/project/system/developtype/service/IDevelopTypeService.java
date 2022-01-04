package com.ruoyi.project.system.developtype.service;

import java.util.List;
import com.ruoyi.project.system.developtype.domain.DevelopType;

/**
 * 运维类型Service接口
 * 
 * @author zxy
 * @date 2022-01-04
 */
public interface IDevelopTypeService 
{
    /**
     * 查询运维类型
     * 
     * @param name 运维类型主键
     * @return 运维类型
     */
    public DevelopType selectDevelopTypeByName(String name);

    /**
     * 查询运维类型列表
     * 
     * @param developType 运维类型
     * @return 运维类型集合
     */
    public List<DevelopType> selectDevelopTypeList(DevelopType developType);

    /**
     * 新增运维类型
     * 
     * @param developType 运维类型
     * @return 结果
     */
    public int insertDevelopType(DevelopType developType);

    /**
     * 修改运维类型
     * 
     * @param developType 运维类型
     * @return 结果
     */
    public int updateDevelopType(DevelopType developType);

    /**
     * 批量删除运维类型
     * 
     * @param names 需要删除的运维类型主键集合
     * @return 结果
     */
    public int deleteDevelopTypeByNames(String names);

    /**
     * 删除运维类型信息
     * 
     * @param name 运维类型主键
     * @return 结果
     */
    public int deleteDevelopTypeByName(String name);
}
