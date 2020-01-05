package com.firstproject.springbootdemo.Controller;


import com.firstproject.springbootdemo.domain.*;
import com.firstproject.springbootdemo.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;


@Controller
@MapperScan("com.firstproject.springbootdemo.dao")
@ComponentScan("com.firstproject.springbootdemo.service")
public class StudentController {
    @Autowired
    private StudentService studentservice;
    @Autowired
    private studentInfoService studentInfoService;
    @Autowired
    private punishmentinfoService punishmentinfoService;
    @Autowired
    private familyinfoService familyinfoService;
    @Autowired
    private studenteminformationService studenteminformationService;
    @Autowired
    private studentpubmedService studentpubmedService;
    @Autowired
    private investigationService investigationService;
    @Autowired
    private schoolmsgService schoolmsgService;
    @Autowired
    private studentinformationService studentinformationService;
    private String studentname;
    /**
     * 登录界面
     * @return
     */
    @RequestMapping("login")
    public String login(){
        return "Login";
    }
    /**
     * 显示首页
     * @return
     */
    @RequestMapping("StudentIndex")
    public String StudentIndex(){
        return "StudentIndex";
    }

    /**
     * 学生用户登录
     * @param username
     * @param password
     * @return
     * @throws InterruptedException
     */
    @RequestMapping(value ="index", method = RequestMethod.POST)
    public String index(String username,String password, Model model) throws InterruptedException {
       Student student =studentservice.getUserByUsername(username);
       if (student != null){
           System.out.println(student.toString());
           if(student.getPassword().equals(password)){
               studentname = student.getName();
               return "redirect:StudentIndex";
       }
           else{
               model.addAttribute("msg","用户名或密码错误！");
               return "index";
           }
       }
       else{
           if("".equals(username) || "".equals(password)){
               model.addAttribute("msg","请输入用户名或密码！");
               return "index";
           }
           else {
               model.addAttribute("msg", "用户名或密码错误！");
               return "index";
           }
       }
    }

    /**
     * 显示个人信息界面
     * @return
     */
    @RequestMapping("editStudentInfo")
    public String editStudentInfo(Model model){
        studentInfo studentInfo =studentInfoService.getInfoByStudentName(studentname);
        if(studentInfo != null){
            model.addAttribute(studentInfo);
            return "showStudent";
        }
        else {
            return "student";
        }
    }

    @RequestMapping(value = "updateStudentInfo",method = RequestMethod.POST)
    public String updateStudentInfo(studentInfo studentInfo,Model model){
        System.out.println("更新学生信息!");
        studentInfo oldstudentInfo =studentInfoService.getInfoByStudentName(studentname);
        if(studentInfo.toString().equals(oldstudentInfo.toString())){
            model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
            model.addAttribute(oldstudentInfo);
            return "showStudent";
        }
        else {
            System.out.println("开始更新学生信息!");
            try {
                studentInfoService.updateStudentInfo(studentInfo);
                model.addAttribute("msg", "更新成功！");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
    }
    /**
     * 对学生输入的个人信息进行保存
     * @param studentInfo
     * @return
     * @throws InterruptedException
     */
    @RequestMapping(value="showStudentInfo",method = RequestMethod.POST)
    public String showStudentInfo(studentInfo studentInfo,Model model) throws InterruptedException {
        System.out.println("开始写入个人信息");
        if(studentInfo.getId_number()==null || studentInfo.getStudent_name()==null || studentInfo.getUsername()==null){
            model.addAttribute("msg","身份账号，姓名，学号为必填项！");
            return "student";
        }
        else {
            if("".equals(studentInfo.getId_number()) || "".equals(studentInfo.getStudent_name())
                    || "".equals(studentInfo.getUsername()))
            {
                model.addAttribute("msg","身份证号，姓名，学号为必填项！");
                return "student";
            }
            if(!(studentname.equals(studentInfo.getStudent_name()))){
                model.addAttribute("msg","请输入正确的姓名！");
                return "student";
            }

            if ("0".equals(studentInfo.getSex())) {
                studentInfo.setSex("男");
            }
            else if ("1".equals(studentInfo.getSex())) {
                studentInfo.setSex("女");
            }
            if ("0".equals(studentInfo.getIs_alone())){
                studentInfo.setIs_alone("是");
            }
            else if ("1".equals(studentInfo.getIs_alone())){
                studentInfo.setIs_alone("否");
            }

            switch (studentInfo.getPolitical_status()) {
                case "0":
                    studentInfo.setPolitical_status("中共党员");
                    break;
                case "1":
                    studentInfo.setPolitical_status("中共预备党员");
                    break;
                case "2":
                    studentInfo.setPolitical_status("共青团员");
                    break;
                case "3":
                    studentInfo.setPolitical_status("群众");
                    break;
                case "4":
                    studentInfo.setPolitical_status("无党派人士");
                    break;
                default:
                    break;
            }
            System.out.println(studentInfo);
            try{
                studentInfoService.insertStudentInfo(studentInfo);
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

    @RequestMapping("studentTop")
    public String studentTop(){
        return "StudentTop";
    }

    @RequestMapping("studentLeft")
    public String studentLeft(){
        return "StudentLeft";
    }

    /**
     * 显示家庭信息界面
     * @return
     */
    @RequestMapping("editfamilyInformation")
    public String familyInformation(Model model){
        Familyinfo familyinfo = familyinfoService.selectFamilyinfoByStudentname(studentname);
        if(familyinfo != null){
            model.addAttribute(familyinfo);
            return "showFamilyInformation";
        }
        return "FamilyInformation";
    }

    /**
     * 更新学生家庭信息
     * @param familyinfo
     * @param model
     * @return
     */
    @RequestMapping(value = "updatefamilyInformation",method = RequestMethod.POST)
    public String updatefamilyInformation(Familyinfo familyinfo,Model model){
        Familyinfo oldfamilyinfo = familyinfoService.selectFamilyinfoByStudentname(studentname);
        if(oldfamilyinfo.toString().equals(familyinfo.toString())){
            model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
            //model.addAttribute(oldfamilyinfo);
            return "showFamilyInformation";
        }
        else{
            System.out.println("开始更新学生家庭信息！");
            try {
                familyinfo.setStudent_name(studentname);
                familyinfoService.updateFamilyinfo(familyinfo);
                model.addAttribute("msg","更新成功！");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
    }

    /**
     * 将学生家庭信息进行保存
     * @param familyinfo
     * @return
     */
    @RequestMapping(value = "showfamilyInformation",method = RequestMethod.POST)
    public String showfamilyInformation(Familyinfo familyinfo,Model model){
        System.out.println("开始写入家庭信息！");
        if(familyinfo.getParentname() == null || familyinfo.getParent_phone_number()== null
                || "".equals(familyinfo.getParentname())){
            model.addAttribute("msg","父母姓名与电话号码为必填项!");
            return "FamilyInformation";
        }
        else{
            if("0".equals(familyinfo.getPoor_grade())){
                familyinfo.setPoor_grade("一般");
            }
            else if("1".equals(familyinfo.getPoor_grade())){
                familyinfo.setPoor_grade("特困");
            }
            switch (familyinfo.getRelationship()) {
                case "0":
                    familyinfo.setRelationship("父女");
                    break;
                case "1":
                    familyinfo.setRelationship("父子");
                    break;
                case "2":
                    familyinfo.setRelationship("母子");
                    break;
                case "3":
                    familyinfo.setRelationship("母女");
                    break;
                default:
                    break;
            }
            System.out.println(familyinfo);
            try {
                familyinfo.setStudent_name(studentname);
                familyinfoService.insertFamilyinfo(familyinfo);
                model.addAttribute("msg","提交成功");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败，请联系管理员！");
                return "fail";
            }
        }
    }
    /**
     * 显示学校信息界面
     * @return
     */
    @RequestMapping("studentScInformation")
    public String studentScInformation(Model model){
        Student studentinfo = studentservice.getScinfoByStudentname(studentname);
        Studentscinfo studentscinfo = studentinfo.getStudentscinfo();
        model.addAttribute(studentscinfo);
        return "StudentScInformation";
    }

    /**
     * 显示学籍信息界面
     * @return
     */
    @RequestMapping("schoolMsg")
    public String schoolMsg(Model model){
        Schoolmsg schoolmsg = schoolmsgService.selectSchoolmsgByStudentname(studentname);
        if(schoolmsg != null){
            model.addAttribute(schoolmsg);
            return "showSchoolMsg";
        }
        return "school-msg";
    }

    /**
     * 更新或写入学籍信息
     * @param schoolmsg
     * @param model
     * @return
     */
    @RequestMapping(value = "editSchoolMsg",method = RequestMethod.POST)
    public String editSchoolMsg(Schoolmsg schoolmsg,Model model){
        Schoolmsg oldschoolmsg =schoolmsgService.selectSchoolmsgByStudentname(studentname);
        if(oldschoolmsg != null){
            if(oldschoolmsg.toString().equals(schoolmsg.toString())){
                model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
                return "showSchoolMsg";
            }
            System.out.println("开始更新学籍信息！");
            try {
                if("".equals(schoolmsg.getClassname()) || "".equals(schoolmsg.getFaculty()) || "".equals(schoolmsg.getProfessional_title())
                        || "".equals(schoolmsg.getDisciplines()) || "".equals(schoolmsg.getAcademic_system()) || "".equals(schoolmsg.getEducation())) {
                    model.addAttribute("msg", "带星号的为必填项!");
                    return "showSchoolMsg";
                }
                schoolmsg.setStudent_name(studentname);
                schoolmsgService.updateSchoolmsg(schoolmsg);
                model.addAttribute("msg","更新成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
        else {
            System.out.println("开始写入学籍信息！");
            try {
                if("".equals(schoolmsg.getClassname()) || "".equals(schoolmsg.getFaculty()) || "".equals(schoolmsg.getProfessional_title())
                || "".equals(schoolmsg.getDisciplines()) || "".equals(schoolmsg.getAcademic_system()) || "".equals(schoolmsg.getEducation())){
                    model.addAttribute("msg","带星号的为必填项!");
                    return "school-msg";
                }
                schoolmsg.setStudent_name(studentname);
                System.out.println(schoolmsg.toString());
                schoolmsgService.insertSchoolmsg(schoolmsg);
                model.addAttribute("msg", "提交成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败，请联系管理员！");
                return "fail";
            }

        }

    }
    /**
     * 显示处分信息界面
     * @return
     */
    @RequestMapping("punishment")
    public String punishment(Model model){
      Punishment punishment = punishmentinfoService.selectPunishmentinfoByStudentname(studentname);
      if(punishment != null) {
          System.out.println(punishment.toString());
          model.addAttribute(punishment);
          return "punishment";
      }
      else{
          model.addAttribute("msg","该生没有处分记录！");
          return "successful";
      }
    }

    /**
     * 显示档案信息界面
     * @return
     */
    @RequestMapping("studentInformation")
    public String studentInformation(Model model){
        studentinformation studentinformation = studentinformationService.selectStudentinformationByStudentname(studentname);
        if(studentinformation != null){
            model.addAttribute(studentinformation);
            return "showStudentInformation";
        }
        return "StudentInformation";
    }

    /**
     * 写入或者更新档案信息
     * @param Studentinformation
     * @param model
     * @return
     */
    @RequestMapping(value = "editStudentInformation",method = RequestMethod.POST)
    public String editStudentInformation(studentinformation Studentinformation,Model model){
        studentinformation oldStudentinformation = studentinformationService.selectStudentinformationByStudentname(studentname);
        if(oldStudentinformation != null){
            if(oldStudentinformation.toString().equals(Studentinformation.toString())){
                model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
                return "showStudentInformation";
            }
            System.out.println("开始更新档案信息！");
            try {
                Studentinformation.setStudent_name(studentname);
                studentinformationService.updateStudentinformation(Studentinformation);
                model.addAttribute("msg","更新成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
        else{
            System.out.println("开始写入档案信息！");
            try {
                Studentinformation.setStudent_name(studentname);
                System.out.println(studentinformationService.toString());
                studentinformationService.insertStudentinformation(Studentinformation);
                model.addAttribute("msg", "提交成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败，请联系管理员！");
                return "fail";
            }
        }

    }
    /**
     * 显示就业信息界面
     * @return
     */
    @RequestMapping("studentEmInformation")
    public String studentEmInformation(Model model){
        System.out.println("查询学生就业信息！");
        Studenteminformation studenteminformation =studenteminformationService.selectStudenteminformationByStudentname(studentname);
        if(studenteminformation != null) {
            model.addAttribute(studenteminformation);
            return "StudentEmInformation";
        }
        return "showStudentEmInformation";
    }

    /**
     * 添加或更新就业信息
     * @param studenteminformation
     * @param model
     * @return
     */
    @RequestMapping(value = "editStudentEmInformation",method = RequestMethod.POST)
    public String editStudentEmInformation(Studenteminformation studenteminformation,Model model){
        Studenteminformation studenteminfo =studenteminformationService.selectStudenteminformationByStudentname(studentname);
        if(studenteminfo != null){
            if(studenteminfo.toString().equals(studenteminformation.toString())){
                model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
                //model.addAttribute(studenteminformation);
                return "StudentEmInformation";
            }
            System.out.println("开始更新就业信息！");
            try {
                studenteminformation.setStudent_name(studentname);
                studenteminformationService.updateStudenteminformation(studenteminformation);
                model.addAttribute("msg","更新成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
        else {
            System.out.println("开始写入就业信息！");
            try {
                studenteminformation.setStudent_name(studentname);
                System.out.println(studenteminformation.toString());
                studenteminformationService.insertStudenteminformation(studenteminformation);
                model.addAttribute("msg", "提交成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败，请联系管理员！");
                return "fail";
            }
        }
    }
    /**
     * 显示就业调查界面
     * @return
     */
    @RequestMapping("investigation")
    public String investigation(){
        return "investigation";
    }

    /**
     * 写入学生就业调查
     * @param investigation
     * @param model
     * @return
     */
    @RequestMapping(value = "editinvestigation",method = RequestMethod.POST)
    public String editinvestigation(investigation investigation,Model model){
        System.out.println("开始写入就业调查！");
        try {
            investigation.setStudent_name(studentname);
            System.out.println(investigation.toString());
            if("0".equals(investigation.getIs_further_education())){
                investigation.setIs_further_education("是");
            }
            if("1".equals(investigation.getIs_further_education())){
                investigation.setIs_further_education("否");
            }
            investigationService.insertInvestigation(investigation);
            model.addAttribute("msg", "提交成功!");
            return "successful";
        }
        catch (Exception error){
            System.out.println(error);
            model.addAttribute("msg","提交失败，请联系管理员！");
            return "fail";
        }
    }
    /**
     * 显示考研信息界面
     * @return
     */
    @RequestMapping("studentPubMed")
    public String studentPubMed(Model model){
        Studentpubmed studentpubmed = studentpubmedService.selectStudentpubmedByStudentname(studentname);
        if(studentpubmed != null){
            model.addAttribute(studentpubmed);
            return "showStudentPubMed";
        }
        return "StudentPubMed";
    }

    /**
     * 更新或存储考研信息
     * @param studentpubmed
     * @param model
     * @return
     */
    @RequestMapping(value = "editStudentPubMed",method = RequestMethod.POST)
    public String editStudentPubMed(Studentpubmed studentpubmed,Model model){
        Studentpubmed studentPubMedInfo =studentpubmedService.selectStudentpubmedByStudentname(studentname);
        if(studentPubMedInfo != null){
            if(studentPubMedInfo.toString().equals(studentpubmed.toString())){
                model.addAttribute("msg","信息没有进行更改，请重新进行更新！");
                //model.addAttribute(studentPubMedInfo);
                return "showStudentPubMed";
            }
            System.out.println("开始更新考研信息！");
            try {
                studentpubmed.setStudent_name(studentname);
                studentpubmedService.updateStudentpubmed(studentpubmed);
                model.addAttribute("msg","更新成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","更新失败，请联系管理员！");
                return "fail";
            }
        }
        else {
            System.out.println("开始写入考研信息！");
            try {
                studentpubmed.setStudent_name(studentname);
                System.out.println(studentpubmed.toString());
                studentpubmedService.insertStudentpubmed(studentpubmed);
                model.addAttribute("msg", "提交成功!");
                return "successful";
            }
            catch (Exception error){
                System.out.println(error);
                model.addAttribute("msg","提交失败，请联系管理员！");
                return "fail";
            }

        }

    }
    /**
     * 显示修改密码界面
     * @return
     */
    @RequestMapping("studentRevise")
    public String studentRevise(){
        return "StudentRevise";
    }

    /**
     * 修改密码
     * @param new_password
     * @param old_password
     * @param password_again
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("editpassword")
    public String editpassword(String new_password,String old_password,String password_again,Model model) throws Exception {
        System.out.println("开始修改密码!");
        Student student = studentservice.getUserByStudentname(studentname);
        if("".equals(new_password) || "".equals(old_password)){
            model.addAttribute("msg","原密码与新密码为必填项！");
            return "StudentRevise";
        }
        if(!(student.getPassword().equals(old_password))){
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
        student.setPassword(new_password);
        studentservice.update(student);
        model.addAttribute("success","密码修改成功,请点击重新登录！");
        return "successful";
    }
}