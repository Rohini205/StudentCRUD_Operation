package com.springBoot.sms.Constroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.sms.Entity.Student;
import com.springBoot.sms.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentConstroller {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/InsertStudentDetails")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student savestudent=studentService.AddStudent(student);
		return new ResponseEntity<Student>(savestudent,HttpStatus.CREATED);
		
	}
	@GetMapping("/AllStudents")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> listofStudent=studentService.GetAllStudents();
		return new ResponseEntity<List<Student>> (listofStudent, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Student>> getById(@PathVariable ("id") Long Id){
		Optional<Student> Retrivestudent=(Optional<Student>) studentService.GetStudentById(Id);
		return new ResponseEntity<Optional<Student>>(Retrivestudent, HttpStatus.OK);
		
	}
	
	@GetMapping("/Delete/{id}")
	public void DeleteById(@PathVariable ("id") Long Id) {
		studentService.deleteStudent(Id);
	}
	
	
	
}
