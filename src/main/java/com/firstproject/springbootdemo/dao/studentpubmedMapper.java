package com.firstproject.springbootdemo.dao;

import com.firstproject.springbootdemo.domain.Studentpubmed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentpubmedMapper {
    /**
     * 查询所有学生考研信息
     * @return
     */
    List<Studentpubmed> selectAllStudentpubmed();

    /**
     * 根据学生姓名查找学生考研信息
     * @param student_name
     * @return
     */
    Studentpubmed selectStudentpubmedByStudentname(String student_name);

    /**
     * 更新学生考研信息
     * @param studentpubmed
     */
    void updateStudentpubmed(Studentpubmed studentpubmed);

    /**
     * 添加学生考研信息
     * @param studentpubmed
     */
    void insertStudentpubmed(Studentpubmed studentpubmed);

    /**
     * 根据学生姓名删除学生考研信息
     * @param student_name
     */
    void delectStudentpubmed(String student_name);
}
