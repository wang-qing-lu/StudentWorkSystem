package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.studentscinfoMapper;
import com.firstproject.springbootdemo.domain.Studentscinfo;
import com.firstproject.springbootdemo.service.studentscinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentscinfoService")
public class studentscinfoServiceImpl implements studentscinfoService {
    @Resource
    private studentscinfoMapper studentscinfoMapper;

    @Override
    public List<Studentscinfo> selectAllStudentscinfo() {
        return studentscinfoMapper.selectAllStudentscinfo();
    }

    @Override
    public Studentscinfo selectStudentscinfoBySchoolId(Integer school_id) {
        return studentscinfoMapper.selectStudentscinfoBySchoolId(school_id);
    }


    @Override
    public void insertStudentscinfo(Studentscinfo studentscinfo) {
        studentscinfoMapper.insertStudentscinfo(studentscinfo);
    }

    @Override
    public void updateStudentscinfo(Studentscinfo studentscinfo) {
        studentscinfoMapper.updateStudentscinfo(studentscinfo);
    }

    @Override
    public void delectStudentscinfo(Integer school_id) {
        studentscinfoMapper.delectStudentscinfo(school_id);
    }
}
