package com.web.springboot.demo;

import com.web.springboot.demo.entities.User;
import com.web.springboot.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.web.springboot.demo")
@Configuration
@EnableAutoConfiguration
public class SpringDemoApplication implements CommandLineRunner {

	@Autowired
	public Userservice userservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User createUser = userservice.createUser(new User(1,"test", "username"));
		System.out.println("User i krijuar eshte : " + createUser.getUsername());
	}


}
