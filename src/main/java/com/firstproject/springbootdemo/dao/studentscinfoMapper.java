package com.firstproject.springbootdemo.dao;

import com.firstproject.springbootdemo.domain.Studentscinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentscinfoMapper {
    /**
     * 查询所有学生的学校信息
     * @return
     */
    List<Studentscinfo> selectAllStudentscinfo();

    /**
     * 根据学生姓名查找学校信息
     * @param school_id
     * @return
     */
    Studentscinfo selectStudentscinfoBySchoolId(Integer school_id);

    /**
     * 添加学校信息
     * @param studentscinfo
     */
    void insertStudentscinfo(Studentscinfo studentscinfo);

    /**
     * 更新学校信息
     * @param studentscinfo
     */
    void updateStudentscinfo(Studentscinfo studentscinfo);

    /**
     * 删除学校信息
     * @param school_id
     */
    void delectStudentscinfo(Integer school_id);
}
