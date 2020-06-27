package com.example.sandeep.activeMQdemoProducer.controller;

import com.example.sandeep.activeMQdemoProducer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessgeController {

    private static final String MESSAGE_QUEUE="message_queue";

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/sendMessage")
    public void senMessage(@RequestBody Customer customer){

        System.out.println("sending message");

        jmsTemplate.convertAndSend(MESSAGE_QUEUE,"Hello"+customer.getCustName());

        System.out.println("Message Sent");

    }
}
