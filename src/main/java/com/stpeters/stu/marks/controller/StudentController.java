package com.stpeters.stu.marks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stpeters.stu.marks.entity.Student;
import com.stpeters.stu.marks.service.StudentService;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudentService stuService;
	
	
	@PostMapping("/stu/mng/add")
	public String addNewStudent(@RequestBody Student stu) {
		
		System.out.println("from react---->"+stu);
		
		return stuService.saveNewStudent(stu);
	}

}
