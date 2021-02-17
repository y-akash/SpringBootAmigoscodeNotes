package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")    // if we got to this url than we get the student details
public class StudentController {

    private final StudentService studentService;

    // here we are taking the StudentService instance but we are not creating anywhere
    // so we will get an error
    // instead of this we can do this.studentService = new StudentService();
    // but we can do another better approach 
    // if we annote this method with @Autowired it will instatiate and injected into the consturctor underhood
    // for that we have to also tell the class which are instntiating so go to class StudentService annotate it with @Service
    // we can slso annotate with @Component but it is good to annotate with @Service
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
        return  studentService.getStudent();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {  // we take a @RequestBody data and map to Student class
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")    //it is similar to parameter api/v1/student/1 so that 1 will come inside studentId
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
}
