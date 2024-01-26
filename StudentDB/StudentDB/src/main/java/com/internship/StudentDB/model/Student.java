package com.internship.StudentDB.model;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_name")
@DynamicUpdate
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="std")
	private Integer std;
	
	@Column(name="Division")
	private String Division;
	
	@Column(name="roll_no")
	private Integer rollNo;
	
	@Column(name="age")
	private Integer age;

	@Column(name="mobileNo")
	private int mobileNSo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStd() {
		return std;
	}

	public void setStd(Integer std) {
		this.std = std;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int getMobileNSo() {
		return mobileNSo;
	}

	public void setMobileNSo(int mobileNSo) {
		this.mobileNSo = mobileNSo;
	}

	public Student(Integer id, String name, Integer std, String division, Integer rollNo, Integer age, int mobileNSo) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		Division = division;
		this.rollNo = rollNo;
		this.age = age;
		this.mobileNSo = mobileNSo;
	}
	
	
}
	