package jdbc;

import java.sql.*;

public class DMLAndDDL {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb",
                "root",
                "MySQL09054510WjX");
            Statement statement = connection.createStatement()) {

            String myquery = "insert into student values(6,'小花','女')";
//            int i;
//            i = statement.executeUpdate(myquery);
            statement.execute(myquery);
            ResultSet resultSet = statement.getResultSet();
            int updateCount = statement.getUpdateCount();
//            System.out.println(i);
            System.out.println(updateCount);
            System.out.println(resultSet);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
