package com.firstproject.springbootdemo.domain;

public class studentinformation {
    //代理类型
    private String proxy_type;
    //有无组织关系
    private String organization_relationship;
    //人才代理标志
    private String talent_sign;
    //是否签订三方协议
    private String sign_the_agreement;
    //公司名称
    private String company_name;
    //学生姓名
    private String student_name;

    public String getProxy_type() {
        return proxy_type;
    }

    public void setProxy_type(String proxy_type) {
        this.proxy_type = proxy_type;
    }

    public String getOrganization_relationship() {
        return organization_relationship;
    }

    public void setOrganization_relationship(String organization_relationship) {
        this.organization_relationship = organization_relationship;
    }

    public String getTalent_sign() {
        return talent_sign;
    }

    public void setTalent_sign(String talent_sign) {
        this.talent_sign = talent_sign;
    }

    public String getSign_the_agreement() {
        return sign_the_agreement;
    }

    public void setSign_the_agreement(String sign_the_agreement) {
        this.sign_the_agreement = sign_the_agreement;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "studentinformation{" +
                "proxy_type='" + proxy_type + '\'' +
                ", organization_relationship='" + organization_relationship + '\'' +
                ", talent_sign='" + talent_sign + '\'' +
                ", sign_the_agreement='" + sign_the_agreement + '\'' +
                ", company_name='" + company_name + '\'' +
                '}';
    }
}
