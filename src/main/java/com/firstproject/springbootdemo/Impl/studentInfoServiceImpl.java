package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.domain.studentInfo;
import com.firstproject.springbootdemo.service.studentInfoService;
import com.firstproject.springbootdemo.dao.studentInfoMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("studentInfoService")
public class studentInfoServiceImpl implements studentInfoService{
    @Resource
    private studentInfoMapper studentInfoMapper;

    @Override
    public List<studentInfo> selectAllStudentInfo() {
        return studentInfoMapper.selectAllStudentInfo();
    }

    @Override
    public studentInfo getInfoByStudentName(String studentName) {
        return studentInfoMapper.getInfoByStudentName(studentName);
    }

    @Override
    public studentInfo getINfoByUsernameAndId(studentInfo studentInfo) {
        return studentInfoMapper.getINfoByUsernameAndId(studentInfo);
    }

    @Override
    public void updateStudentInfo(studentInfo studentinfo) {
        studentInfoMapper.updateStudentInfo(studentinfo);
    }

    @Override
    public void insertStudentInfo(studentInfo studentinfo) {
        studentInfoMapper.insertStudentInfo(studentinfo);
    }

    @Override
    public void deleteStudentInfo(String studentName) {
        studentInfoMapper.deleteStudentInfo(studentName);
    }
}
