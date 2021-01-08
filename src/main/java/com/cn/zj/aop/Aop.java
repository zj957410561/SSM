package com.cn.zj.aop;


import com.cn.zj.entity.Student;
import com.cn.zj.mapper.StudentDao;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2020/12/31 15:00
 */
@Aspect
@Component
public class Aop {
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //-- 前置
    @Before(value = "execution(public * com.cn.zj.mapper.*.*(..))")
    public void before() throws Exception {
        System.out.println("切面启动了");
        System.out.println("切面启动了");
    }
}

