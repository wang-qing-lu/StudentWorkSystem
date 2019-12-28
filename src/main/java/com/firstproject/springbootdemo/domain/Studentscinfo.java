package com.firstproject.springbootdemo.domain;

public class Studentscinfo {
    //所在校区
    private String campus;
    //院校名称
    private String college_name;
    //院校所在省份代码
    private Integer college_province_id;
    //院校隶属部门代码
    private Integer college_department_id;
    //分校名称
    private String branch_name;
    //院校代码
    private Integer branch_id;
    //院校所在地代码
    private Integer branch_province_id;
    private Integer school_id;

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public Integer getCollege_province_id() {
        return college_province_id;
    }

    public void setCollege_province_id(Integer college_province_id) {
        this.college_province_id = college_province_id;
    }

    public Integer getCollege_department_id() {
        return college_department_id;
    }

    public void setCollege_department_id(Integer college_department_id) {
        this.college_department_id = college_department_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public Integer getBranch_province_id() {
        return branch_province_id;
    }

    public void setBranch_province_id(Integer branch_province_id) {
        this.branch_province_id = branch_province_id;
    }

    public Integer getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Integer school_id) {
        this.school_id = school_id;
    }

    @Override
    public String toString() {
        return "Studentscinfo{" +
                "campus='" + campus + '\'' +
                ", college_name='" + college_name + '\'' +
                ", college_province_id=" + college_province_id +
                ", college_department_id=" + college_department_id +
                ", branch_name='" + branch_name + '\'' +
                ", branch_id=" + branch_id +
                ", branch_province_id=" + branch_province_id +
                ", school_id=" + school_id +
                '}';
    }
}
