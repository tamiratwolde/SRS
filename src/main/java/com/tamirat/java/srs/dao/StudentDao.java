package com.tamirat.java.srs.dao;

import java.util.ArrayList;
import java.util.List;

import com.tamirat.java.srs.model.Student;

public class StudentDao {
 private static List<Student> studentsDatabase=new ArrayList<Student>();
	public void addStudent(Student s) {
		studentsDatabase.add(s);	
	}
	public Student getStudentById(String id) {
	 	for(int i=0;i<studentsDatabase.size();i++) {
	 		Student s= studentsDatabase.get(i);
	 		if(s.getStudentId().equals(id)) {
	 			return s;
	 			
	 		}
	 		
	 	}
	 	return null;
	 		
	}
	
	public Student getStudentByName(String Name) {
	 	for(int i=0;i<studentsDatabase.size();i++) {
	 		Student s= studentsDatabase.get(i);
	 		if(s.getFirstName().equals(Name)) {
	 			return s;
	 			
	 		}
	 		
	 	}
	 	return null;
	 		
	}
}
