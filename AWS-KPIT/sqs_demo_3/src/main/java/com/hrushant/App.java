package com.hrushant;

import java.util.List;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.ListQueuesResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AmazonSQS sqs = AmazonSQSClient.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("ap-northeast-1").build();
        ListQueuesResult listQueuesResult = sqs.listQueues();
        List<String> list = listQueuesResult.getQueueUrls();
        for (String s : list) {
            System.out.println("Queue URLS : "+s);
        }
      
        // CreateQueueResult createQueueRequest = sqs.createQueue("hrushantqueue");
        // System.out.println("created...");

        String queue = "https://sqs.ap-northeast-1.amazonaws.com/106129732153/hrushantqueue";
        
        // SendMessageRequest sendMessageRequest = new SendMessageRequest(queue, "Hello hrushant new queue");
        // SendMessageResult sendMessageResult = sqs.sendMessage(sendMessageRequest);
        // System.out.println("message sent...");

        // ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(queue);
        // ReceiveMessageResult receiveMessageResult = sqs.receiveMessage(receiveMessageRequest);
        // List<Message> list2 = receiveMessageResult.getMessages();
        // for (Message m : list2) {
        //     System.out.println("Received msg : "+m.getBody());
        //     String receiptHandle = m.getReceiptHandle();
        //     DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest(queue, receiptHandle);
        //     sqs.deleteMessage(deleteMessageRequest);
        // }
        // System.out.println("Message received...");

        sqs.deleteQueue("hrushantqueue");
    }
}
