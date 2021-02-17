package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication annotation goes to the class which has main method and
// It tells the springboot that this is the starting point for our springboot application
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// if we need to tell springboot to start the applictation and then create a servlet container and 
		// host this apllication in that servlet container and make it avilable right.
		// for that we need to write below line.
		SpringApplication.run(DemoApplication.class, args);
	}

}
