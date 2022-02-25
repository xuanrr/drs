package com.nssol.project.system.record.service.impl;

import java.util.List;
import com.nssol.common.utils.DateUtils;
import com.nssol.common.utils.security.ShiroUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nssol.project.system.record.mapper.RecordMapper;
import com.nssol.project.system.record.domain.Record;
import com.nssol.project.system.record.service.IRecordService;
import com.nssol.common.utils.text.Convert;

/**
 * 运维记录Service业务层处理
 * 
 * @author zxy
 * @date 2022-02-24
 */
@Service
public class RecordServiceImpl implements IRecordService 
{
    @Autowired
    private RecordMapper recordMapper;

    /**
     * 查询运维记录
     * 
     * @param id 运维记录主键
     * @return 运维记录
     */
    @Override
    public Record selectRecordById(Long id)
    {
        return recordMapper.selectRecordById(id);
    }

    /**
     * 查询运维记录列表
     * 
     * @param record 运维记录
     * @return 运维记录
     */
    @Override
    public List<Record> selectRecordList(Record record)
    {
        return recordMapper.selectRecordList(record);
    }

    /**
     * 新增运维记录
     * 
     * @param record 运维记录
     * @return 结果
     */
    @Override
    public int insertRecord(Record record)
    {
        record.setUpdateBy(ShiroUtils.getLoginName());
        record.setCreateBy(ShiroUtils.getLoginName());
        record.setCreateTime(DateUtils.getNowDate());
        record.setUpdateTime(DateUtils.getNowDate());
        return recordMapper.insertRecord(record);
    }

    /**
     * 修改运维记录
     * 
     * @param record 运维记录
     * @return 结果
     */
    @Override
    public int updateRecord(Record record)
    {
        record.setUpdateBy(ShiroUtils.getLoginName());
        record.setUpdateTime(DateUtils.getNowDate());
        return recordMapper.updateRecord(record);
    }

    /**
     * 批量删除运维记录
     * 
     * @param ids 需要删除的运维记录主键
     * @return 结果
     */
    @Override
    public int deleteRecordByIds(String ids)
    {
        return recordMapper.deleteRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除运维记录信息
     * 
     * @param id 运维记录主键
     * @return 结果
     */
    @Override
    public int deleteRecordById(Long id)
    {
        return recordMapper.deleteRecordById(id);
    }
}
