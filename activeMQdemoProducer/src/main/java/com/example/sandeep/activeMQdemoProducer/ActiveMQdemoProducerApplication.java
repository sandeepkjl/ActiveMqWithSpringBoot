package com.example.sandeep.activeMQdemoProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveMQdemoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMQdemoProducerApplication.class, args);
	}

}
