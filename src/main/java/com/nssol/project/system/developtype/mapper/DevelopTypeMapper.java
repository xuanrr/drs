package com.nssol.project.system.developtype.mapper;

import java.util.List;
import com.nssol.project.system.developtype.domain.DevelopType;
import org.springframework.stereotype.Repository;

/**
 * 运维类型Mapper接口
 * 
 * @author zxy
 * @date 2022-03-01
 */
@Repository
public interface DevelopTypeMapper 
{
    /**
     * 查询运维类型
     * 
     * @param id 运维类型主键
     * @return 运维类型
     */
    public DevelopType selectDevelopTypeById(Long id);

    public DevelopType selectDevelopTypeByName(String name);
    /**
     * 查询所有运维类型
     * @return 运维类型集合
     */
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
     * @param id 运维类型主键
     * @return 结果
     */
    public int deleteDevelopTypeById(Long id);

    /**
     * 批量删除运维类型
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDevelopTypeByIds(String[] ids);
}
