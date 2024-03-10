package com.example.qrcodegenerate.service;

import java.util.List;

import com.example.qrcodegenerate.model.Student;

public interface StudentService {

	public List<Student> getStudents();

	public Student addStudent(Student student);

	public Student findById(Long id);

}
