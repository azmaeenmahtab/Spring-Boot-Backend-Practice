package com.example.firstSpringProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity   //This annotation indicates that the class is a JPA entity, which means it will be mapped to a database table.
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private int age;
    private String email;
}
