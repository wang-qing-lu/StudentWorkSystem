package com.firstproject.springbootdemo.Controller;

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

@Controller
@MapperScan("com.firstproject.springbootdemo.dao")
@ComponentScan("com.firstproject.springbootdemo.service")
public class UserInfoController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private studentInfoService studentInfoService;

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
            studentInfo info = new studentInfo();
            info.setUsername(username);
            info.setId_number(id_number);
            studentInfo studentInfo = studentInfoService.getINfoByUsernameAndId(info);
            if (studentInfo != null) {
                System.out.println(studentInfo.toString());
                Student student = studentService.getUserByUsername(username);
                student.setPassword(password);
                studentService.update(student);
                return "login";
            }
            else{
                model.addAttribute("msg","用户名或身份证号不符");
                return "password";
            }
        }
    }
}
