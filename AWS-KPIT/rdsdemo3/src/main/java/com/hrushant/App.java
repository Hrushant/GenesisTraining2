package com.hrushant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClient;

/**
 * Hello world!
 *
 */
public class App {
    private static final String url = "jdbc:mysql://hrushdb.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/hr";
    private static final String user = "admin";
    private static final String password = "Password!123";

    public static void main(String[] args) {
        AmazonRDS rds = AmazonRDSClient.builder().withCredentials(new ProfileCredentialsProvider())
                .withRegion("ap-northeast-1").build();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            readDatabase(conn);
            // insertIntoDatabase(conn);
            // updateIntoDatabase(conn);
            // deleteIntoDatabase(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void readDatabase(Connection conn) {
        try {
            Statement statement = conn.createStatement();
            ResultSet rSet = statement.executeQuery("Select * from emp");
            while (rSet.next()) {
                System.out.println("ID : " + rSet.getInt(1));
                System.out.println("Name : " + rSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // code for insert
    public static void insertIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("insert into emp values (?,?)");
        statement.setInt(1, 103);
        statement.setString(2, "avani");
        int rowsInserted = statement.executeUpdate();
        System.out.println("Inserted");
    }

    // code for update
    public static void updateIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("update emp set name=? where id=?");
        statement.setString(1, "avi");
        statement.setInt(2, 103);
        int rowsUpdated = statement.executeUpdate();
        System.out.println(rowsUpdated);
    }

    // code to delete
    public static void deleteIntoDatabase(Connection conn) throws SQLException {
        PreparedStatement statement = conn.prepareStatement("delete from emp where id=?");
        statement.setInt(1, 103);
        int rowDeleted = statement.executeUpdate();
        System.out.println(rowDeleted);
    }
}
