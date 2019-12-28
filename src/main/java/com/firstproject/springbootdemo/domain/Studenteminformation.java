package com.firstproject.springbootdemo.domain;

public class Studenteminformation {
    //单位名称
    private String company_name;
    //单位性质
    private String company_nature;
    //单位行业
    private String company_industry;
    //单位邮编
    private Integer company_postcode;
    //单位联系人
    private String company_person;
    //单位组织机构
    private String company_organization;
    //单位隶属部门
    private String company_affiliated_department;
    //单位所在地区
    private String company_area;
    //单位具体地址
    private String company_address;
    //单位联系人电话
    private Integer company_phone_number;
    //派遣时间
    private String dispatch_time;
    //报到证件签发类别
    private String registration_card_category;
    //报到证迁往单位名称
    private String registration_card_company;
    //档案转寄单位邮编
    private Integer file_company_postcode;
    //派遣报到证号
    private Integer registration_card_number;
    //档案转寄地址
    private String file_company_address;
    //录入日期
    private String enter_time;
    //特殊说明
    private String special_Instructions;
    //就业满意度
    private String employment_satisfaction;
    //是否就业标志
    private String employment_flag;
    private String student_name;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_nature() {
        return company_nature;
    }

    public void setCompany_nature(String company_nature) {
        this.company_nature = company_nature;
    }

    public String getCompany_industry() {
        return company_industry;
    }

    public void setCompany_industry(String company_industry) {
        this.company_industry = company_industry;
    }

    public Integer getCompany_postcode() {
        return company_postcode;
    }

    public void setCompany_postcode(Integer company_postcode) {
        this.company_postcode = company_postcode;
    }

    public String getCompany_person() {
        return company_person;
    }

    public void setCompany_person(String company_person) {
        this.company_person = company_person;
    }

    public String getCompany_organization() {
        return company_organization;
    }

    public void setCompany_organization(String company_organization) {
        this.company_organization = company_organization;
    }

    public String getCompany_affiliated_department() {
        return company_affiliated_department;
    }

    public void setCompany_affiliated_department(String company_affiliated_department) {
        this.company_affiliated_department = company_affiliated_department;
    }

    public String getCompany_area() {
        return company_area;
    }

    public void setCompany_area(String company_area) {
        this.company_area = company_area;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public Integer getCompany_phone_number() {
        return company_phone_number;
    }

    public void setCompany_phone_number(Integer company_phone_number) {
        this.company_phone_number = company_phone_number;
    }

    public String getDispatch_time() {
        return dispatch_time;
    }

    public void setDispatch_time(String dispatch_time) {
        this.dispatch_time = dispatch_time;
    }

    public String getRegistration_card_category() {
        return registration_card_category;
    }

    public void setRegistration_card_category(String registration_card_category) {
        this.registration_card_category = registration_card_category;
    }

    public String getRegistration_card_company() {
        return registration_card_company;
    }

    public void setRegistration_card_company(String registration_card_company) {
        this.registration_card_company = registration_card_company;
    }

    public Integer getFile_company_postcode() {
        return file_company_postcode;
    }

    public void setFile_company_postcode(Integer file_company_postcode) {
        this.file_company_postcode = file_company_postcode;
    }

    public Integer getRegistration_card_number() {
        return registration_card_number;
    }

    public void setRegistration_card_number(Integer registration_card_number) {
        this.registration_card_number = registration_card_number;
    }

    public String getFile_company_address() {
        return file_company_address;
    }

    public void setFile_company_address(String file_company_address) {
        this.file_company_address = file_company_address;
    }

    public String getEnter_time() {
        return enter_time;
    }

    public void setEnter_time(String enter_time) {
        this.enter_time = enter_time;
    }

    public String getSpecial_Instructions() {
        return special_Instructions;
    }

    public void setSpecial_Instructions(String special_Instructions) {
        this.special_Instructions = special_Instructions;
    }

    public String getEmployment_satisfaction() {
        return employment_satisfaction;
    }

    public void setEmployment_satisfaction(String employment_satisfaction) {
        this.employment_satisfaction = employment_satisfaction;
    }

    public String getEmployment_flag() {
        return employment_flag;
    }

    public void setEmployment_flag(String employment_flag) {
        this.employment_flag = employment_flag;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Studenteminformation{" +
                "company_name='" + company_name + '\'' +
                ", company_nature='" + company_nature + '\'' +
                ", company_industry='" + company_industry + '\'' +
                ", company_postcode=" + company_postcode +
                ", company_person='" + company_person + '\'' +
                ", company_organization='" + company_organization + '\'' +
                ", company_affiliated_department='" + company_affiliated_department + '\'' +
                ", company_area='" + company_area + '\'' +
                ", company_address='" + company_address + '\'' +
                ", company_phone_number=" + company_phone_number +
                ", dispatch_time='" + dispatch_time + '\'' +
                ", registration_card_category='" + registration_card_category + '\'' +
                ", registration_card_company='" + registration_card_company + '\'' +
                ", file_company_postcode=" + file_company_postcode +
                ", registration_card_number=" + registration_card_number +
                ", file_company_address='" + file_company_address + '\'' +
                ", enter_time='" + enter_time + '\'' +
                ", special_Instructions='" + special_Instructions + '\'' +
                ", employment_satisfaction='" + employment_satisfaction + '\'' +
                ", employment_flag='" + employment_flag + '\'' +
                '}';
    }
}
