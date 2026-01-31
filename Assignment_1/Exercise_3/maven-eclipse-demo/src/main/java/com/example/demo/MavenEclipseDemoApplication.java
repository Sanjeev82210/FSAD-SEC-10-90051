package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenEclipseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenEclipseDemoApplication.class, args);
		System.out.println("Welcome to Maven using Eclipse IDE");
		WelcomeMessage.show();
	}
}
