package com.cn.zj.controller;

import com.cn.zj.entity.Student;
import com.cn.zj.service.impl.StudentServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2021/1/6 15:41
 */
@Controller
public class SpringMVCTest {

    private StudentServiceImpl studentService;

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/test")
    public String test(Map<String, String> map) {
        System.out.println("springmvc配置成功");
        map.put("msg", "哈哈");
        return "success";
    }

    @RequestMapping("/test2")
    public String test2(Map<String, String> map) {
        System.out.println(studentService.selectByPrimaryKey(1).toString());
        map.put("msg", "哈哈");
        return "success";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public Student test3(Map<String, String> map) {
        System.out.println("springmvc配置成功");
        return studentService.selectByPrimaryKey(1);
    }

    @RequestMapping("/test4")

    public Student test4() {

        UsernamePasswordToken token = new UsernamePasswordToken("abc", "123");
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);


        return studentService.selectByPrimaryKey(1);
    }
}
