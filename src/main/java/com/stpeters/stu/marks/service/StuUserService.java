package com.stpeters.stu.marks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stpeters.stu.marks.entity.StuUsers;
import com.stpeters.stu.marks.repo.StuUserRepo;

@Service
public class StuUserService {

	@Autowired
	StuUserRepo db;

	public String createNewUser(StuUsers data) {
		String res = "";

		try {
			db.save(data);
			res = "successfully added new user--->" + data.getEmail();
		} catch (Exception e) {
			res = "error while inserting" + " in to db--->" + data.getEmail();
		}

		return res;
	}

	public String updateUser(StuUsers data) {
		String res = "";

		try {
			StuUsers oldStu = db.findById(data.getEmail()).get();
			if (oldStu.getEmail().contentEquals(data.getEmail())) {
				db.save(data);
				res = "successfully updated  user--->" + data.getEmail();
			}
		} catch (Exception e) {
			res = "error while updating" + " in to db--->" + data.getEmail();
		}

		return res;
	}

	public String deleteUser(String email) {
		 db.deleteById(email);
		 return "successfully deleted---."+email;
	}

	public List<StuUsers> getAllUsers() {
		// TODO Auto-generated method stub
		return db.findAll();
	}

	public boolean searchUser(String email, String password) {

		boolean res = false;
		
		try {
			StuUsers oldStu = db.findById(email).get();
			if( 
					(oldStu.getEmail().contentEquals(email))
				&&(oldStu.getPassword().contentEquals(password)
						)){
			 
				res = true;
			}
		} catch (Exception e) {
			
		
		}


		
		return res;
	}

}
