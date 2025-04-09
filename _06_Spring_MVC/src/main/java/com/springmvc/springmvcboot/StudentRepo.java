package com.springmvc.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	// what if i dont want to use the primary key for extracting infromation out of mysql database 
	/*
	 * What about if i want to use other parameter;
 *        start with findBy    then first letter Capitial of the Field  OrderBy ------this is the format(
	 */
	
	List<Student>findByNameOrderByName(String Name);//Query DSL
	
	
	//----------------Custom function--------------------
	
	//learn jpql for that to write sql query in jpql format;
	
}
