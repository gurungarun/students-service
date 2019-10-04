package com.students.studentsservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.students.dao.StudentsRepo;
import com.students.model.Students;



@Service
public class StudentsServiceImpl implements StudentsService {



	
	 private StudentsRepo studentsRepo;
	
	@Autowired
	public StudentsServiceImpl(StudentsRepo theStudentsRepo) {
		studentsRepo = theStudentsRepo;
	}
	
	@Override
	@PostMapping("/students")
	public Students createStudents(Students students) {
		// TODO Auto-generated method stub
		return  studentsRepo.save(students);
	}

	@Override
	public List<Students> getAllStudentsList() {
		// TODO Auto-generated method stub
		return studentsRepo.findAll();
	}

	@Override
	public Students getStudents(int userId) {
		// TODO Auto-generated method stub
		return studentsRepo.findById(userId).get();
	}

	@Override
	public Students updateStudents(Students students) {
		// TODO Auto-generated method stub
		return studentsRepo.saveAndFlush(students);
	}

	@Override
	public void deleteStudents(int userId) {
		 studentsRepo.deleteById(userId);

	}

}
