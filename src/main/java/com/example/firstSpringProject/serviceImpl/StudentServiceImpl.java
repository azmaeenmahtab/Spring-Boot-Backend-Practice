package com.example.firstSpringProject.serviceImpl;

import com.example.firstSpringProject.entity.StudentEntity;
import com.example.firstSpringProject.repository.StudentRepository;
import com.example.firstSpringProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class                                                                                                                                                                                                                          StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> ShowAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity addStudent(StudentEntity student){
        return studentRepository.save(student);
    }

    @Override
    public StudentEntity findStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }
}
