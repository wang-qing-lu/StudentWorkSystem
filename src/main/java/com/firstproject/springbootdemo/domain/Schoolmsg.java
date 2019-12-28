package com.firstproject.springbootdemo.domain;

public class Schoolmsg {
    //考生号码
    private Integer candidate_number;
    //原考生号
    private Integer old_candidate_number;
    //入学时间
    private String join_school_time;
    //毕业时间
    private String gradaution_time;
    //困难生类别
    private String difficult_students_category;
    //生源所在地
    private String location_of_student;
    //学籍是否变动
    private String student_status;
    //留级退学标志
    private String drop_out_status;
    //在校任职情况
    private String is_worker_school;
    //综合测评情况
    private String overview;
    //档案是否转入学校
    private String file_is_transferred;
    //户口是否转入学校
    private String accunt_is_transferred;
    //入学前档案所在单位
    private String before_school;
    //学历
    private String education;
    //学制
    private String academic_system;
    //学科门类
    private String disciplines;
    //专业名称
    private String professional_title;
    //所在院系
    private String faculty;
    //所在班级
    private String classname;
    //主修外语语种
    private String main_foreign_language;
    private String student_name;

    public Integer getCandidate_number() {
        return candidate_number;
    }

    public void setCandidate_number(Integer candidate_number) {
        this.candidate_number = candidate_number;
    }

    public Integer getOld_candidate_number() {
        return old_candidate_number;
    }

    public void setOld_candidate_number(Integer old_candidate_number) {
        this.old_candidate_number = old_candidate_number;
    }

    public String getJoin_school_time() {
        return join_school_time;
    }

    public void setJoin_school_time(String join_school_time) {
        this.join_school_time = join_school_time;
    }

    public String getGradaution_time() {
        return gradaution_time;
    }

    public void setGradaution_time(String gradaution_time) {
        this.gradaution_time = gradaution_time;
    }

    public String getDifficult_students_category() {
        return difficult_students_category;
    }

    public void setDifficult_students_category(String difficult_students_category) {
        this.difficult_students_category = difficult_students_category;
    }

    public String getLocation_of_student() {
        return location_of_student;
    }

    public void setLocation_of_student(String location_of_student) {
        this.location_of_student = location_of_student;
    }

    public String getStudent_status() {
        return student_status;
    }

    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }

    public String getDrop_out_status() {
        return drop_out_status;
    }

    public void setDrop_out_status(String drop_out_status) {
        this.drop_out_status = drop_out_status;
    }

    public String getIs_worker_school() {
        return is_worker_school;
    }

    public void setIs_worker_school(String is_worker_school) {
        this.is_worker_school = is_worker_school;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFile_is_transferred() {
        return file_is_transferred;
    }

    public void setFile_is_transferred(String file_is_transferred) {
        this.file_is_transferred = file_is_transferred;
    }

    public String getAccunt_is_transferred() {
        return accunt_is_transferred;
    }

    public void setAccunt_is_transferred(String accunt_is_transferred) {
        this.accunt_is_transferred = accunt_is_transferred;
    }

    public String getBefore_school() {
        return before_school;
    }

    public void setBefore_school(String before_school) {
        this.before_school = before_school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAcademic_system() {
        return academic_system;
    }

    public void setAcademic_system(String academic_system) {
        this.academic_system = academic_system;
    }

    public String getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String disciplines) {
        this.disciplines = disciplines;
    }

    public String getProfessional_title() {
        return professional_title;
    }

    public void setProfessional_title(String professional_title) {
        this.professional_title = professional_title;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMain_foreign_language() {
        return main_foreign_language;
    }

    public void setMain_foreign_language(String main_foreign_language) {
        this.main_foreign_language = main_foreign_language;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Schoolmsg{" +
                "candidate_number=" + candidate_number +
                ", old_candidate_number=" + old_candidate_number +
                ", join_school_time='" + join_school_time + '\'' +
                ", gradaution_time='" + gradaution_time + '\'' +
                ", difficult_students_category='" + difficult_students_category + '\'' +
                ", location_of_student='" + location_of_student + '\'' +
                ", student_status='" + student_status + '\'' +
                ", drop_out_status='" + drop_out_status + '\'' +
                ", is_worker_school='" + is_worker_school + '\'' +
                ", overview='" + overview + '\'' +
                ", file_is_transferred='" + file_is_transferred + '\'' +
                ", accunt_is_transferred='" + accunt_is_transferred + '\'' +
                ", before_school='" + before_school + '\'' +
                ", education='" + education + '\'' +
                ", academic_system='" + academic_system + '\'' +
                ", disciplines='" + disciplines + '\'' +
                ", professional_title='" + professional_title + '\'' +
                ", faculty='" + faculty + '\'' +
                ", classname='" + classname + '\'' +
                ", main_foreign_language='" + main_foreign_language + '\'' +
                '}';
    }
}
