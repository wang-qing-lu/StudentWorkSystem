package com.firstproject.springbootdemo.domain;

public class investigation {
    //期望工作地域
    private String expected_work_area;
    //期望工作单位
    private String expected_company;
    //是否准备升学
    private String is_further_education;
    //备注
    private String remark;
    //期望工作地点
    private String expected_work_address;
    //期望薪资
    private Integer expected_wage;
    //工作与专业相关程度
    private String work_profession_related;
    //学生姓名
    private String student_name;

    public String getExpected_work_area() {
        return expected_work_area;
    }

    public void setExpected_work_area(String expected_work_area) {
        this.expected_work_area = expected_work_area;
    }

    public String getExpected_company() {
        return expected_company;
    }

    public void setExpected_company(String expected_company) {
        this.expected_company = expected_company;
    }

    public String getIs_further_education() {
        return is_further_education;
    }

    public void setIs_further_education(String is_further_education) {
        this.is_further_education = is_further_education;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExpected_work_address() {
        return expected_work_address;
    }

    public void setExpected_work_address(String expected_work_address) {
        this.expected_work_address = expected_work_address;
    }

    public Integer getExpected_wage() {
        return expected_wage;
    }

    public void setExpected_wage(Integer expected_wage) {
        this.expected_wage = expected_wage;
    }

    public String getWork_profession_related() {
        return work_profession_related;
    }

    public void setWork_profession_related(String work_profession_related) {
        this.work_profession_related = work_profession_related;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "investigation{" +
                "expected_work_area='" + expected_work_area + '\'' +
                ", expected_company='" + expected_company + '\'' +
                ", is_further_education='" + is_further_education + '\'' +
                ", remark='" + remark + '\'' +
                ", expected_work_address='" + expected_work_address + '\'' +
                ", expected_wage=" + expected_wage +
                ", work_profession_related='" + work_profession_related + '\'' +
                '}';
    }
}
