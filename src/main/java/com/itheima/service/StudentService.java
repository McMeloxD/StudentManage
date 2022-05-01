package com.itheima.service;

import com.itheima.entity.Student;
/*
* StudentService业务层接口
* */
public interface StudentService {

    public void save(Student student);
    public void delete(int sid);
    public void edit(Student student);
    public Student selectBySid(int sid);
}
