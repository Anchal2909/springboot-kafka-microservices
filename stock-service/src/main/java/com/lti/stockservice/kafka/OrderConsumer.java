package com.lti.stockservice.kafka;

import com.lti.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event)
    {
        //LOGGER.info(String.format("Order event received in stock service => %s" , event.toString()));
        LOGGER.info("Order event received in stock service:{}",event);
        //can perform any action - save the order event data into the order database
    }
}
