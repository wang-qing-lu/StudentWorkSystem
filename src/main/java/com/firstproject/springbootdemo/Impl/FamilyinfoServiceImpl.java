package com.firstproject.springbootdemo.Impl;


import com.firstproject.springbootdemo.dao.familyinfoMapper;
import com.firstproject.springbootdemo.domain.Familyinfo;
import com.firstproject.springbootdemo.service.familyinfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("familyinfoService")
public class FamilyinfoServiceImpl implements familyinfoService {
    @Resource
    private familyinfoMapper familyinfoMapper;


    @Override
    public List<Familyinfo> selectAllFamilyinfo() {
        return familyinfoMapper.selectAllFamilyinfo();
    }

    @Override
    public Familyinfo selectFamilyinfoByStudentname(String student_name) {
        return familyinfoMapper.selectFamilyinfoByStudentname(student_name);
    }

    @Override
    public void updateFamilyinfo(Familyinfo familyinfo) {
        familyinfoMapper.updateFamilyinfo(familyinfo);
    }

    @Override
    public void insertFamilyinfo(Familyinfo familyinfo) {
        familyinfoMapper.insertFamilyinfo(familyinfo);
    }

    @Override
    public void delectFamilyinfo(Familyinfo familyinfo) {
        familyinfoMapper.delectFamilyinfo(familyinfo);
    }
}
