package com.springmvc.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
