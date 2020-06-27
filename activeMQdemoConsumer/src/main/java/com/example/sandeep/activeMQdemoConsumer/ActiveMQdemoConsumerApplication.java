package com.example.sandeep.activeMQdemoConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveMQdemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQdemoConsumerApplication.class, args);
	}

}
