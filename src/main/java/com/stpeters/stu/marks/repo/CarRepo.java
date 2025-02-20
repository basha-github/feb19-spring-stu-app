package com.stpeters.stu.marks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stpeters.stu.marks.entity.Car;

public interface CarRepo extends JpaRepository<Car, String>{

}
