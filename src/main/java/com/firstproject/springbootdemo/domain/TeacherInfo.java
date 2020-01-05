package com.firstproject.springbootdemo.domain;

public class TeacherInfo {
    private String teacher_name;
    private String teacher_sex;
    private String teacher_birthday;
    private String teacher_id_number;
    private String teacher_username;
    private String teacher_nation;
    private String teacher_political_status;
    private String teacher_grade;
    private String teacher_phone_number;
    private String teacher_qq;
    private String teacher_email;
    private String teacher_address;
    private String teacher_course;

    public String getTeacher_course() {
        return teacher_course;
    }

    public void setTeacher_course(String teacher_course) {
        this.teacher_course = teacher_course;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public String getTeacher_birthday() {
        return teacher_birthday;
    }

    public void setTeacher_birthday(String teacher_birthday) {
        this.teacher_birthday = teacher_birthday;
    }

    public String getTeacher_id_number() {
        return teacher_id_number;
    }

    public void setTeacher_id_number(String teacher_id_number) {
        this.teacher_id_number = teacher_id_number;
    }

    public String getTeacher_username() {
        return teacher_username;
    }

    public void setTeacher_username(String teacher_username) {
        this.teacher_username = teacher_username;
    }

    public String getTeacher_nation() {
        return teacher_nation;
    }

    public void setTeacher_nation(String teacher_nation) {
        this.teacher_nation = teacher_nation;
    }

    public String getTeacher_political_status() {
        return teacher_political_status;
    }

    public void setTeacher_political_status(String teacher_political_status) {
        this.teacher_political_status = teacher_political_status;
    }

    public String getTeacher_grade() {
        return teacher_grade;
    }

    public void setTeacher_grade(String teacher_grade) {
        this.teacher_grade = teacher_grade;
    }

    public String getTeacher_phone_number() {
        return teacher_phone_number;
    }

    public void setTeacher_phone_number(String teacher_phone_number) {
        this.teacher_phone_number = teacher_phone_number;
    }

    public String getTeacher_qq() {
        return teacher_qq;
    }

    public void setTeacher_qq(String teacher_qq) {
        this.teacher_qq = teacher_qq;
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String teacher_email) {
        this.teacher_email = teacher_email;
    }

    public String getTeacher_address() {
        return teacher_address;
    }

    public void setTeacher_address(String teacher_address) {
        this.teacher_address = teacher_address;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "teacher_name='" + teacher_name + '\'' +
                ", teacher_sex='" + teacher_sex + '\'' +
                ", teacher_birthday='" + teacher_birthday + '\'' +
                ", teacher_id_number='" + teacher_id_number + '\'' +
                ", teacher_username='" + teacher_username + '\'' +
                ", teacher_nation='" + teacher_nation + '\'' +
                ", teacher_political_status='" + teacher_political_status + '\'' +
                ", teacher_grade='" + teacher_grade + '\'' +
                ", teacher_phone_number='" + teacher_phone_number + '\'' +
                ", teacher_qq='" + teacher_qq + '\'' +
                ", teacher_email='" + teacher_email + '\'' +
                ", teacher_address='" + teacher_address + '\'' +
                ", teacher_course='" + teacher_course + '\'' +
                '}';
    }
}
