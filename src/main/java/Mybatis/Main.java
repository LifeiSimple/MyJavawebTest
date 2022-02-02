package Mybatis;

import Mybatis.entity.Student;
import Mybatis.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

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


            // 修改
// todo            studentMapper.updateStudent(8, "大大红红");

            // 查询所有字段
            for (Student student : studentMapper.selectStudentAll()) {
                System.out.println(student);
            }

        }
    }
}
