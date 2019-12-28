package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.schoolmsgMapper;
import com.firstproject.springbootdemo.domain.Schoolmsg;
import com.firstproject.springbootdemo.service.schoolmsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("schoolmsgService")
public class schoolmsgServiceImpl implements schoolmsgService {
    @Resource
    private schoolmsgMapper schoolmsgMapper;
    @Override
    public List<Schoolmsg> selectAllSchoolmsg() {
        return schoolmsgMapper.selectAllSchoolmsg();
    }

    @Override
    public Schoolmsg selectSchoolmsgByStudentname(String student_name) {
        return schoolmsgMapper.selectSchoolmsgByStudentname(student_name);
    }

    @Override
    public void updateSchoolmsg(Schoolmsg schoolmsg) {
        schoolmsgMapper.updateSchoolmsg(schoolmsg);
    }

    @Override
    public void delectSchoolmsg(String student_name) {
        schoolmsgMapper.delectSchoolmsg(student_name);
    }

    @Override
    public void insertSchoolmsg(Schoolmsg schoolmsg) {
        schoolmsgMapper.insertSchoolmsg(schoolmsg);
    }
}
