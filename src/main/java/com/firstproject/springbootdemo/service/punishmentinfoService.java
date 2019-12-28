package com.firstproject.springbootdemo.service;

import com.firstproject.springbootdemo.domain.Punishment;

import java.util.List;

public interface punishmentinfoService {
    /**
     * 查询所有学生处分信息
     * @return
     */
    List<Punishment> selectAllpunishmentinfo();

    /**
     * 通过学生姓名查询处分信息
     * @param student_name
     * @return
     */
    Punishment selectPunishmentinfoByStudentname(String student_name);

    /**
     * 添加学生的处分信息
     * @param punishment
     */
    void insertPunishmentinfo(Punishment punishment);

    /**
     * 根据学生姓名删除处分信息
     * @param student_name
     */
    void delectPunishmentinfo(String student_name);

}
