package com.kafka.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSampleApplication.class, args);
	}

}
