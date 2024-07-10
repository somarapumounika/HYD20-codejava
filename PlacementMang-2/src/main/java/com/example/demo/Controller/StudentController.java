package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	StudentServices ss;
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		
		return ss.saveStudent(student);
	
	}
	@GetMapping("/students")
	    public List<Student> fetchStudentList() {
	       
	        return ss.fetchStudentList();
	    }
	    
	   @GetMapping("/students/{id}")
	    public Student fetchStudentById(@PathVariable("id") Long id) {
	        return ss.fetchStudentById(id);
	    }
	    
	    @DeleteMapping("/students/{id}")
	    public String deleteStudentById(@PathVariable("id") Long id) {
	        ss.deleteStudentById(id);
	        return "row deleted Successfully!!";
	    }
	    
	    @PutMapping("/students/{id}")
	    public Student updateStudent(@PathVariable("id") Long id,
	                                       @RequestBody Student student) {
	        return ss.updateStudent(id,student);
	    }

}
