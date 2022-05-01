package com.itheima.service;

import com.itheima.dao.StudentDao;
import com.itheima.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/*
* StudentService业务层接口实现类
* */
//使用@Service注解将StudentServcieImpl类标识为Spring中的bean
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    //使用@Resource注解注入StudentDao
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    public void save(Student student) {
        this.studentDao.save(student);
    }

    public void delete(int sid) {
        this.studentDao.delete(sid);
    }


    public void edit(Student student) {
        this.studentDao.edit(student);
    }

    public Student selectBySid(int sid) {
        return this.studentDao.selectBySid(sid);
    }
}

