package com.firstproject.springbootdemo.Impl;

import com.firstproject.springbootdemo.domain.Punishment;
import com.firstproject.springbootdemo.service.punishmentinfoService;
import org.springframework.stereotype.Service;
import com.firstproject.springbootdemo.dao.punishmentinfoMapper;
import javax.annotation.Resource;
import java.util.List;

@Service("punishmentinfoService")
public class PunishmentinfoServiceImpl implements punishmentinfoService{
    @Resource
    private punishmentinfoMapper punishmentinfoMapper;

    @Override
    public List<Punishment> selectAllpunishmentinfo() {
        return punishmentinfoMapper.selectAllpunishmentinfo();
    }

    @Override
    public Punishment selectPunishmentinfoByStudentname(String student_name) {
        return punishmentinfoMapper.selectPunishmentinfoByStudentname(student_name);
    }

    @Override
    public void insertPunishmentinfo(Punishment punishment) {
        punishmentinfoMapper.insertPunishmentinfo(punishment);
    }

    @Override
    public void delectPunishmentinfo(String student_name) {
        punishmentinfoMapper.delectPunishmentinfo(student_name);
    }
}
