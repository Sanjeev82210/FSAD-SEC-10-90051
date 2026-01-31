package com.example.mavendependencydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.StringUtils;

@SpringBootApplication
public class MavenDependencyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDependencyDemoApplication.class, args);

		String text = "  Maven Dependency Demo  ";

		System.out.println("Original: '" + text + "'");
		System.out.println("Trimmed: '" + StringUtils.trim(text) + "'");
		System.out.println("Is Empty: " + StringUtils.isEmpty(text));
	}
}
