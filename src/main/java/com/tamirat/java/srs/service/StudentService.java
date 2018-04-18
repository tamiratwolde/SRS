package com.tamirat.java.srs.service;

import com.tamirat.java.srs.dao.StudentDao;
import com.tamirat.java.srs.model.Student;

public class StudentService  {
	 private StudentDao dao = new StudentDao();

	public void addStudent(Student s) {
		dao.addStudent(s);	
	}
	public void deleteStudent(String id) {
		dao.deleteStudent(id);	
	}
	public Student getStudentById(String id) {

		Student s= dao.getStudentById(id);
		return s;

	}
	public Student getStudentByName(String Name) {
		Student s= dao.getStudentByName(Name);	 
		return s;
	}
}
