package com.udemyspring.learnspringudemy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration ;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Siya-Ram";
    }

    @Bean
    public int age(){
        return 25;
    }

}
