package com.firstproject.springbootdemo.dao;

import com.firstproject.springbootdemo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface StudentMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<Student> selectall();

    /**
     * 根据用户名进行查找
     * @param username
     * @return
     */
    Student getUserByUsername(String username);

    /**
     * 根据学生姓名查找学校信息
     * @param student_name
     * @return
     */
    Student getScinfoByStudentname(String student_name);
    /**
     * 根据姓名进行查找
     * @param student_name
     * @return
     */
    Student getUserByStudentname(String student_name);

    /**
     * 更新用户
     * @param student
     */
    void update(Student student);

    /**
     * 增加用户
     * @param student
     */
    void insert(Student student);

    /**
     * 删除用户
     * @param username
     */
    void delete(String username);

}
