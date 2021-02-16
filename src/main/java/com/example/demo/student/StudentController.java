package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")    // if we got to this url than we get the student details
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
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
