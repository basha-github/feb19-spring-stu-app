package com.stpeters.stu.marks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpeters.stu.marks.entity.Student;
import com.stpeters.stu.marks.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public String saveNewStudent(Student stu) {
		String res = "";
		try {
			stuRepo.save(stu);
			
			res = "successfully added new stu.."+
			stu.getRollNo()+" into DB";
				
		}catch(Exception e) {
			res = "not able to insert new Student..."+stu.getRollNo();
		}
		return res;
	}

	public List<Student> fetAllStudents() {
		
		return stuRepo.findAll();
	}

	public Student fetOnlyOneStudent(int rollNo) {
		return stuRepo.findById(rollNo).orElse(new Student());
	}

}
