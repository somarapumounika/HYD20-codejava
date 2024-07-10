package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentServices {

	Student saveStudent(Student student);

	List<Student> fetchStudentList();

	Student fetchStudentById(Long id);

	void deleteStudentById(Long id);

	Student updateStudent(Long id, Student student);



}
