package com.tamirat.java.srs.controller;

import com.tamirat.java.srs.model.Student;
import com.tamirat.java.srs.service.StudentService;

public class StudentController {
private StudentService service= new StudentService();
 public void addStudent() {
	 
	 Student stud = new Student();
	 stud.setFirstName("tamirat");
	 stud.setLastName("Shiwayrga");
	 stud.setStudentId("2453");
	 
	 service.addStudent(stud);;
 }
 public Student getStudentById(String id) {
	 return service.getStudentById(id);
 }
 
}
