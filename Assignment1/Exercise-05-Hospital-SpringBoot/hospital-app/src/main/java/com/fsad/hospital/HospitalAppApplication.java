package com.fsad.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalAppApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Patient p1 = new Patient(1L, "Ramesh", 45, "Diabetes");
        Patient p2 = new Patient(2L, "Sita", 30, "Cardiology");
        Patient p3 = new Patient(3L, "Anil", 60, "Neurology");

        patientRepository.save(p1);
        patientRepository.save(p2);
        patientRepository.save(p3);

        System.out.println("Patient records inserted successfully");
    }
}
