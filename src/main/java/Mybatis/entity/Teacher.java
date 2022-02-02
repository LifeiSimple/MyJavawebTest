package Mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int tid;
    private String name;
    private String sex;
    List<Student> studentList;
    /*
    SELECT
        teacher.NAME AS '老师名字',
        teacher.sex AS '老师性别',
        student.NAME AS '学生名字',
        student.sex AS '学生性别'
    FROM
        teach,
        teacher,
        student
    WHERE
        teach.tid = teacher.tid
        AND teach.sid = student.sid
     */
}
