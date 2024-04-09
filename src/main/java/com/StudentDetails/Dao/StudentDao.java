package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository studentrepo;

	public String insertAll(List<Student> s) {
		studentrepo.saveAll(s);
		return "Inserted Successfully";
	}

	public List<Student> findAll() {
		return studentrepo.findAll();
	}
	
	public String patchUpdate(Student s) {
		studentrepo.save(s);
		return "Updated";
	}
	
	

}
