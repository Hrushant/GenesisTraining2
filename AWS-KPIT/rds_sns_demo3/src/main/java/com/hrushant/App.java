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
import com.mysql.cj.jdbc.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String URL = "jdbc:mysql://hrushdb.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/hdr";
    private static final String user = "admin";
    private static final String password = "Password!123";
    public static void main( String[] args )
    {
        AmazonSNS sns = AmazonSNSClient.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("ap-northeast-1").build();
        String arn = "arn:aws:sns:ap-northeast-1:106129732153:hrush_topic";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(URL, user, password);
            Statement statement = con.createStatement();
            ResultSet rSet = statement.executeQuery("Select * from emp");
            while (rSet.next()) {
                PublishRequest pRequest = new PublishRequest().withTargetArn(arn).withMessage("Hello ,"+rSet.getString(2)+"with id "+rSet.getInt(1));
                sns.publish(pRequest);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
