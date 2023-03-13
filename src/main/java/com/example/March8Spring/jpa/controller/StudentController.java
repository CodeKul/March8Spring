package com.example.March8Spring.jpa.controller;

import com.example.March8Spring.jpa.entity.Student;
import com.example.March8Spring.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStud(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student saved";
    }

}
