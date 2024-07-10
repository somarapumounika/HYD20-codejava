package com.example.demo.Services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repositary.StudentRepositary;

@Service
public class StudentServicesimpl implements StudentServices {
	
	
	@Autowired
	StudentRepositary sr;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public List<Student> fetchStudentList() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student fetchStudentById(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Student updateStudent(Long id, Student student) {
		
		Student stuDB = sr.findById(id).get();
		
		 if(Objects.nonNull(student.getName()) &&
	               !"".equalsIgnoreCase(student.getName())) {
	           stuDB.setName(student.getName());
	       }
         
	       if(Objects.nonNull(student.getRollno()) &&
	               !"".equalsIgnoreCase(student.getRollno())) {
	           stuDB.setRollno(student.getRollno());
	       }
           
	       
	       if(Objects.nonNull(student.getQualification()) &&
	               !"".equalsIgnoreCase(student.getQualification())) {
	           stuDB.setQualification(student.getQualification());
	       }
	       
	       if(Objects.nonNull(student.getCourse()) &&
	               !"".equalsIgnoreCase(student.getCourse())) {
	           stuDB.setCourse(student.getCourse());
	       }

		return sr.save(stuDB);
	}

}
