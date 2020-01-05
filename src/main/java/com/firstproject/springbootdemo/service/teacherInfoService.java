package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.TeacherInfo;

import java.util.List;

public interface teacherInfoService {
    /**
     * 根据教师等级查询教师信息
     * @param teacher_grade
     * @return
     */
    List<TeacherInfo> selsectAllTeacherInfo(String teacher_grade);

    /**
     * 根据教师工号查询教师信息
     * @param username
     * @return
     */
    TeacherInfo selectTeacherInfoByUsername(String username);

    /**
     * 根据教师工号删除教师信息
     * @param username
     */
    void delectTeacherInfo(String username);

    /**
     * 添加教师信息
     * @param teacherInfo
     */
    void insertTeacherInfo(TeacherInfo teacherInfo);

    /**
     * 更新教师信息
     * @param teacherInfo
     */
    void updateTeacherInfo(TeacherInfo teacherInfo);
}
