package com.internship.StudentDB.Dao;

import org.springframework.data.repository.CrudRepository;

import com.internship.StudentDB.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
