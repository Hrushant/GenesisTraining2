package com.hrushant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.AmazonSNSException;
import com.amazonaws.services.sns.model.PublishRequest;

public class App {
    private static final String URL = "jdbc:mysql://database-hrush.cn6qkoww88oi.ap-northeast-1.rds.amazonaws.com/bills";
    private static final String user = "admin";
    private static final String password = "Password!123";

    public static void main(String[] args) {
        AmazonSNS sns = AmazonSNSClient.builder().withCredentials(new ProfileCredentialsProvider())
                .withRegion("ap-northeast-1").build();
        String line = "arn:aws:sns:ap-northeast-1:106129732153:bill-alerts-hrush";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection con = DriverManager.getConnection(URL, user, password);
            Statement statement = (Statement) con.createStatement();
            ResultSet rSet = statement.executeQuery("select * from utility_bills");
            while (rSet.next()) {
                PublishRequest publishRequest = new PublishRequest().withTargetArn(line)
                        .withMessage("Hi, Your bill for month" + rSet.getString(1) + "is due. Please pay Rs"
                                + rSet.getInt(3) + "in 15 days.\t" + rSet.getString(2));
                sns.publish(publishRequest);
            }

            System.out.println("Published...");
        } catch (SQLException e) {
            System.out.println(e);
        } catch (AmazonSNSException ex) {
            System.out.println(ex);
        }
    }
}
