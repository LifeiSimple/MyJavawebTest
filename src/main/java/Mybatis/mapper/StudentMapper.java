package Mybatis.mapper;

import Mybatis.entity.Student;
import Mybatis.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> selectStudentAll();

    Student getStudentBySid(int sid);

    int addStudent(Student student);

    // 删除一个
    int delStudent(int sid);

    // 批量删除
    int delStudents(int[] ints);

    // 修改全部字段
    int updateStudent(Student student);


    // 一对多查询 查询某个老师所教的所有学生
    Teacher getTeacherByTid(int tid);

    // 多对一查询 从所有学生中查询被某个老师教的学生
    List<Student> selectStudentByTeacherID(int tid);

    // 根据条件查询学生信息
    List<Student> selectStudentByCondition(int sid,
                                           String name,
                                           String sex);
//    List<Student> selectStudentByCondition(Student student);
//    List<Student> selectStudentByCondition(Map map);

    // 动态查询
    List<Student> selectStudentByConditisonDynamic(Map map);

    // 单条件查询
    List<Student> selectStudentByConditisonSingle(Student student);

    // 动态修改
    int updateStudentDynamic(Student student);


}
