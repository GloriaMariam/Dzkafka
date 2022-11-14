package com.kafka.sample.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {
    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeFromTopic(String message) {
        log.info("Consumed message {}", message);
    }

    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeFromTopics(String message) {
        log.info("SecondConsumed message {} ", message);
    }

    @KafkaListener(topics = "myTopic2", groupId = "myGroup")
    public void consumeFromTopic2(String message) {
        log.info("ThirdConsumed message {} ", message);
    }
}
