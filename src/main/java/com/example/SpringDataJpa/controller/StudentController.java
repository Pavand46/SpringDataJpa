package com.example.SpringDataJpa.controller;

import com.example.SpringDataJpa.StudentRepo;
import com.example.SpringDataJpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @GetMapping("hello")
    public String hello(){
        System.out.println("hello");
        return "Hello";
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        System.out.println("hello");
        return repo.findAll();
    }

    @GetMapping("students/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return repo.findById(id);
    }

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        repo.save(student);
        return "Student added";
    }





}
