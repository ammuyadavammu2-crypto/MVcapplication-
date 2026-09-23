package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) { this.service = service; }

    @GetMapping
    public List<Student> getStudents() { return service.getAllStudents(); }

    @PostMapping
    public Student addStudent(@RequestBody Student student) { return service.addStudent(student); }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) { service.deleteStudent(id); }
}
