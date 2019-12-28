package com.firstproject.springbootdemo.dao;

import com.firstproject.springbootdemo.domain.studentinformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentinformationMapper {
    /**
     * 查询所有学生的档案信息
     * @return
     */
    List<studentinformation> selectAllStudentinformation();

    /**
     * 根据学生姓名查找学生档案信息
     * @param student_name
     * @return
     */
    studentinformation selectStudentinformationByStudentname(String student_name);

    /**
     * 更新学生档案信息
     * @param studentinformation
     */
    void updateStudentinformation(studentinformation studentinformation);

    /**
     * 删除学生档案信息
     * @param student_name
     */
    void delectStudentinformation(String student_name);

    /**
     * 添加学生档案信息
     * @param studentinformation
     */
    void insertStudentinformation(studentinformation studentinformation);
}
