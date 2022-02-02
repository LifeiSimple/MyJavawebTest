package jdbc.QueryMapToClass;

import java.sql.*;
import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb",
                "root",
                "MySQL09054510WjX");
             Statement statement = connection.createStatement();
             Scanner scanner = new Scanner(System.in)) {

            connection.setAutoCommit(false); //关闭自动提交，现在将变为我们手动提交

            statement.executeUpdate("");
            statement.executeUpdate("");
            statement.executeUpdate("");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
