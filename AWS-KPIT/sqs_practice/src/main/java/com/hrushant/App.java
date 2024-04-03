package com.hrushant;

import java.util.List;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.CreateQueueRequest;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.DeleteQueueResult;
import com.amazonaws.services.sqs.model.ListQueuesResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AmazonSQS sqs = AmazonSQSClient.builder().withRegion("ap-northeast-1").build();

        // listing all the queues
        ListQueuesResult listQueuesResult = sqs.listQueues();
        List<String> queue = listQueuesResult.getQueueUrls();

        for (String q : queue) {
            System.out.println("Queue url : " + q);
        }

        // creating new queue
        CreateQueueResult cResult = sqs.createQueue("myqueuehr");
        System.out.println("Queue : "+cResult.getQueueUrl());

        //send msg
        SendMessageRequest sMessage = new SendMessageRequest("https://sqs.ap-northeast-1.amazonaws.com/106129732153/myqueuehr","Hello New Hrushhh");
        SendMessageResult sendMessageResult = sqs.sendMessage(sMessage);
        System.out.println("Msg with Id : "+sendMessageResult.getMessageId());

        // Receive message
        ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest("https://sqs.ap-northeast-1.amazonaws.com/106129732153/myqueuehr");
        ReceiveMessageResult receiveMessageResult = sqs.receiveMessage(receiveMessageRequest);
        List<Message> lMessages = receiveMessageResult.getMessages();
        for (Message m : lMessages) {
            System.out.println("Received message : " + m.getBody());
            // Delete Messagae
            String rcpHnadle = m.getReceiptHandle();
            DeleteMessageRequest deleteMessageRequest = new DeleteMessageRequest(
                    "https://sqs.ap-northeast-1.amazonaws.com/106129732153/myqueuehr", rcpHnadle);
            sqs.deleteMessage(deleteMessageRequest);
        }

        //deletion of queue
        sqs.deleteQueue("hrushqueue");
    }
}
