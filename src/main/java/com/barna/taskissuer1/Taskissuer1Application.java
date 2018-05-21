package com.barna.taskissuer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.barna.taskissuer1.controlller"})
public class Taskissuer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Taskissuer1Application.class, args);
	}
}
