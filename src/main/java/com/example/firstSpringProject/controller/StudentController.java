package com.example.firstSpringProject.controller;

import com.example.firstSpringProject.entity.StudentEntity;
import com.example.firstSpringProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/login")
    public String getLoginForm() {
        return "login";
    }

    @GetMapping("/showAll")
    public List<StudentEntity> ShowAll(){
        return studentService.ShowAllStudent();
    }
}
