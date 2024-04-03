package School.Entity;

import java.sql.*;
import java.util.Scanner;

public class SelectOperation {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            Statement Statement = conn.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student roll number whose details you want to display : ");
            int stuRollNo = sc.nextInt();

            ResultSet resultSet = Statement
                    .executeQuery("Select * from emp_master where student_roll_number = " + stuRollNo);
            while (resultSet.next()) {
                System.out.println("Student roll number : " + resultSet.getInt(1));
                System.out.println("Student name : " + resultSet.getString(2));
                System.out.println("Student birth date : " + resultSet.getString(3));
                System.out.println("Student stream : " + resultSet.getString(4));
                System.out.println("Student marks : " + resultSet.getInt(5));
            }

            resultSet.close();
            Statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Some problem with SQL..." + e);
        } finally {
            System.out.println("Finally block bound to run regardless any exception...");
        }

    }

}