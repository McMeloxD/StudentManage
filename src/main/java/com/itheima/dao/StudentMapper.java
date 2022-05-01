package com.itheima.dao;
import com.itheima.entity.Student;
import org.apache.ibatis.annotations.*;
/*
* 注解映射接口
* */
public interface StudentMapper {
    @Select("select * from student where sid=#{sid}")
    Student selectStudent(int sid);
    @Insert("insert into student(sid,name,age)"+"values(#{sid},#{name},#{age})")
    int insertStudent(Student student);
    @Delete("delete from student where sid = #{sid}")
    int deleteStudent(int sid);
    @Update("update student set name=#{name},age=#{age} "
            +"where sid=#{sid}")
    int updateStudent(Student student);
}
