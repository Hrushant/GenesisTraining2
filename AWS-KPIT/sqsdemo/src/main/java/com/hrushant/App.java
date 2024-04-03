package com.hrushant;

import java.util.List;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AmazonSQS sqs = AmazonSQSClient.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("eu-west-3").build();
        String queueUrl = "https://sqs.eu-west-3.amazonaws.com/106129732153/hrushant";

        // SendMessageBatchRequest sRequest = new SendMessageBatchRequest().withQueueUrl(queueUrl).withMessageBody();

        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();
        for(Message m : messages){
            System.out.println("Message : "+m.getBody());
            System.out.println("Attributes : "+m.getAttributes());
            System.out.println("Delete from the queue : ");
            String handle = m.getReceiptHandle();
            sqs.deleteMessage(queueUrl,handle);
        }
    }
}
