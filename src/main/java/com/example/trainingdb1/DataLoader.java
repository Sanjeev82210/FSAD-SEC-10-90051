package com.example.trainingdb1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final Trainingdb1Repository repository;

	public DataLoader(Trainingdb1Repository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) {
		if (repository.count() == 0) {
			repository.save(new trainingdb1(12000.0, 30, "Java Fundamentals"));
			repository.save(new trainingdb1(15000.0, 45, "Spring Boot"));
			repository.save(new trainingdb1(18000.0, 60, "Microservices"));
			repository.save(new trainingdb1(9000.0, 20, "SQL Basics"));
			repository.save(new trainingdb1(21000.0, 75, "Cloud Native Apps"));
		}
	}
}
