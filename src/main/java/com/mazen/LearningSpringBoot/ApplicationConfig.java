package com.mazen.LearningSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("Bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("first bean");
    }

    @Bean
    @Qualifier("Bean2")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second bean");
    }
}
