package com.internship.StudentDB.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.StudentDB.model.Student;
import com.internship.StudentDB.service.serviceStudentImpl;



@RestController
@RequestMapping("/student")
public class internControl {
	
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private serviceStudentImpl impl;
	
	
	@PostMapping("/create")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		ResponseEntity<String> s = impl.addStudent(student);
		return s;
	}
	
	@GetMapping("/get/{studId}")
	public Student searchStudent(@PathVariable Integer Id) {
		return impl.searchStudent(Id);
	}
	
	@GetMapping("/getAll")
	public List<Student> displayAllStudents() {
		return impl.displayAllStudents();
	}
	@PutMapping("/update/{studId}")
	public String updateStudent(@PathVariable Integer Id, @RequestBody Student updatestu) {
		return impl.updateStudent(Id, updatestu);
	}
	
	@DeleteMapping("/delete/{studId}")
	public String deleteStudent(@PathVariable Integer Id) {
		return impl.deleteStudent(Id);
	}
	
	
	

}