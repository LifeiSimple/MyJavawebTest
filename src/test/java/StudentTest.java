import Mybatis.MyBatisUtil;
import Mybatis.mapper.StudentMapper;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StudentTest {
    @Test
    public void test() {
        try (SqlSession sqlSession = MyBatisUtil.getSession(true)) {
            // 获取 StudentMapper 对象
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            String name = "红";
//            name = "%"+name+"%";
            String newname = "";
            String sex = "男";
            System.out.println(studentMapper.selectStudentByCondition(0, newname, sex));
        }
    }
}