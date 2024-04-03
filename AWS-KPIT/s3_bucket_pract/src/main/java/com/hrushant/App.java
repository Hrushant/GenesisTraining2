package com.hrushant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

public class App {
    public static void main(String[] args) {
        AmazonS3 s3 = AmazonS3Client.builder().withCredentials(new ProfileCredentialsProvider())
                .withRegion("ap-northeast-1").build();
        List<Bucket> buckets = s3.listBuckets();
        for (Bucket b : buckets) {
            System.out.println(b.getName());
        }
        // Scanner sc = new Scanner(System.in);
        // s3.createBucket("buckethrush");
        // System.out.println("Enter the message : ");
        // String line = sc.nextLine();
        // String line2 = sc.nextLine();
        // String line3 = sc.nextLine();
        // s3.putObject("hrushant-reports", "jan.txt", line);
        // s3.putObject("hrushant-reports", "feb.txt", line2);
        // s3.putObject("hrushant-reports", "mar.txt", line3);

        // for Download --->
        String contents = s3.getObjectAsString("hrushant-reports", "jan.txt");
        try {
            FileWriter out = new FileWriter(new File("C:\\files\\jan.txt"));
            out.write(contents);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
