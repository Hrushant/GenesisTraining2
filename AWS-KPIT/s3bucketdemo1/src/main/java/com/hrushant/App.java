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
        // s3.createBucket("mybuckhrushant");
        List<Bucket> lBuckets = s3.listBuckets();
        for (Bucket b : lBuckets) {
            System.out.println("----"+b.getName());
        }

        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // s3.putObject("mybuckhrushant","jan.txt",line);


        String contents = s3.getObjectAsString("mybuckhrushant", "jan.txt");
        FileWriter out;
        try {
            out = new FileWriter(new File("C:/files/jan.txt"));
            out.write(contents);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        



    }
}
