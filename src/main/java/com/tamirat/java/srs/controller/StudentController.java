package com.tamirat.java.srs.controller;

import com.tamirat.java.srs.model.Student;
import com.tamirat.java.srs.service.StudentService;

public class StudentController {
	private  StudentService service= new StudentService();
	public void addStudent(Student s) {

		service.addStudent(s);;
	}


	public void deleteStudent(String id) {


		service.deleteStudent(id);;
	} 
	public Student getStudentById(String id) {
		return service.getStudentById(id);
	}
	public Student getStudentByName(String Name) {
		return service.getStudentByName(Name);
	}

}
