package com.stpeters.stu.marks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stpeters.stu.marks.entity.StuUsers;
import com.stpeters.stu.marks.service.StuUserService;

/*
 * http://localhost:8080/stu/mng/users/add
 * 
 * method:::::post
 * 
 * 
 * request  body
 * 
 * {
    "email": "xyz@gmail.com",
    "password": "998877"
}
 * 
 * 
 * 
 * 
 */




@RestController
@CrossOrigin("*")
public class StuUserController {
	
	@Autowired
	StuUserService  serVar;
		
	@PostMapping("/stu/mng/users/add")
	public String addNewUser(@RequestBody StuUsers data) {
		
		
		return  serVar.createNewUser(data);
	}
	

}
