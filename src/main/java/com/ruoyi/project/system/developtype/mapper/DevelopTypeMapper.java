package com.ruoyi.project.system.developtype.mapper;

import java.util.List;
import com.ruoyi.project.system.developtype.domain.DevelopType;
import org.springframework.stereotype.Repository;

/**
 * 运维类型Mapper接口
 * 
 * @author zxy
 * @date 2022-01-04
 */
@Repository
public interface DevelopTypeMapper 
{
    /**
     * 查询运维类型
     * 
     * @param name 运维类型主键
     * @return 运维类型
     */
    public DevelopType selectDevelopTypeByName(String name);

    public List<DevelopType> selectAllDevelopType();
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
     * 删除运维类型
     * 
     * @param name 运维类型主键
     * @return 结果
     */
    public int deleteDevelopTypeByName(String name);

    /**
     * 批量删除运维类型
     * 
     * @param names 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDevelopTypeByNames(String[] names);
}
