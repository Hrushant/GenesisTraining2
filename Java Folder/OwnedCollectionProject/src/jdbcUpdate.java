import java.sql.*;
import java.util.Scanner;

public class jdbcUpdate {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");

            PreparedStatement preparedStatement = conn
                    .prepareStatement("Update mydept3 set dname=?,loc=? where deptno = ?");

            System.out.println("Prepared statement is created...");

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);

            System.out.println("Enter exixting department number = ");
            int deptNo = sc1.nextInt();
            System.out.println("Enter new department name = ");
            String newDeptName = sc2.nextLine();
            System.out.println("Enter new department Location = ");
            String newDeptLoc = sc3.nextLine();

            preparedStatement.setString(1, newDeptName);
            preparedStatement.setString(2, newDeptLoc);
            preparedStatement.setInt(3, deptNo);

            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
            ;
            conn.close();
        } catch (SQLException s) {
            System.out.println("Some problem in sql statement..." + s);
        } finally {
            System.out.println("Finally is run...");
        }
    }
}
