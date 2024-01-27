package com.springBoot.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.sms.Entity.Student;
import com.springBoot.sms.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
    
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student AddStudent(Student student) {
		Student saveStudent=studentRepository.save(student);
		return saveStudent;
	}

	@Override
	public List<Student> GetAllStudents() {
		List<Student> liststs=(List<Student>) studentRepository.findAll();
		return liststs;
	}

	@Override
	public Optional<Student> GetStudentById(long Id) {
		return studentRepository.findById(Id);
	}

	@Override
	public void deleteStudent(long Id) {
		studentRepository.deleteById(Id);
		
	}

	
}
