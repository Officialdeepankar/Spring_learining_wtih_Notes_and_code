package com.studentCRUD.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentCRUD.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
