package com.hrushant;

import java.sql.*;

public class App {
    private static final String url = "jdbc:mysql://datahrushant.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/hrush";
    private static final String user = "admin";
    private static final String password = "Password!123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            // method to read records from db
            // readDatabase(conn);

            // method to insert into db
            // insertIntoDatabase(conn);

            // method to update
            // updateIntoDatabase(conn);

            // method to delete
            // deleteIntoDatabase(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // code to read
    public static void readDatabase(Connection conn) {
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from emp");
            while (resultSet.next()) {
                System.out.println("name:" + resultSet.getString(1));
                System.out.println("age:" + resultSet.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // code for insert
    public static void insertIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("insert into emp values (?,?)");
        statement.setString(1, "avani");
        statement.setInt(2, 99);
        int rowsInserted = statement.executeUpdate();
        System.out.println(rowsInserted);
        readDatabase(conn);
    }

    // code for update
    public static void updateIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("update emp set age=? where firstname=?");
        statement.setInt(1, 1000);
        statement.setString(2, "avani");
        int rowsUpdated = statement.executeUpdate();
        System.out.println(rowsUpdated);
        readDatabase(conn);
    }

    // code to delete
    public static void deleteIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("delete from emp where firstname=?");
        statement.setString(1, "avani");
        int rowDeleted = statement.executeUpdate();
        System.out.println(rowDeleted);
    }
}
