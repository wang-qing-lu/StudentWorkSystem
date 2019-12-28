package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.StudentMapper;
import com.firstproject.springbootdemo.domain.Student;
import org.springframework.stereotype.Service;
import com.firstproject.springbootdemo.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service("StudentService")
public class StudentserviceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectall() {
        return studentMapper.selectall();
    }

    @Override
    public Student getUserByUsername(String username) {
        return studentMapper.getUserByUsername(username);
    }

    @Override
    public Student getUserByStudentname(String student_name) {
        return studentMapper.getUserByStudentname(student_name);
    }

    @Override
    public Student getScinfoByStudentname(String student_name) {
        return studentMapper.getScinfoByStudentname(student_name);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void delete(String username) {
        studentMapper.delete(username);
    }
}
