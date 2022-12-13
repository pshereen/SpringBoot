package com.example.restServiceStudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired // Dependency injection. Telling Student controller to auto wire student repository.
			   // Spring automatically create an object of studentRepository and supply it to the controller.
			   // No need to create an object of student Repository explicitly.
	private StudentRepository studentRepository ;
	
	@PostMapping("/student/create")
	public Student createStudent(@RequestBody Student student) {
		return studentRepository.save(student) ;
	}
	
	@GetMapping("/student/{id}")
	Student getStudent(@PathVariable Long id) {
		return studentRepository.findById(id).get() ;
	}
	
}
