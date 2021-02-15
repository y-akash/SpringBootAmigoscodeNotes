package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
//@RestController annotation makes this class to serve rest endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
//	in order for this method to serve as restful endpoint we have to annotate it
//	so here I used @GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Akash",
						"ay@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						22
				)
		);
	}
}
