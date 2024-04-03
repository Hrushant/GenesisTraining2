package com.hrushant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String URL = "jdbc:mysql://database-hrush-1.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/bills";
    private static final String user = "admin";
    private static final String password = "Password!123";
    public static void main( String[] args )
    {
        AmazonSNS sns = AmazonSNSClient.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("ap-northeast-1").build();
        String arn = "arn:aws:sns:ap-northeast-1:106129732153:bill-alerts-hrushant";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection(URL, user, password);
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from utility");
            while (resultSet.next()) {
                PublishRequest pRequest = new PublishRequest().withTargetArn(arn).withMessage("Hi,\r\n" + //
                        "You bill for month 800000 is due. Please pay Rs <AMT-FROM-DB> in 15 days.\t");
                        sns.publish(pRequest);
            }
            System.out.println("publish...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
