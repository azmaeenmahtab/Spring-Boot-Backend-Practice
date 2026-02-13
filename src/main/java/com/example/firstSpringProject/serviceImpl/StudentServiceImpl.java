package com.example.firstSpringProject.serviceImpl;

import com.example.firstSpringProject.entity.StudentEntity;
import com.example.firstSpringProject.repository.StudentRepository;
import com.example.firstSpringProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> ShowAllStudent() {
        return studentRepository.findAll();
    }

    //checking push
}
