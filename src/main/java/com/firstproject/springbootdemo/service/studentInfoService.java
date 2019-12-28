package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.studentInfo;

import java.util.List;

public interface studentInfoService {
    /**
     * 查询所有用户
     * @return
     */
    List<studentInfo> selectAllStudentInfo();

    /**
     * 根据用户名进行查找
     * @param studentName
     * @return
     */
    studentInfo getInfoByStudentName(String studentName);

    /**
     * 根据学号和身份证号进行查找
     * @param studentInfo
     * @return
     */
    studentInfo getINfoByUsernameAndId(studentInfo studentInfo);
    /**
     * 更新用户
     * @param studentinfo
     */
    void updateStudentInfo(studentInfo studentinfo);

    /**
     * 增加用户
     * @param studentinfo
     */
    void insertStudentInfo(studentInfo studentinfo);

    /**
     * 删除用户
     * @param studentName
     */
    void deleteStudentInfo(String studentName);
}
