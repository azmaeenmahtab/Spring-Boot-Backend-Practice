package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
