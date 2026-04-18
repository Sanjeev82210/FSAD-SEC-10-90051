package com.example.co2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.co2.service.RegistrationService;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        RegistrationService service =
                context.getBean("registrationService", RegistrationService.class);

        service.registerCourse();
    }
}
