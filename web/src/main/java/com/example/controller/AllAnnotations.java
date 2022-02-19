package com.example.controller;

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
public @interface AllAnnotations {
}
