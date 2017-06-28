package com.durga.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserServiceApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
