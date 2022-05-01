package com.itheima;

import com.itheima.controller.StudentController;
import com.itheima.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
* 测试类
* */
public class StudentTest {
    @Test
    public void SaveStudentTest(){
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentcontroller =(StudentController) applicationContext.getBean("studentController");
        //插入学生数据
        Student student = new Student();
        student.setSid(20202004);
        student.setName("阿伟");
        student.setAge(16);
        studentcontroller.save(student);
    }
    @Test
    public void deleteStudentTest(){
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentcontroller =(StudentController) applicationContext.getBean("studentController");
        //删除学生数据
        studentcontroller.delete(20202001);
    }
    @Test
    public void UpdateStudentTest(){
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentcontroller =(StudentController) applicationContext.getBean("studentController");
        //更新学生数据
        Student student = new Student();
        student.setSid(20202002);
        student.setName("阿伟");
        student.setAge(16);
        studentcontroller.edit(student);
    }
    @Test
    public void SeletctStudentTest(){
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentcontroller =(StudentController) applicationContext.getBean("studentController");
        //查询学生数据

        studentcontroller.selectBySid(20202001);
    }
}

