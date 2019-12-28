package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.studentinformationMapper;
import com.firstproject.springbootdemo.domain.studentinformation;
import com.firstproject.springbootdemo.service.studentinformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentinformationService")
public class studentinformationServiceImpl implements studentinformationService {
    @Resource
    private studentinformationMapper studentinformationMapper;
    @Override
    public List<studentinformation> selectAllStudentinformation() {
        return studentinformationMapper.selectAllStudentinformation();
    }

    @Override
    public studentinformation selectStudentinformationByStudentname(String student_name) {
        return studentinformationMapper.selectStudentinformationByStudentname(student_name);
    }

    @Override
    public void updateStudentinformation(studentinformation studentinformation) {
        studentinformationMapper.updateStudentinformation(studentinformation);
    }

    @Override
    public void delectStudentinformation(String student_name) {
        studentinformationMapper.delectStudentinformation(student_name);
    }

    @Override
    public void insertStudentinformation(studentinformation studentinformation) {
        studentinformationMapper.insertStudentinformation(studentinformation);
    }
}
