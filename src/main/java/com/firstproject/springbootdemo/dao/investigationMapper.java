package com.firstproject.springbootdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import com.firstproject.springbootdemo.domain.investigation;

import java.util.List;

@Mapper
public interface investigationMapper {

    /**
     * 查询所有学生的就业调查
     * @return
     */
    List<investigation> selectAllInvestigation();

    /**
     * 根据学生姓名查找学生姓名
     * @param student_name
     * @return
     */
    investigation selectInvestigationByStudentname(String student_name);

    /**
     * 更新学生的就业调查
     * @param investigation
     */
    void updateInvestigation(investigation investigation);

    /**
     * 添加学生的就业调查
     * @param investigation
     */
    void insertInvestigation(investigation investigation);

    /**
     * 删除学生的就业调查
     * @param student_name
     */
    void delectInvestigation(String student_name);
}

