package com.firstproject.springbootdemo.domain;

public class Familyinfo {
    private String parentname;
    //关系
    private String relationship;
    private Long parent_phone_number;
    //邮政编码
    private Integer zip_code;
    //代码编号
    private Integer flocation_id;
    //贫困等级
    private String poor_grade;
    //户籍地址
    private String residence_address;
    private String family_address;
    private String student_name;

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Long getParent_phone_number() {
        return parent_phone_number;
    }

    public void setParent_phone_number(Long parent_phone_number) {
        this.parent_phone_number = parent_phone_number;
    }

    public Integer getZip_code() {
        return zip_code;
    }

    public void setZip_code(Integer zip_code) {
        this.zip_code = zip_code;
    }

    public Integer getFlocation_id() {
        return flocation_id;
    }

    public void setFlocation_id(Integer flocation_id) {
        this.flocation_id = flocation_id;
    }

    public String getPoor_grade() {
        return poor_grade;
    }

    public void setPoor_grade(String poor_grade) {
        this.poor_grade = poor_grade;
    }

    public String getResidence_address() {
        return residence_address;
    }

    public void setResidence_address(String residence_address) {
        this.residence_address = residence_address;
    }

    public String getFamily_address() {
        return family_address;
    }

    public void setFamily_address(String family_address) {
        this.family_address = family_address;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Familyinfo{" +
                "parentname='" + parentname + '\'' +
                ", relationship='" + relationship + '\'' +
                ", parent_phone_number=" + parent_phone_number +
                ", zip_code=" + zip_code +
                ", flocation_id=" + flocation_id +
                ", poor_grade='" + poor_grade + '\'' +
                ", residence_address='" + residence_address + '\'' +
                ", family_address='" + family_address + '\'' +
                '}';
    }
}
