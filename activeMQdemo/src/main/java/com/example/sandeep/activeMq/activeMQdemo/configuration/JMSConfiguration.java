package com.example.sandeep.activeMq.activeMQdemo.configuration;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
//import org.springframework.messaging.converter.MessageConverter;

import javax.jms.ConnectionFactory;

@Configuration
@ComponentScan(basePackages = "com.example.sandeep.activeMq.activeMQdemo")
public class JMSConfiguration {

    @Bean
    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory containerFactory, DefaultJmsListenerContainerFactoryConfigurer
                                                     configurer){
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();

        //
        configurer.configure(factory,containerFactory);

        return factory;
    }

    @Bean
    public MessageConverter JacksonMessageConverter()
    {
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setTargetType(MessageType.TEXT);
        messageConverter.setTypeIdPropertyName("_type");

        return messageConverter;

    }
}
