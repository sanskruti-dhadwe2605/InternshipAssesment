package com.internship.StudentDB.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.internship.StudentDB.model.Student;

public interface serviceStudent {
	public ResponseEntity<String> addStudent(Student student);
	public Student searchStudent(Integer Id);
	public List<Student> displayAllStudents();
	public String deleteStudent(Integer Id);
	public String updateStudent(Integer Id, Student updatestu);

}
