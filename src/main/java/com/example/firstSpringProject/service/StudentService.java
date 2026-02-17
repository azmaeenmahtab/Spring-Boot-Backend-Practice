package com.example.firstSpringProject.service;

import com.example.firstSpringProject.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> ShowAllStudent();

    StudentEntity addStudent(StudentEntity student);
    StudentEntity findStudentById(Long id);

}
