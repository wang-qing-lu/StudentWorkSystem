package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.studentpubmedMapper;
import com.firstproject.springbootdemo.domain.Studentpubmed;
import com.firstproject.springbootdemo.service.studentpubmedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentpubmedService")
public class StudentpubmedServiceImpl implements studentpubmedService {
    @Resource
    private studentpubmedMapper studentpubmedMapper;
    @Override
    public List<Studentpubmed> selectAllStudentpubmed() {
        return studentpubmedMapper.selectAllStudentpubmed();
    }

    @Override
    public Studentpubmed selectStudentpubmedByStudentname(String student_name) {
        return studentpubmedMapper.selectStudentpubmedByStudentname(student_name);
    }

    @Override
    public void updateStudentpubmed(Studentpubmed studentpubmed) {
        studentpubmedMapper.updateStudentpubmed(studentpubmed);
    }

    @Override
    public void insertStudentpubmed(Studentpubmed studentpubmed) {
        studentpubmedMapper.insertStudentpubmed(studentpubmed);
    }

    @Override
    public void delectStudentpubmed(String student_name) {
        studentpubmedMapper.delectStudentpubmed(student_name);
    }
}
