package School.Entity;

import java.sql.*;
import java.util.Scanner;

public class UpdateOperation {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement = conn.prepareStatement("Update emp_master set student_name=?,student_stream=?,student_marks=? where student_roll_number=?");
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter Student roll number whose details you want to update : ");
            int rollNo = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter new Student name : ");
            String stuName = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter new Student stream : ");
            String stuStream = sc3.nextLine();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter new Student marks : ");
            double stumarks = sc4.nextInt();

            preparedStatement.setString(1, stuName);
            preparedStatement.setString(2, stuStream);
            preparedStatement.setDouble(3, stumarks);
            preparedStatement.setInt(4, rollNo);

            int rowUpdated = preparedStatement.executeUpdate();
            System.out.println("row updated "+rowUpdated);

            preparedStatement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Some problem with SQL..."+e);
        } finally{
            System.out.println("Finally block bound to run regardless any exception...");
        }
            
    }
}
