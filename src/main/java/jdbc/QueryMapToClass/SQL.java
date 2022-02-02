package jdbc.QueryMapToClass;

import java.sql.*;
import java.util.Scanner;

public class SQL {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb",
                "root",
                "MySQL09054510WjX");
             PreparedStatement statement = connection.prepareStatement("select * from student where sex=?");
             Scanner scanner = new Scanner(System.in)) {

            String sex = scanner.nextLine();

            statement.setString(1, sex);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3));
                student.say();
            }
            System.out.println(statement.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
