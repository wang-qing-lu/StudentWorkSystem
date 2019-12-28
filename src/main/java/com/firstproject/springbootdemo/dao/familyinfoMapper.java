package com.firstproject.springbootdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import com.firstproject.springbootdemo.domain.Familyinfo;

import java.util.List;

@Mapper
public interface familyinfoMapper {
    /**
     * 查询所有学生家庭信息
     * @return
     */
    List<Familyinfo> selectAllFamilyinfo();

    /**
     * 根据学生姓名查找家庭信息
     * @param student_name
     * @return
     */
    Familyinfo selectFamilyinfoByStudentname(String student_name);

    /**
     * 更新学生家庭信息
     * @param familyinfo
     */
    void updateFamilyinfo(Familyinfo familyinfo);

    /**
     * 添加学生家庭信息
     * @param familyinfo
     */
    void insertFamilyinfo(Familyinfo familyinfo);

    /**
     * 删除学生家庭信息
     * @param familyinfo
     */
    void delectFamilyinfo(Familyinfo familyinfo);
}
