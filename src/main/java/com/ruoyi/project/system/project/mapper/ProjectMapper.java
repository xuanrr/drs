package com.ruoyi.project.system.project.mapper;

import java.util.List;
import com.ruoyi.project.system.project.domain.Project;
import org.springframework.stereotype.Repository;

/**
 * 项目Mapper接口
 * 
 * @author zxy
 * @date 2021-12-23
 */
@Repository
public interface ProjectMapper 
{
    /**
     * 查询项目
     * 
     * @param id 项目主键
     * @return 项目
     */
    public Project selectProjectById(Long id);

    public List<Project> selectAllProjects();
    /**
     * 查询项目列表
     * 
     * @param project 项目
     * @return 项目集合
     */
    public List<Project> selectProjectList(Project project);
    public List<Project> selectAllProjectList();

    /**
     * 新增项目
     * 
     * @param project 项目
     * @return 结果
     */
    public int insertProject(Project project);

    /**
     * 修改项目
     * 
     * @param project 项目
     * @return 结果
     */
    public int updateProject(Project project);

    /**
     * 删除项目
     * 
     * @param id 项目主键
     * @return 结果
     */
    public int deleteProjectById(Long id);

    /**
     * 批量删除项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProjectByIds(String[] ids);
}
