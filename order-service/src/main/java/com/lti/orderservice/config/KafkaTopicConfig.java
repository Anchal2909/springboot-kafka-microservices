package com.lti.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    /**
     * fetching topic name from configuration file-application.properties
     */
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    /**
     * configure topic using spring bean-it will create an instance of new topic
     */
    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name(topicName)
                .build();

//        return TopicBuilder.name(topicName)
//                .partitions(3)
//                .build();
    }
}
