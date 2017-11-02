package com.greenfox.bean.config;

import com.greenfox.bean.model.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}