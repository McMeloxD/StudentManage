package com.itheima.dao;

import com.itheima.entity.Student;
/*
* StudentDao数据访问层接口
* */
public interface StudentDao {
    public void save(Student student);
    public void delete(int sid);
    public void edit(Student student);
    public Student selectBySid(int sid);
}
