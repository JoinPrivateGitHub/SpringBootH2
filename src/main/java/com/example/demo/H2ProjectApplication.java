package com.example.demo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories
public class H2ProjectApplication {
	
	@Autowired
	EntityManager emEntityManager;

	public static void main(String[] args) {
		SpringApplication.run(H2ProjectApplication.class, args);
		
		
	}
}
