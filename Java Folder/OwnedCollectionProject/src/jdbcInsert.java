import java.sql.*;
import java.util.*;

class jdbcinsert {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");

            PreparedStatement preparedStatement = conn.prepareStatement("Insert into mydept3 values (?,?,?)");
            System.out.println("PreparedStatement is created...");

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter new department number ");
            int newDeptNo = sc1.nextInt();
            System.out.println("Enter new department name ");
            String newDeptName = sc2.next();
            System.out.println("Enter new location ");
            String newDeptLoc = sc3.nextLine();

            preparedStatement.setInt(1, newDeptNo);
            preparedStatement.setString(2, newDeptName);
            preparedStatement.setString(3, newDeptLoc);

            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();
        } catch (SQLException s) {
            System.out.println("There is some problem in sql statement " + s);
        } finally {
            System.out.println("Finally is run...");
        }
    }
}