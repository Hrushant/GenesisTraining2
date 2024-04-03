package com.hrushant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClient;

/**
 * Hello world!
 *
 */
public class App {
    private static final String URL = "jdbc:mysql://kubercabsdatabasehrushant.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/kuber_Cabs_Db";
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
        Connection con;
        try {
            con = DriverManager.getConnection(URL, user, password);
            try {

                Statement statement = con.createStatement();
                ResultSet rSet = statement.executeQuery("Select * from ride_details");
                while (rSet.next()) {
                    System.out.println("Ride no : " + rSet.getInt(1));
                    System.out.println("Driver's name : " + rSet.getString(2));
                    System.out.println("Customer's name : " + rSet.getString(3));
                    System.out.println("Passenger count : " + rSet.getInt(4));
                    System.out.println("-----------------------------------------------");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new ride number : ");
            int new_ride_no = sc.nextInt();
            System.out.println("Enter new driver's name : ");
            String new_driver_name = sc.next();
            System.out.println("Enter new customer's name : ");
            String new_customer_name = sc.next();
            System.out.println("Enter new pasenger : ");
            int new_passenger_count = sc.nextInt();

            try {
                PreparedStatement preparedStatement = con.prepareStatement("insert into ride_details values(?,?,?,?)");
                preparedStatement.setInt(1, new_ride_no);
                preparedStatement.setString(2, new_driver_name);
                preparedStatement.setString(3, new_customer_name);
                preparedStatement.setInt(4, new_passenger_count);
                int resultSet = preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
