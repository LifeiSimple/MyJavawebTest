package Mybatis.mapper;

import Mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> selectStudentAll();
    Student getStudentBySid(int sid);
    int addStudent(Student student);
    int delStudent(int sid);
//    int updateStudent(int sid, String name);
}
