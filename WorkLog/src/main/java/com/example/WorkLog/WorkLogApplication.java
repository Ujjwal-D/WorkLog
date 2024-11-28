package com.example.WorkLog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.WorkLog.service.UserService;

@SpringBootApplication
public class WorkLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkLogApplication.class, args);
	}

	@Bean
    CommandLineRunner init(UserService userService) {
        return args -> {
            userService.registerUser("Admin", "admin@example.com", "admin123", "ROLE_ADMIN");
        };
    }

}
