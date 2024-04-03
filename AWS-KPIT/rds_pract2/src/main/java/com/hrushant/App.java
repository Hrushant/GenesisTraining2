package com.hrushant;

import java.sql.*;


/**
 * Hello world!
 *
 */
public class App 
{
    private static final String URL="jdbc:mysql://datahrushant.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/hrudb";
    private static final String user="admin";
    private static final String password="Password!123";
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con;
        try {
            con = DriverManager.getConnection(App.URL, App.user, App.password);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from emp");

        while (resultSet.next()) {
            System.out.println("FN : "+resultSet.getString(1));
            System.out.println("LN : "+resultSet.getString(2));
            System.out.println("AGE : "+resultSet.getInt(3));
            System.out.println("----------------------------------------");
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
