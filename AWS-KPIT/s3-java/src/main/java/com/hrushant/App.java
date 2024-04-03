package com.hrushant;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Scanner;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

public class App {
    public static void main(String[] args) {
         AmazonS3 s3 = AmazonS3Client.builder().withCredentials(new ProfileCredentialsProvider()).build();

        // // s3.listBuckets().forEach(b -> System.out.println(b.getName()));

        // List<Bucket> buckets = s3.listBuckets();
        // for (Bucket b : buckets) {
        //     System.out.println(b.getName());
        // }

        Scanner sc = new Scanner(System.in);

        s3.createBucket("myfiles883010");
        System.out.println("Enter the message : ");
        String line = sc.nextLine();
        s3.putObject("myfiles883010", "message.txt", line);
    }
}
