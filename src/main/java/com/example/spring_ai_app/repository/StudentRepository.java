package com.example.spring_ai_app.repository;

import com.example.spring_ai_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
