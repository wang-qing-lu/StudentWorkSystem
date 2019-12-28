package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.Studenteminformation;

import java.util.List;

public interface studenteminformationService {
    /**
     * 查询所有学生就业信息
     * @return
     */
    List<Studenteminformation> selcetAllStudenteminformation();

    /**
     * 根据学生姓名查找就业信息
     * @param Student_name
     * @return
     */
    Studenteminformation selectStudenteminformationByStudentname(String Student_name);

    /**
     * 更新学生就业信息
     * @param studenteminformation
     */
    void updateStudenteminformation(Studenteminformation studenteminformation);

    /**
     * 添加学生就业信息
     * @param studenteminformation
     */
    void insertStudenteminformation(Studenteminformation studenteminformation);

    /**
     * 根据学生姓名删除就业信息
     * @param student_name
     */
    void delectStudenteminformation(String student_name);
}
