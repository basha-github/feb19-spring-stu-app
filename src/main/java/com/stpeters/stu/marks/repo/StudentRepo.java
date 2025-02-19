package com.stpeters.stu.marks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stpeters.stu.marks.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
