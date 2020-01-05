package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.TeacherMapper;
import com.firstproject.springbootdemo.domain.Teacher;
import com.firstproject.springbootdemo.service.teacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherService implements teacherService {

        @Resource
        private TeacherMapper teacherMapper;

        @Override
        public List<Teacher> selectAllTeacherInfo() {
            return teacherMapper.selectAllTeacherInfo();
        }

        @Override
        public Teacher selectTeacherInfoByUsername(String username) {
            return teacherMapper.selectTeacherInfoByUsername(username);
        }

        @Override
        public void UpdateTeacherInfo(Teacher teacher) {
            teacherMapper.UpdateTeacherInfo(teacher);
        }

        @Override
        public void insertTeacherInfo(Teacher teacher) {
            teacherMapper.insertTeacherInfo(teacher);
        }

        @Override
        public void delectTeacherInfoByUsername(String username) {
            teacherMapper.delectTeacherInfoByUsername(username);
        }
    }

