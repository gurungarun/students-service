package com.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.model.Students;
import com.students.studentsservice.StudentsService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentsService studentsService;
	
	@PostMapping("/students")
	public Students save(@RequestBody Students students){
		 return studentsService.createStudents(students);
	}
	
	
	public List<Students> getStudentsList(){
		 return studentsService.getAllStudentsList();
	}
	
	public Students update(@RequestBody Students students){
		return studentsService.updateStudents(students);
	}
	
}
