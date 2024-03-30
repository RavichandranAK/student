package com.StudentDetails.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails.Dao.StudentDao;
import com.StudentDetails.Entity.Student;
import com.StudentDetails.Exception.AgeException;

@Service
public class StudentService {
	@Autowired
	StudentDao studentdao;

	public String insertAll(List<Student> s) throws AgeException {

		int count = 0;
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getAge() < 18) {
				count++;
			} else {
				count = 0;
			}
		}
		if (count > 0) {
			throw new AgeException("Age is Less than 18");
		} else {
			return studentdao.insertAll(s);
		}
	}
	
	public List<Student> findAll() {
		return studentdao.findAll();
	}
	
	public List<Integer> findatt(){
		List<Student> temp=studentdao.findAll();
		List<Integer> att=new ArrayList<>();
		for(Student x:temp) {
			int at=x.getAttendance();
			att.add(at);
		}
		return att;
	}

}
