package com.hrushant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AmazonS3 s3 = AmazonS3Client.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("ap-northeast-1").build();
        List<Bucket> bList = s3.listBuckets();
        for (Bucket b : bList) {
            System.out.println(b.getName());
        }
        // s3.createBucket("mybuckhrush");
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the message : ");
        // String line = sc.nextLine();
        // String line2=sc.nextLine();
        // s3.putObject("mybuckhrush", "jan.txt", line);
        // s3.putObject("mybuckhrush", "feb.txt", line);
        // System.out.println("operation done...");

        // download -->
       
        String content = s3.getObjectAsString("mybuck", "jan.txt");
        try {
            FileWriter out = new FileWriter(new File("C:\\files\\jan.txt"));
            out.write(content);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        



    }
}
