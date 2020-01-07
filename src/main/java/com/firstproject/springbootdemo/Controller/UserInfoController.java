package com.firstproject.springbootdemo.Controller;

import com.firstproject.springbootdemo.domain.Teacher;
import com.firstproject.springbootdemo.domain.TeacherInfo;
import com.firstproject.springbootdemo.service.teacherInfoService;
import com.firstproject.springbootdemo.service.teacherService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import com.firstproject.springbootdemo.service.studentInfoService;
import com.firstproject.springbootdemo.service.StudentService;
import com.firstproject.springbootdemo.domain.studentInfo;
import com.firstproject.springbootdemo.domain.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@MapperScan("com.firstproject.springbootdemo.dao")
@ComponentScan("com.firstproject.springbootdemo.service")
public class UserInfoController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private studentInfoService studentInfoService;
    @Autowired
    private teacherService teacherService;
    @Autowired
    private teacherInfoService teacherInfoService;
    /**
     * 显示忘记密码页面
     * @return
     */
    @RequestMapping("replacePassword")
    public String replacePassword(){
        return "password";
    }

    /**
     * 进行身份验证更新密码后并登录
     * 如身份认证失败返回忘记密码界面
     * @param username
     * @param id_number
     * @param password
     * @return
     */
    @RequestMapping(value="show",method = RequestMethod.POST)
    public String show(String username, String id_number, String password, String password_again, Model model) throws Exception{
        System.out.println("username="+username+"id_number="+id_number);
        if(!(password.equals(password_again))){
            model.addAttribute("msg","两次输入密码不一致！");
            return "password";
        }
        else {
            Student student = studentService.getUserByUsername(username);
            Teacher teacher = teacherService.selectTeacherInfoByUsername(username);
            if(student != null) {
                studentInfo info = new studentInfo();
                info.setUsername(username);
                info.setId_number(id_number);
                studentInfo studentInfo = studentInfoService.getINfoByUsernameAndId(info);
                if (studentInfo != null) {
                    System.out.println(studentInfo.toString());
                    student.setPassword(password);
                    studentService.update(student);
                    return "login";
                } else {
                    model.addAttribute("msg", "用户名或身份证号不符");
                    return "password";
                }
            }
            else if(teacher != null){
                TeacherInfo teacherInfo = teacherInfoService.selectTeacherInfoByUsername(username);
                if(teacherInfo.getTeacher_id_number().equals(id_number)){
                    teacher.setPassword(password);
                    teacherService.UpdateTeacherInfo(teacher);
                    return "login";
                }
                else{
                    model.addAttribute("msg", "用户名或身份证号不符");
                    return "password";
                }
            }
            model.addAttribute("msg", "用户名或身份证号不符");
            return "password";
        }
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request,Model model){
        System.out.println("开始进行登出处理!");
        HttpSession session = request.getSession();
        session.removeAttribute("loginInfo");
        String info = (String) session.getAttribute("loginInfo");
        if(info == null){
            session.invalidate();
            model.addAttribute("msg","退出成功！");
            return "forward:login";
        }
        else{
            model.addAttribute("msg","退出失败，请联系管理员进行处理！");
            return "fail";
        }
    }
}
