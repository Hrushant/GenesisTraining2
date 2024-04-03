import java.sql.*;
import java.util.Scanner;

public class jdbcDelete {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");

            PreparedStatement preparedStatement = conn.prepareStatement("Delete from mydept3 where deptno=?");
            System.out.println("Prepared statement is created...");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the department number which you wants to delete = ");
            int deptNo = sc.nextInt();

            preparedStatement.setInt(1, deptNo);
            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();
        } catch (SQLException s) {
            System.out.println("Some problem in sql statement...");
        } finally {
            System.out.println("Finally is run...");
        }
    }
}
