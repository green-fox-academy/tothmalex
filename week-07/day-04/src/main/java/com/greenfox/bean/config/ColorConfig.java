package com.greenfox.bean.config;

import com.greenfox.bean.color.BlueColor;
import com.greenfox.bean.color.MyColor;
import com.greenfox.bean.color.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public MyColor myColor() {
        return new RedColor();
    }

    @Bean
    public MyColor myColor2() {
        return new BlueColor();
    }
}