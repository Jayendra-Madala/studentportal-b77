package com.jayendra.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayendra.studentportal.model.Student;
import com.jayendra.studentportal.service.StudentService;

//http:localhost:9898/student//ss
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentService studentService ;
@GetMapping("hello")
String hello() {
	return "Good Boy";
}

//http://localhost:9898/student/getStudent/1
@GetMapping("getStudent/{sid}")
Student getStudent(@PathVariable Integer sid) {
	return studentService.getStudent(sid);
}

//http://localhost:9898/student/updateStudent/1
@PutMapping("updateStudent/{sid}")
Student updateStudent(@PathVariable Integer sid, @RequestBody Student s) {
	Student studentFromDB = getStudent(sid);
	studentFromDB.setAge(s.getAge());
	studentFromDB.setFirstname(s.getFirstname());
	studentFromDB.setLastname(s.getLastname());
	studentFromDB.setTotalmarks(s.getTotalmarks());
	studentFromDB.setCity(s.getCity());
	return studentService.updateStudent(studentFromDB);
}
//http://localhost:9898/student/deleteStudent/2
@DeleteMapping("deleteStudent/{sid}")
String deleteStudent(@PathVariable Integer sid) {
	 studentService.deleteStudent(sid);
	return "Deleted Student with "+ sid + "Successfully.";
}
@GetMapping("/getAllStudents")
List<Student> getAllStudents(){
	return studentService.getAllStudents();
}

@PostMapping("/ss")
Student	createStudent(@RequestBody Student s){
		return studentService.saveStudent(s);
	}
}
