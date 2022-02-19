package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Sabirov Jahongir
 **/
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.persistence"})
@EntityScan(basePackages = {"com.example.domain"})
@ComponentScan(basePackages = {"com.example.persistence"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
