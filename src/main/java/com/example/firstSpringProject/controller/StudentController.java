package com.example.firstSpringProject.controller;

import com.example.firstSpringProject.entity.StudentEntity;
import com.example.firstSpringProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/login")
    public String getLoginForm() {
        return "login"; // if i want to use themeleaf to show data from this backend then i need to learn this but i will be using nextjs so no need to learn this now.
    }

    @GetMapping("/showAllPage")
    public String ShowAllStudentPage(){
        List<StudentEntity> allStudents = studentService.ShowAllStudent() ;
        return "showAll"; // if i want to use themeleaf to show data from this backend then i need to learn this but i will be using nextjs so no need to learn this now.
    }

    @GetMapping("/showAll")
    public List<StudentEntity> ShowAll(){
        return studentService.ShowAllStudent();
    }

    @PostMapping("/addStudent")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return studentService.addStudent(student);
    }


    @GetMapping("/showStudent/{id}")
    public StudentEntity showStudentById(@PathVariable Long id){
        return  studentService.findStudentById(id);
    }

    @PostMapping("/updateStudent/{id}")
    public StudentEntity updateStudent(@PathVariable Long id, @RequestBody StudentEntity student) {
        return studentService.updateStudent(id, student);
    }

}
