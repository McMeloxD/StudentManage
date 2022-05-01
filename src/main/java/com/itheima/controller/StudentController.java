package com.itheima.controller;

import com.itheima.service.StudentService;
import com.itheima.entity.Student;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
/*
* StudentController控制层类
* */
//使用Controller注解将StudentController类标识为Spring中的bean
@Controller
public class StudentController {
    //使用@Resource注解注入StudentService
    @Resource(name = "studentService")
    private StudentService studentService;
    public void save(Student student) {
        this.studentService.save(student);
    }

    public void delete(int sid) {
        this.studentService.delete(sid);
    }


    public void edit(Student student) {
        this.studentService.edit(student);
    }

    public Student selectBySid(int sid) {
        return this.studentService.selectBySid(sid);
    }
}
