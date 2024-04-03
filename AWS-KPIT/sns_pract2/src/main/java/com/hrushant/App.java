package com.hrushant;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AmazonSNS sns = AmazonSNSClient.builder().withCredentials(new ProfileCredentialsProvider()).withRegion("ap-northeast-1").build();
        CreateTopicRequest cRequest = new CreateTopicRequest().withName("hrush_topic");
        CreateTopicResult cResult = sns.createTopic(cRequest);
        String arn = cResult.getTopicArn();

        SubscribeRequest subscribeRequest = new SubscribeRequest().withTopicArn(arn).withProtocol("email").withEndpoint("hraghwarte@gmail.com");
        SubscribeResult subscribeResult = sns.subscribe(subscribeRequest);

        PublishRequest pRequest = new PublishRequest().withTopicArn("arn:aws:sns:ap-northeast-1:106129732153:hrush_topic").withMessage("Hello publishedd...");
        sns.publish(pRequest);
        System.out.println("mess publish...");


    }
}
