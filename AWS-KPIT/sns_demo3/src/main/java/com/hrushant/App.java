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
        CreateTopicRequest createTopicRequest = new CreateTopicRequest().withName("hrush_topic");
        CreateTopicResult createTopicResult = sns.createTopic(createTopicRequest);

        String arn = createTopicResult.getTopicArn();

        // SubscribeRequest subscribeRequest = new SubscribeRequest().withTopicArn(arn).withProtocol("email").withEndpoint("hrushant.raghwarte@kpit.com");
        // SubscribeResult subscribeResult = sns.subscribe(subscribeRequest);

        PublishRequest publishRequest = new PublishRequest().withTopicArn(arn).withMessage("Hello Hrushant");
        sns.publish(publishRequest);

    }
}
