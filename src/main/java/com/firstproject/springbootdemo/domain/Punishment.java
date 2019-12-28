package com.firstproject.springbootdemo.domain;

public class Punishment {
    //处分等级
    private String punishment_grade;
    //处分日期
    private String punishment_date;
    //处分名称
    private String punishment_name;
    //处分理由
    private String punishment_reason;
    //经办人姓名
    private String manager_name;
    //被处分人
    private String student_name;

    public String getPunishment_grade() {
        return punishment_grade;
    }

    public void setPunishment_grade(String punishment_grade) {
        this.punishment_grade = punishment_grade;
    }

    public String getPunishment_date() {
        return punishment_date;
    }

    public void setPunishment_date(String punishment_date) {
        this.punishment_date = punishment_date;
    }

    public String getPunishment_name() {
        return punishment_name;
    }

    public void setPunishment_name(String punishment_name) {
        this.punishment_name = punishment_name;
    }

    public String getPunishment_reason() {
        return punishment_reason;
    }

    public void setPunishment_reason(String punishment_reason) {
        this.punishment_reason = punishment_reason;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Punishment{" +
                "punishment_grade='" + punishment_grade + '\'' +
                ", punishment_date='" + punishment_date + '\'' +
                ", punishment_name='" + punishment_name + '\'' +
                ", punishment_reason='" + punishment_reason + '\'' +
                ", manager_name='" + manager_name + '\'' +
                '}';
    }
}
