package com.greenfox.bean.config;

import com.greenfox.bean.service.EmailService;
import com.greenfox.bean.service.MessageProceeder;
import com.greenfox.bean.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    MessageService messageService(){
        return new EmailService();
    }

    @Bean
    MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }
}