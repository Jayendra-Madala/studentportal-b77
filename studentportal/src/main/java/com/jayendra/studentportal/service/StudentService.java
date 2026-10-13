package com.jayendra.studentportal.service;

import java.util.List;

import com.jayendra.studentportal.model.Student;
//Interface means what to do but not how to do+
public interface StudentService {
 Student saveStudent(Student s);
 Student getStudent(Integer id);
 List<Student> getAllStudents();
 
 void deleteStudent(Integer id);
 Student updateStudent(Student s);
}
