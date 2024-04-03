package com.hrushant;

import java.util.Scanner;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AmazonSQS sqs = AmazonSQSClient.builder().withCredentials(new ProfileCredentialsProvider())
                .withRegion("ap-northeast-1").build();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source address : ");
        String source = sc.nextLine();
        System.out.println("Enter Destination address : ");
        String destination = sc.nextLine();

        //For Sending message to queue -->
        SendMessageRequest sendMessageRequest = new SendMessageRequest()
                .withQueueUrl("https://sqs.ap-northeast-1.amazonaws.com/106129732153/ride_request_hrushant")
                .withMessageBody("Book a ride from " + source + " and " + destination);
        SendMessageResult sendMessageResult = sqs.sendMessage(sendMessageRequest);
        System.out.println("Message sent to queue");
    }
}
