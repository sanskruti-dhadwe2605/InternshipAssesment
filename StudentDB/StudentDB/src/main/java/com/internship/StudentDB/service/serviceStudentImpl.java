package com.internship.StudentDB.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.internship.StudentDB.Dao.StudentRepo;
import com.internship.StudentDB.model.Student;

public class serviceStudentImpl implements serviceStudent {
	@Autowired
	private StudentRepo repo;

	@Override
	public ResponseEntity<String> addStudent(Student student) {
		String msg=null;
		repo.save(student);
		Student s=repo.save(student);
		if(s!=null) {
			msg="Student Added Sucessfully!!";
		}else {
			msg="ERROR!!!!!";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@Override
	public Student searchStudent(Integer Id) {
		Optional<Student> s=repo.findById(Id);
		return s.get();
	}

	@Override
	public List<Student> displayAllStudents() {
		return (List<Student>) repo.findAll();
	}

	@Override
	public String deleteStudent(Integer Id) {
		repo.deleteById(Id);
		return "Student Deleted Sucessfully!!!";
	}

	@Override
	public String updateStudent(Integer Id, Student updatestu) {
		Optional<Student> optStud = repo.findById(Id);
		if(optStud!=null) {
			Student s=new Student(Id, updatestu.getName(), updatestu.getStd(), updatestu.getDivision(), updatestu.getRollNo(),updatestu.getAge(),updatestu.getMobileNSo());
			repo.save(s);
			System.out.println(s);
			return "Student Data Updated Sucessfully!!!";
		}else {
			return "Student Not Found!!!";
		}
		
	}
	



}
