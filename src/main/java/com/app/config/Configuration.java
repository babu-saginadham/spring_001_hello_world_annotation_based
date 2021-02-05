package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class Configuration {

	@Bean(name = "student-101")
	public Student getStudent() {
		return new Student(201, "XYZ");
	}

	
}
