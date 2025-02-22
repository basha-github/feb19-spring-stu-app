package com.stpeters.stu.marks.service;

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

}
