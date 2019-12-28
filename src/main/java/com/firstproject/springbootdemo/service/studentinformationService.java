package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.studentinformation;

import java.util.List;

public interface studentinformationService {
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
