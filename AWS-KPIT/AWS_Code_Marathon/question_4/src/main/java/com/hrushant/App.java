package com.hrushant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AmazonS3 s3 = AmazonS3Client.builder().withCredentials(new ProfileCredentialsProvider())
                .withRegion("ap-northeast-1").build();
        String contents = s3.getObjectAsString("driver-ids-hrushant", "cab-driver's photograph.jpeg");

        FileWriter out;
        try {
            out = new FileWriter(new File("C://files/cab-driver's photograph.jpeg"));
            out.write(contents);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Drivers-ids downloaded..");
    }
}
