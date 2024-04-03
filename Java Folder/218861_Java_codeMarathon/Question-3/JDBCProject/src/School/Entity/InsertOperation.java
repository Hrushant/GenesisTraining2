package School.Entity;

import java.sql.*;
import java.util.Scanner;

public class InsertOperation {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement = conn.prepareStatement("Insert into emp_master values (?,?,?,?,?)");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Student roll number : ");
            int rollNo = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter Student name : ");
            String StuName = sc2.nextLine();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter Student birth date : ");
            String stuBirthDate = sc3.nextLine();
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Enter Student stream : ");
            String stuStream = sc4.nextLine();
            Scanner sc5 = new Scanner(System.in);
            System.out.println("Enter Student marks : ");
            double stumarks = sc5.nextInt();

            preparedStatement.setInt(1, rollNo);
            preparedStatement.setString(2, StuName);
            preparedStatement.setString(3, stuBirthDate);
            preparedStatement.setString(4, stuStream);
            preparedStatement.setDouble(5, stumarks);

            int rowUpdated = preparedStatement.executeUpdate();
            System.out.println("row updated " + rowUpdated);

            preparedStatement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Some problem with SQL..." + e);
        } finally {
            System.out.println("Finally block bound to run regardless any exception...");
        }
    }
}
