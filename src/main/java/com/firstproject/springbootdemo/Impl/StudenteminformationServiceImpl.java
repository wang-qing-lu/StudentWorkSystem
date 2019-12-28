package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.studentEminformationMapper;
import com.firstproject.springbootdemo.domain.Studenteminformation;
import com.firstproject.springbootdemo.service.studenteminformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studenteminformationService")
public class StudenteminformationServiceImpl implements studenteminformationService {
    @Resource
    private studentEminformationMapper studentEminformationMapper;
    @Override
    public List<Studenteminformation> selcetAllStudenteminformation() {
        return studentEminformationMapper.selcetAllStudenteminformation();
    }

    @Override
    public Studenteminformation selectStudenteminformationByStudentname(String student_name) {
        return studentEminformationMapper.selectStudenteminformationByStudentname(student_name);
    }

    @Override
    public void updateStudenteminformation(Studenteminformation studenteminformation) {
        studentEminformationMapper.updateStudenteminformation(studenteminformation);
    }

    @Override
    public void insertStudenteminformation(Studenteminformation studenteminformation) {
        studentEminformationMapper.insertStudenteminformation(studenteminformation);
    }

    @Override
    public void delectStudenteminformation(String student_name) {
        studentEminformationMapper.delectStudenteminformation(student_name);
    }
}
