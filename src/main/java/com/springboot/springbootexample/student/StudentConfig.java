package com.springboot.springbootexample.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student ram = new Student("Ram", "ram@kumar.com", LocalDate.of(1997, 11, 10));
			Student kumar = new Student("Kumar", "kumar@ram.com", LocalDate.of(2000, 11, 10));
			
			studentRepository.saveAll(List.of(ram,kumar));

		};
		
		
	}

}
