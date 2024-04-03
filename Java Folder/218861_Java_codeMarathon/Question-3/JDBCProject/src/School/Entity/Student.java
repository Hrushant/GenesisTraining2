package School.Entity;

import java.sql.*;

public class Student {
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("Select * from emp_master");
        while (resultSet.next()) {
            System.out.println("Student roll number : " + resultSet.getInt(1));
            System.out.println("Student name : " + resultSet.getString(2));
            System.out.println("Student birth date : " + resultSet.getString(3));
            System.out.println("Student stream : " + resultSet.getString(4));
            System.out.println("Student marks : " + resultSet.getInt(5));
            System.out.println("-------------------------------------------------------------");
        }

        resultSet.close();
        statement.close();
        conn.close();
    }
}
