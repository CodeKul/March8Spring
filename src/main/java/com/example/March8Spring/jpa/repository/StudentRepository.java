package com.example.March8Spring.jpa.repository;

import com.example.March8Spring.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
