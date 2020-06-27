package com.example.sandeep.activeMq.activeMQdemo;

import com.example.sandeep.activeMq.activeMQdemo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class ActiveMQdemoApplication {

	private static final String MESSAGE_QUEUE="message_queue";


	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ActiveMQdemoApplication.class, args);

		JmsTemplate jmsTemaplate = context.getBean(JmsTemplate.class);

		System.out.println("sending customer Information");
		jmsTemaplate.convertAndSend(MESSAGE_QUEUE,new Customer(101,"sandeep","Pune"));




	}

}
