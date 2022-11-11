package com.kafkaSample.kafkaSample.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {

    public static final String topic = "myTopic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Scheduled(fixedDelay = 6000)
    public void publishToTopic() {
        String message = "Hi This is my first kafka application";
       log.info("published to topic : ",topic);
        this.kafkaTemplate.send(topic, message);
    }
}