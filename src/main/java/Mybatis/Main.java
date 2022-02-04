package Mybatis;

import Mybatis.entity.Student;
import Mybatis.mapper.StudentMapper;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        // 用了个 工厂来生产 SqlSession
        // 使用 try-with-resource，确保 SqlSession 每次都能执行关闭操作
        try (SqlSession sqlSession = MyBatisUtil.getSession(true)) {
            // 获取 StudentMapper 对象
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            // 应用逻辑代码


            // 条件查询
//            System.out.println(studentMapper.getStudentBySid(1));

            // 插入语句
//            System.out.println(studentMapper.addStudent(new Student().setName("大红").setSex("女")));

            // 删除
//            System.out.println(studentMapper.delStudent(7));


//            // 修改 传入全部参数
//            Student student = new Student().setSex("男").setName("大大大大刚").setSid(8);
//            System.out.println(studentMapper.updateStudent(student));
//            System.out.println(studentMapper.selectStudentAll());
//
//            Student student2 = new Student().setSex("女").setName("大红").setSid(8);
//            System.out.println(studentMapper.updateStudent(student2));
//            System.out.println(studentMapper.selectStudentAll());

//            // 修改 动态传入参数
//            Student student4 = new Student().setSid(3).setName("大白");
//            System.out.println(studentMapper.updateStudentDynamic(student4));

//            // 批量删除
//            int[] ids = new int[]{11, 12};
//            System.out.println(studentMapper.delStudents(ids));

//            System.out.println(studentMapper.addStudent(new Student().setName("小聪明").setSex("男")));


//            // 插入数据 返回插入数据在数据库中的主键
//            Student student3 = new Student().setName("哈哈哈哈").setSex("男");
//            System.out.println(studentMapper.addStudent(student3));
//
//            System.out.println(student3.getSid());

/*
            // 查询所有字段
            for (Student student : studentMapper.selectStudentAll()) {
                System.out.println(student);
            }

            // 查询老师教的所有学生
            System.out.println(studentMapper.getTeacherByTid(1));
            System.out.println(studentMapper.getTeacherByTid(2));

            // 多对一查询 从所有学生中查询被某个老师教的学生
            System.out.println(studentMapper.selectStudentByTeacherID(1));

            String name = "红";
//            name = "%"+name+"%";
            String newname = "";
            String sex = "女";

            Student teststudent = new Student().setName(newname).setSex(sex).setSid(0);

            Map teststudentmap = new HashMap();
            teststudentmap.put("sid", 0);
            teststudentmap.put("name", newname);
            teststudentmap.put("sex", sex);


//            System.out.println(studentMapper.selectStudentByCondition(0, newname, sex));
            System.out.println(studentMapper.selectStudentByCondition(teststudentmap));

            Map newstudentmap = new HashMap();
            String namemh = "%" + "大" + "%";
            newstudentmap.put("sid", null);
            newstudentmap.put("name", namemh);
            newstudentmap.put("sex", "女");

            System.out.println(studentMapper.selectStudentByConditisonDynamic(newstudentmap));

            Student s = new Student().setSid(2);
            System.out.println(studentMapper.selectStudentByConditisonSingle(s));
*/
            String name = "红";
//            name = "%"+name+"%";
            String newname = "";
            String sex = "男";
            System.out.println(studentMapper.selectStudentByCondition(0, newname, sex));
        }
    }
}
