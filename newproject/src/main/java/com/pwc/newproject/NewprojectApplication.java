package com.pwc.newproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan
public class NewprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewprojectApplication.class, args);
	}

}
