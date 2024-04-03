package School.Entity;

import java.sql.*;
import java.util.Scanner;

public class DeleteOperation {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement = conn.prepareStatement("Delete from emp_master where student_roll_number=?");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student roll number whose details you want to Delete : ");
            int stuRollNo = sc.nextInt();

            preparedStatement.setInt(1, stuRollNo);
            int rowUpdated = preparedStatement.executeUpdate();
            System.out.println("Row updated : "+rowUpdated);
            
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Some problem with SQL..."+e);
        } finally{
            System.out.println("Finally block bound to run regardless any exception...");
        }
            
            
    }
}
