package com.springBoot.sms.service;

import java.util.List;
import java.util.Optional;

import com.springBoot.sms.Entity.Student;

public interface StudentService {
	
	public Student AddStudent(Student student);
	
	public List<Student> GetAllStudents();
	
	public Optional<Student> GetStudentById(long Id);
	
	public void deleteStudent(long Id);

}
