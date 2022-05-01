package com.itheima.dao;
import com.itheima.entity.Student;
import com.itheima.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
/*
* StudentDao数据访问层接口实现类
* */
//使用@Repository注解将StudentDaoImpl类标识为Spring中的bean
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    public void save(Student student) {
       try {
           //通过工具类获取SqlSession对象
            SqlSession session = MybatisUtils.getSession();
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            //使用StudentMapper对象插入学生信息
            int result = mapper.insertStudent(student);
            if (result>0){
            System.out.println("**************成功插入"+result+"条数据~~**************");
            }else {
            System.out.println("*************插入数据失败~~**************");
            }
            System.out.println(student.toString());
            session.commit();
           //关闭Sqlsession
            session.close();
    }catch (Exception e){
       e.printStackTrace();}
    }
    public void delete(int sid) {
        try {
            //通过工具类获取SqlSession对象
            SqlSession session = MybatisUtils.getSession();
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            //使用StudentMapper对象删除学生信息
            int result =mapper.deleteStudent(sid);
            if (result>0){
                System.out.println("**************成功删除"+result+"条数据~~**************");
            }else {
                System.out.println("*************删除数据失败~~**************");
            }
            session.commit();
            //关闭Sqlsession
            session.close();
        }catch (Exception e){
            e.printStackTrace();}
    }


    public void edit(Student student) {
        try{ //通过工具类获取SqlSession对象
            SqlSession session = MybatisUtils.getSession();
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            //使用StudentMapper对象更新id为x的学生信息
            int result =mapper.updateStudent(student);
            if (result>0){
                System.out.println("**************成功更新"+result+"条数据~~**************");
            }else {
                System.out.println("*************更新数据失败~~**************");
            }
            System.out.println(student.toString());
            session.commit();
            //关闭Sqlsession
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Student selectBySid(int sid) {
        try { //通过工具类获取SqlSession对象
            SqlSession session = MybatisUtils.getSession();
            StudentMapper mapper = session.getMapper(StudentMapper.class);
            //使用StudentMapper对象查询id为x的学生信息
            Student student1 = mapper.selectStudent(sid);
            System.out.println(student1.toString());
            //关闭Sqlsession
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
