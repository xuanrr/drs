package com.nssol.project.system.record.mapper;

import java.util.List;
import com.nssol.project.system.record.domain.Record;
import org.springframework.stereotype.Repository;

/**
 * 运维记录Mapper接口
 * 
 * @author zxy
 * @date 2022-03-01
 */
@Repository
public interface RecordMapper 
{
    /**
     * 查询运维记录
     * 
     * @param id 运维记录主键
     * @return 运维记录
     */
    public Record selectRecordById(Long id);

    /**
     * 查询运维记录列表
     * 
     * @param record 运维记录
     * @return 运维记录集合
     */
    public List<Record> selectRecordList(Record record);

    /**
     * 新增运维记录
     * 
     * @param record 运维记录
     * @return 结果
     */
    public int insertRecord(Record record);

    /**
     * 修改运维记录
     * 
     * @param record 运维记录
     * @return 结果
     */
    public int updateRecord(Record record);

    /**
     * 删除运维记录
     * 
     * @param id 运维记录主键
     * @return 结果
     */
    public int deleteRecordById(Long id);

    /**
     * 批量删除运维记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordByIds(String[] ids);
}
