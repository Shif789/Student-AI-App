package com.example.spring_ai_app.controller;

import com.example.spring_ai_app.entity.Student;
import com.example.spring_ai_app.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@CrossOrigin("*")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get-student-by-id")
    public ResponseEntity<Student> getStudentById(@RequestParam Integer id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping("/create-student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
