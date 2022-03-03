package com.nssol.project.system.record.service.impl;

import java.util.List;

import com.nssol.common.exception.ServiceException;
import com.nssol.common.utils.DateUtils;
import com.nssol.common.utils.StringUtils;
import com.nssol.common.utils.bean.BeanValidators;
import com.nssol.common.utils.security.ShiroUtils;
import com.nssol.project.system.developtype.domain.DevelopType;
import com.nssol.project.system.developtype.mapper.DevelopTypeMapper;
import com.nssol.project.system.project.domain.Project;
import com.nssol.project.system.project.mapper.ProjectMapper;
import com.nssol.project.system.user.domain.User;
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
 * @date 2022-03-01
 */
@Service
public class RecordServiceImpl implements IRecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private DevelopTypeMapper developTypeMapper;

    /**
     * 查询运维记录
     *
     * @param id 运维记录主键
     * @return 运维记录
     */
    @Override
    public Record selectRecordById(Long id) {
        return recordMapper.selectRecordById(id);
    }

    /**
     * 查询运维记录列表
     *
     * @param record 运维记录
     * @return 运维记录
     */
    @Override
    public List<Record> selectRecordList(Record record) {
        return recordMapper.selectRecordList(record);
    }

    /**
     * 新增运维记录
     *
     * @param record 运维记录
     * @return 结果
     */
    @Override
    public int insertRecord(Record record) {
        record.setCreateTime(DateUtils.getNowDate());
        return recordMapper.insertRecord(record);
    }

    /**
     * 修改运维记录
     *
     * @param record 运维记录
     * @return 结果
     */
    @Override
    public int updateRecord(Record record) {
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
    public int deleteRecordByIds(String ids) {
        return recordMapper.deleteRecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除运维记录信息
     *
     * @param id 运维记录主键
     * @return 结果
     */
    @Override
    public int deleteRecordById(Long id) {
        return recordMapper.deleteRecordById(id);
    }

    @Override
    public String importRecord(List<Record> recordList) {
        if (recordList.size() == 0) {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = 0;
        StringBuilder successMsg = new StringBuilder();
        for (Record record : recordList) {
            Project project = projectMapper.selectProjectByName(record.getProjectName());
            DevelopType developType = developTypeMapper.selectDevelopTypeByName(record.getDevelopName());
            record.setProjectId(project.getId());
            record.setDevelopTypeId(developType.getId());
            this.insertRecord(record);
            successNum++;
            successMsg.append("<br/>" + successNum + "条数据导入成功");
        }
        return successMsg.toString();
    }
}