package com.stpeters.stu.marks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stpeters.stu.marks.entity.StuUsers;

public interface StuUserRepo  extends JpaRepository<StuUsers, String> {

}
