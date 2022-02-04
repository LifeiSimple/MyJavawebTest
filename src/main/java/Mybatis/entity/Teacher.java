package Mybatis.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int tid;
    private String name;
    private String sex;
    List<Student> studentList;

}
