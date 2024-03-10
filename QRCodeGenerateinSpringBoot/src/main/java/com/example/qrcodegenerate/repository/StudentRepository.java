package com.example.qrcodegenerate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qrcodegenerate.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
