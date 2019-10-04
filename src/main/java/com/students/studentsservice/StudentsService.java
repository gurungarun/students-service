package com.students.studentsservice;

import java.util.List;

import com.students.model.Students;

public interface StudentsService {
	
	Students createStudents(Students students);
	
	List <Students> getAllStudentsList();
	
	Students getStudents(int userId);
	
	Students updateStudents(Students students);
	
	void deleteStudents(int userId);
	
	
}
