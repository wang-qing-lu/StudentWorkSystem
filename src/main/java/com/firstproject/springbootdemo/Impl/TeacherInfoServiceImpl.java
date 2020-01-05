package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.teacherInfoMapper;
import com.firstproject.springbootdemo.domain.TeacherInfo;
import com.firstproject.springbootdemo.service.teacherInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherInfoService")
public class TeacherInfoServiceImpl implements teacherInfoService {
    @Resource
    private teacherInfoMapper teacherInfoMapper;

    @Override
    public List<TeacherInfo> selsectAllTeacherInfo(String teacher_grade) {
        return teacherInfoMapper.selsectAllTeacherInfo(teacher_grade);
    }

    @Override
    public TeacherInfo selectTeacherInfoByUsername(String username) {
        return teacherInfoMapper.selectTeacherInfoByUsername(username);
    }

    @Override
    public void delectTeacherInfo(String username) {
        teacherInfoMapper.delectTeacherInfo(username);
    }

    @Override
    public void insertTeacherInfo(TeacherInfo teacherInfo) {
        teacherInfoMapper.insertTeacherInfo(teacherInfo);
    }

    @Override
    public void updateTeacherInfo(TeacherInfo teacherInfo) {
        teacherInfoMapper.updateTeacherInfo(teacherInfo);
    }
}
