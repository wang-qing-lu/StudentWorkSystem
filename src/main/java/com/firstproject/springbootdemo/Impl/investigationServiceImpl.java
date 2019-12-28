package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.dao.investigationMapper;
import com.firstproject.springbootdemo.domain.investigation;
import com.firstproject.springbootdemo.service.investigationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("investigationService")
public class investigationServiceImpl implements investigationService {
   @Resource
   private investigationMapper investigationMapper;

    @Override
    public List<investigation> selectAllInvestigation() {
        return investigationMapper.selectAllInvestigation();
    }

    @Override
    public investigation selectInvestigationByStudentname(String student_name) {
        return investigationMapper.selectInvestigationByStudentname(student_name);
    }

    @Override
    public void updateInvestigation(investigation investigation) {
        investigationMapper.updateInvestigation(investigation);
    }

    @Override
    public void insertInvestigation(investigation investigation) {
        investigationMapper.insertInvestigation(investigation);
    }

    @Override
    public void delectInvestigation(String student_name) {
        investigationMapper.delectInvestigation(student_name);
    }
}
