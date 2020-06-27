package com.example.sandeep.activeMq.activeMQdemo.reciever;

import com.example.sandeep.activeMq.activeMQdemo.model.Customer;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {

    private static final String MESSAGE_QUEUE="message_queue";

    @JmsListener(destination = MESSAGE_QUEUE)
    public void recieveMessage(Customer customer){

        System.out.println("Customer:- "+customer);


    }

}
