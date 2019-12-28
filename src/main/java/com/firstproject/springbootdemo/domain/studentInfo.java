package com.firstproject.springbootdemo.domain;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.DateTimeException;
import java.util.Date;

public class studentInfo {
    private String student_name;
    private String username;
    private String sex;
    private String nation;
    private String birth_data;
    private String political_status;
    private String is_alone;
    private String id_number;
    private Long phone_number;
    private String email;
    private Long qq;
    private String teacher_name;
    private Long teacher_phone_number;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirth_data() {
        return birth_data;
    }

    public void setBirth_data(String birth_data) {
        this.birth_data = birth_data;
    }

    public String getPolitical_status() {
        return political_status;
    }

    public void setPolitical_status(String political_status) {
        this.political_status = political_status;
    }

    public String getIs_alone() {
        return is_alone;
    }

    public void setIs_alone(String is_alone) {
        this.is_alone = is_alone;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getQq() {
        return qq;
    }

    public void setQq(Long qq) {
        this.qq = qq;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public Long getTeacher_phone_number() {
        return teacher_phone_number;
    }

    public void setTeacher_phone_number(Long teacher_phone_number) {
        this.teacher_phone_number = teacher_phone_number;
    }

    @Override
    public String toString() {
        return "studentInfo{" +
                "student_name='" + student_name + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", birth_data=" + birth_data +
                ", political_status='" + political_status + '\'' +
                ", is_alone=" + is_alone +
                ", id_number='" + id_number + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                ", qq=" + qq +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_phone_number=" + teacher_phone_number +
                '}';
    }
}
