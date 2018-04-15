package com.tamirat.java.srs;

import com.tamirat.java.srs.controller.StudentController;
import com.tamirat.java.srs.model.Student;

public class App 
{
	public static void main( String[] args )
	{

		StudentController controller =new StudentController();
		controller.addStudent();
		//Student s =controller.getStudentById("2453");
		Student s =controller.getStudentByName("Tamirat");
		if(s!=null) {
			System.out.println(s.getStudentId());
			System.out.println(s.getFirstName());
			System.out.println(s.getLastName());
		} 
		else {
			System.out.println("No student found");
		}
	}
}
