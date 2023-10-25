package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {

    // With the below bean, the /actuator/info endpoint will not return dates in a friendly format
//    @Bean
//    ObjectMapper myObjectMapper() {
//        return new ObjectMapper().registerModules(new JavaTimeModule());
//    }
}
