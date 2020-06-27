package com.example.sandeep.activeMQdemoConsumer.reciever;

import com.example.sandeep.activeMQdemoConsumer.model.Customer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {

    private static final String MESSAGE_QUEUE="message_queue";

    @JmsListener(destination = MESSAGE_QUEUE)
    public void recieveMessage(String customerName){

        System.out.println("recieving Message");
        System.out.println("Customer Name:- "+customerName);
        System.out.println("Message Recieved");


    }

}
