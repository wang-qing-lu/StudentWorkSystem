package com.firstproject.springbootdemo.dao;

import com.firstproject.springbootdemo.domain.Schoolmsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface schoolmsgMapper {
    /**
     * 查询所有学生的学籍信息
     * @return
     */
    List<Schoolmsg> selectAllSchoolmsg();

    /**
     * 根据学生姓名查找学籍信息
     * @param student_name
     * @return
     */
    Schoolmsg selectSchoolmsgByStudentname(String student_name);

    /**
     * 更新学籍信息
     * @param schoolmsg
     */
    void updateSchoolmsg(Schoolmsg schoolmsg);

    /**
     * 根据学生姓名删除学籍信息
     * @param student_name
     */
    void delectSchoolmsg(String student_name);

    /**
     * 添加学生学籍信息
     * @param schoolmsg
     */
    void insertSchoolmsg(Schoolmsg schoolmsg);
}
