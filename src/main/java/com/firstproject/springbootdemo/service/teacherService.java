package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.Teacher;

import java.util.List;

public interface teacherService {
    /**
     * 查询所有教师信息
     * @return
     */
    List<Teacher> selectAllTeacherInfo();

    /**
     * 根据账号查询教师信息
     * @param username
     * @return
     */
    Teacher selectTeacherInfoByUsername(String username);

    /**
     * 更新教师信息
     * @param teacher
     */
    void UpdateTeacherInfo(Teacher teacher);

    /**
     * 增加教师信息
     * @param teacher
     */
    void insertTeacherInfo(Teacher teacher);

    /**
     * 根据账号删除教师信息
     * @param username
     */
    void delectTeacherInfoByUsername(String username);
}
