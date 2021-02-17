package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query("SELECT s FROM s WHERE s.email = ?1")  //this is not a straight sql, it's a jbql
    Optional<Student> findStudentByEmail(String email); //this line will transform to above sql query underhood
}
