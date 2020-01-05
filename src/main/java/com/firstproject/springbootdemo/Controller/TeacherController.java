package com.firstproject.springbootdemo.Controller;


import com.firstproject.springbootdemo.domain.*;
import com.firstproject.springbootdemo.service.*;
import org.apache.ibatis.jdbc.Null;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@MapperScan("com.firstproject.springbootdemo.dao")
@ComponentScan("com.firstproject.springbootdemo.service")
public class TeacherController {

    @Autowired
    private teacherService teacherService;
    @Autowired
    private investigationService investigationService;
    @Autowired
    private studentpubmedService studentpubmedService;
    @Autowired
    private studenteminformationService studenteminformationService;
    @Autowired
    private studentInfoService studentInfoService;
    @Autowired
    private teacherInfoService teacherInfoService;
    private String teacher_username;
    private String teacher_name;
    /**
     * 教职工人员登录
     *
     * @param username
     * @param password
     * @param model
     * @return
     */
    @RequestMapping(value = "teacher", method = RequestMethod.POST)
    public String teacherIndex(String username, String password, Model model) {
        Teacher teacher = teacherService.selectTeacherInfoByUsername(username);
        if (teacher != null) {
            System.out.println(teacher.toString());
            if (teacher.getPassword().equals(password)) {
                teacher_username = teacher.getUsername();
                teacher_name = teacher.getTeacher_name();
                return "redirect:TeacherIndex";
            } else {
                model.addAttribute("msg", "用户名或密码错误！");
                return "index";
            }
        } else {
            if ("".equals(username) || "".equals(password)) {
                model.addAttribute("msg", "请输入用户名或密码！");
                return "index";
            } else {
                System.out.println("------------------------");
                model.addAttribute("msg", "用户名或密码错误！");
                return "index";
            }
        }
    }

    @RequestMapping("TeacherIndex")
    public String TeacherIndex(){
        return "TeacherIndex";
    }

    @RequestMapping("TeacherTop")
    public String TeacherTop(){
        return "TeacherTop";
    }

    @RequestMapping("TeacherLeft")
    public String TeacherLeft(){
        return "TeacherLeft";
    }

    /**
     * 展示教师个人信息页
     * @return
     */
    @RequestMapping("showTeacherInfo")
    public String showTeacherInfo(Model model){
        TeacherInfo teacherInfo =teacherInfoService.selectTeacherInfoByUsername(teacher_username);
        if(teacherInfo != null){
            model.addAttribute(teacherInfo);
            return "showTeacherPersonalInfo";
        }
        return "TeacherPersonalInfo";
    }
    /**
     * 处理教师个人信息
     * @param teacherInfo
     * @param model
     * @return
     */
    @RequestMapping("emitTeacherInfo")
    public String emitTeacherInfo(TeacherInfo teacherInfo,Model model){
        TeacherInfo old_teacherInfo = teacherInfoService.selectTeacherInfoByUsername(teacher_username);
        if(old_teacherInfo != null){
            if(old_teacherInfo.toString().equals(teacherInfo.toString())){
                model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
                return "showTeacherPersonalInfo";
            }
            else{
                System.out.println("开始更新教师个人信息！");
                try{
                    teacherInfoService.updateTeacherInfo(teacherInfo);
                    model.addAttribute("msg", "更新成功！");
                    return "successful";
                }
                catch (Exception error){
                    error.printStackTrace();
                    model.addAttribute("msg","更新失败，请联系管理员！");
                    return "fail";
                }
            }
        }
        else {
            System.out.println("开始写入教师个人信息!");
            if ("".equals(teacherInfo.getTeacher_id_number()) || "".equals(teacherInfo.getTeacher_username()) || "".equals(teacherInfo.getTeacher_name())) {
                model.addAttribute("msg", "身份证号，姓名，工号为必填项！");
                return "TeacherPersonalInfo";
            }
            if(!(teacher_username.equals(teacherInfo.getTeacher_username())) || !(teacher_name.equals(teacherInfo.getTeacher_name()))){
                model.addAttribute("msg","请输入正确的工号与姓名！");
                return "TeacherPersonalInfo";
            }
            if("0".equals(teacherInfo.getTeacher_grade())){
                teacherInfo.setTeacher_grade("专业课教师");
            }
            if("1".equals(teacherInfo.getTeacher_grade())){
                teacherInfo.setTeacher_grade("副科教师");
            }
            try{
                teacherInfoService.insertTeacherInfo(teacherInfo);
                model.addAttribute("msg","提交成功！");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败,请联系管理员!");
                return "fail";
            }
        }
    }

    /**
     * 展示学生信息统计图页面
     * @param model
     * @return
     */
    @RequestMapping("showStatisticalFigure")
    public String showStatisticalFigure(Model model){
        return "StatisticalFigure";
    }

    /**
     * 展示教师信息
     * @param model
     * @return
     */
    @RequestMapping("showTeacher")
    public String showTeacher(Model model){
        List<TeacherInfo> Professional_teacherInfos = teacherInfoService.selsectAllTeacherInfo("专业课教师");
        List<TeacherInfo> Associate_subject_teachers = teacherInfoService.selsectAllTeacherInfo("副科教师");
        if(Professional_teacherInfos != null && Associate_subject_teachers != null){
            model.addAttribute("teacherList",Professional_teacherInfos);
            model.addAttribute("subjectList",Associate_subject_teachers);
            return "TeacherInfo";
        }
        else if(Professional_teacherInfos != null && Associate_subject_teachers == null){
            model.addAttribute(Professional_teacherInfos);
            return "TeacherInfo";
        }
        else if(Professional_teacherInfos == null && Associate_subject_teachers != null){
            model.addAttribute(Associate_subject_teachers);
            return "TeacherInfo";
        }
        else{
            model.addAttribute("msg","查询失败，请联系管理员进行处理！");
            return "fail";
        }

    }

    /**
     * 展示学生信息
     * @param model
     * @return
     */
    @RequestMapping("showStudentInfo")
    public String showStudentInfo(Model model){
        return "StudentInfo";
    }

    /**
     * 展示搜索学生基本信息界面
     * @return
     */
    @RequestMapping("searchStudent")
    public String searchStudent(){
        return "search";
    }

    /**
     * 展示学生基本信息
     * @param student_name
     * @return
     */
    @RequestMapping("showStudent")
    public String showStudent(String student_name,Model model){
        try {
            System.out.println(student_name);
            studentInfo studentInfo = studentInfoService.getInfoByStudentName(student_name);
            if (studentInfo != null) {
                model.addAttribute("name",student_name);
                model.addAttribute(studentInfo);
                return "showStudent";
            }
        }
        catch(Exception error){
            error.printStackTrace();
            model.addAttribute("msg","查询失败，请联系管理员！");
            return "fail";
        }
        model.addAttribute("msg","查询失败，请确认姓名输入是否正确或学生是否填写！");
        return "fail";
    }

    /**
     * 搜索学生就业信息界面
     * @return
     */
    @RequestMapping("searchStudentEmInfo")
    public String searchStudentEmInfo(){
        return "searchStudentEmInfo";
    }

    /**
     * 展示学生就业信息界面
     * @param student_name
     * @return
     */
    @RequestMapping("showStudentEmInfo")
    public String showStudentEmInfo(String student_name,Model model){
        System.out.println("查询学生就业信息！");
        try{
            Studenteminformation studenteminformation =studenteminformationService.selectStudenteminformationByStudentname(student_name);
            if(studenteminformation != null) {
                model.addAttribute("name", student_name);
                model.addAttribute(studenteminformation);
                return "StudentEmInformation";
            }
        }
        catch(Exception error){
            error.printStackTrace();
            model.addAttribute("msg","查询失败，请联系管理员！");
            return "fail";
        }
        model.addAttribute("msg","查询失败，请确认姓名输入是否正确或学生是否填写！");
        return "fail";
    }

    /**
     * 搜索学生就业调查
     * @param student_name
     * @return
     */
    @RequestMapping("searchInvestigation")
    public String searchInvestigation(String student_name){
        return "searchInvestigation";
    }

    /**
     * 展示学生就业调查
     * @param student_name
     * @return
     */
    @RequestMapping("showInvestigation")
    public String showInvestigation(String student_name,Model model){
        System.out.println("开始查询学生就业调查!");
        try {
            investigation investigation = investigationService.selectInvestigationByStudentname(student_name);
            if (investigation != null) {
                model.addAttribute("name", student_name);
                model.addAttribute(investigation);
                return "showInvestigation";
            }
        }
        catch(Exception error){
            error.printStackTrace();
            model.addAttribute("msg","查询失败，请联系管理员！");
            return "fail";
        }
        model.addAttribute("msg","查询失败，请确认姓名输入是否正确或学生是否填写！");
        return "fail";
    }


    /**
     * 搜索学生考研信息
     * @return
     */
    @RequestMapping("searchStudentPubmed")
    public String searchStudentPubmed(){
        return "searchStudentPubmed";
    }

    /**
     * 展示学生考研信息
     * @param student_name
     * @return
     */
    @RequestMapping("showStudentPubmed")
    public String showStudentPubmed(String student_name,Model model){
        try {
            Studentpubmed studentpubmed =studentpubmedService.selectStudentpubmedByStudentname(student_name);
            if (studentpubmed != null) {
                model.addAttribute("name", student_name);
                model.addAttribute(studentpubmed);
                return "showStudentPubMed";
            }
        }
        catch(Exception error){
            error.printStackTrace();
            model.addAttribute("msg","查询失败，请联系管理员！");
            return "fail";
        }
        model.addAttribute("msg","查询失败，请确认姓名输入是否正确或学生是否填写！");
        return "fail";

    }
    /**
     * 展示修改密码界面
     * @return
     */
    @RequestMapping("showTeacherRevise")
    public String showTeacherRevise(){
        return "TeacherRevise";
    }

    /**
     * 修改密码
     * @param new_password
     * @param old_password
     * @param password_again
     * @param model
     * @return
     */
    @RequestMapping("password")
    public String password(String new_password,String old_password,String password_again,Model model){
        System.out.println("开始修改密码!");
        Teacher teacher = teacherService.selectTeacherInfoByUsername(teacher_username);
        if("".equals(new_password) || "".equals(old_password)){
            model.addAttribute("msg","原密码与新密码为必填项！");
            return "StudentRevise";
        }
        if(!(teacher.getPassword().equals(old_password))){
            model.addAttribute("msg","原密码输入错误，请重新输入！");
            return "StudentRevise";
        }
        if(!(new_password.equals(password_again))){
            model.addAttribute("msg","两次输入密码不一致，请重新输入！");
            return "StudentRevise";
        }
        if (new_password.equals(old_password)){
            model.addAttribute("msg","新密码与上次密码相同，请重新输入！");
            return "StudentRevise";
        }
        teacher.setPassword(new_password);
        teacherService.UpdateTeacherInfo(teacher);
        model.addAttribute("success","密码修改成功,请点击重新登录！");
        return "successful";
    }
}

