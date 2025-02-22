package com.stpeters.stu.marks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PutMapping("/stu/mng/users/update")
	public String updateUser(@RequestBody StuUsers data) {
		
		
		return  serVar.updateUser(data);
	}
	@DeleteMapping("/stu/mng/users/delete")
	public String deleteUser(@RequestParam String email) {
		
		
		return  serVar.deleteUser(email);
	}
	@GetMapping("/stu/mng/users/get/all")
	public List<StuUsers> getAllUsers() {
		
		
		return  serVar.getAllUsers();
	}
	
	@GetMapping("/stu/mng/search/user")
	public boolean searchUser(@RequestParam String email) {
		
		
		return  serVar.searchUser(email);
	}
	
	

}
