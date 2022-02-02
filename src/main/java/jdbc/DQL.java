package jdbc;

import java.sql.*;

public class DQL {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb",
                "root",
                "MySQL09054510WjX");
            Statement statement = connection.createStatement()) {

            String myquery = "select * from student where sex='男'";
            ResultSet resultSet = statement.executeQuery(myquery);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
