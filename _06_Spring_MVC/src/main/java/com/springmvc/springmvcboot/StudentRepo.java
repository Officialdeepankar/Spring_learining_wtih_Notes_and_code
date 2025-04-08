package com.springmvc.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
