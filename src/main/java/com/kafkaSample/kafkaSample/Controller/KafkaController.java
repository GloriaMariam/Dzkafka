package com.kafkaSample.kafkaSample.Controller;

import com.kafkaSample.kafkaSample.Service.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    private final Producer producer;

    public KafkaController(final Producer producerParam) {
        this.producer = producerParam;
    }

    @PostMapping(value = "/post")
    private void sendMessage(@RequestParam(value = "message") final String message){
        producer.publishToTopic();
    }
}
