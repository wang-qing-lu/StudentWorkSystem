package com.firstproject.springbootdemo.domain;

public class Student {

    private String username;
    private String password;
    private String name;
    private Integer schoolId;
    private Studentscinfo studentscinfo;

    public Studentscinfo getStudentscinfo() {
        return studentscinfo;
    }

    public void setStudentscinfo(Studentscinfo studentscinfo) {
        this.studentscinfo = studentscinfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", schoolId=" + schoolId +
                ", studentscinfo=" + studentscinfo +
                '}';
    }
}
