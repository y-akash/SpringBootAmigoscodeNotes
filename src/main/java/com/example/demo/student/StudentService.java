package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// to use @Autowired
@Service
public class StudentService {
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
