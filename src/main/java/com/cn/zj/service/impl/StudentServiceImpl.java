package com.cn.zj.service.impl;

import com.cn.zj.entity.Student;
import com.cn.zj.mapper.StudentDao;
import com.cn.zj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2021/1/6 16:05
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student selectByPrimaryKey(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }
}
