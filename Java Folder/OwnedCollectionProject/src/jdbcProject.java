
import java.sql.*;

class jdbcProject {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SElect * from mydept3");

            while (result.next()) {
                System.out.println("DEPTNO : " + result.getInt(1));
                System.out.println("DNAME : " + result.getString(2));
                System.out.println("LOC : " + result.getString(3));
                System.out.println("------------------------------------------");
            }

            result.close();
            statement.close();
            conn.close();
        } catch (SQLException s) {
            System.out.println("Problem in SQL Query " + s);
        } finally {
            System.out.println("Finally block is run...");
        }
    }
}