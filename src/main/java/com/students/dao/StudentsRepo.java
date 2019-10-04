package com.students.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.model.Students;
@Repository
public interface StudentsRepo extends JpaRepository<Students ,Integer> {
	
	

}
