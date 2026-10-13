package com.jayendra.studentportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.jayendra.studentportal.model.Student;
import com.jayendra.studentportal.repo.StudentRepo;
//class is helping how to do what we implemented in interface
@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student s) {
		
		return studentRepo.save(s);
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepo.deleteById(id);		
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

}
