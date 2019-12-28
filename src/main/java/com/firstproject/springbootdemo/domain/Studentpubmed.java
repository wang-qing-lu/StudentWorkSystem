package com.firstproject.springbootdemo.domain;

public class Studentpubmed {
    //专业对口
    private String match_of_major;
    //报到证编号
    private Integer registration_card_number;
    //升学档案转寄
    private String file_to_school;
    //升学档案接收人
    private String give_file_person;
    //是否全日制研究生
    private String is_fulltime_graduate;
    //定向或委培单位
    private String directed_or_commissioned;
    //升学院校
    private String to_school;
    //学校邮编
    private Integer school_postcode;
    //录取院校地址
    private String school_adress;
    //接收人联系电话
    private Integer school_phone_number;
    //是否推免研究生
    private String is_push_graduate;
    private String student_name;

    public String getMatch_of_major() {
        return match_of_major;
    }

    public void setMatch_of_major(String match_of_major) {
        this.match_of_major = match_of_major;
    }

    public Integer getRegistration_card_number() {
        return registration_card_number;
    }

    public void setRegistration_card_number(Integer registration_card_number) {
        this.registration_card_number = registration_card_number;
    }

    public String getFile_to_school() {
        return file_to_school;
    }

    public void setFile_to_school(String file_to_school) {
        this.file_to_school = file_to_school;
    }

    public String getGive_file_person() {
        return give_file_person;
    }

    public void setGive_file_person(String give_file_person) {
        this.give_file_person = give_file_person;
    }

    public String getIs_fulltime_graduate() {
        return is_fulltime_graduate;
    }

    public void setIs_fulltime_graduate(String is_fulltime_graduate) {
        this.is_fulltime_graduate = is_fulltime_graduate;
    }

    public String getDirected_or_commissioned() {
        return directed_or_commissioned;
    }

    public void setDirected_or_commissioned(String directed_or_commissioned) {
        this.directed_or_commissioned = directed_or_commissioned;
    }

    public String getTo_school() {
        return to_school;
    }

    public void setTo_school(String to_school) {
        this.to_school = to_school;
    }

    public Integer getSchool_postcode() {
        return school_postcode;
    }

    public void setSchool_postcode(Integer school_postcode) {
        this.school_postcode = school_postcode;
    }

    public String getSchool_adress() {
        return school_adress;
    }

    public void setSchool_adress(String school_adress) {
        this.school_adress = school_adress;
    }

    public Integer getSchool_phone_number() {
        return school_phone_number;
    }

    public void setSchool_phone_number(Integer school_phone_number) {
        this.school_phone_number = school_phone_number;
    }

    public String getIs_push_graduate() {
        return is_push_graduate;
    }

    public void setIs_push_graduate(String is_push_graduate) {
        this.is_push_graduate = is_push_graduate;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Studentpubmed{" +
                "match_of_major='" + match_of_major + '\'' +
                ", registration_card_number=" + registration_card_number +
                ", file_to_school='" + file_to_school + '\'' +
                ", give_file_person='" + give_file_person + '\'' +
                ", is_fulltime_graduate='" + is_fulltime_graduate + '\'' +
                ", directed_or_commissioned='" + directed_or_commissioned + '\'' +
                ", to_school='" + to_school + '\'' +
                ", school_postcode=" + school_postcode +
                ", school_adress='" + school_adress + '\'' +
                ", school_phone_number=" + school_phone_number +
                ", is_push_graduate='" + is_push_graduate + '\'' +
                '}';
    }
}
