package com.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Exception.AgeException;
import com.StudentDetails.Service.StudentService;

@RestController
@RequestMapping("/home")
public class StudentController {

	@Autowired
	StudentService studentser;

	@PostMapping("/insertAll")
	public String insertAll(@RequestBody List<Student> s) throws AgeException {
		return studentser.insertAll(s);
	}
	
	@GetMapping("/findAll")
	public List<Student> findAll() {
		return studentser.findAll();
	}
	
	@GetMapping("/attendance") 
	public List<Integer> findatt() {
		return studentser.findatt();
	}
	

}
