package com.tamirat.java.srs;

import com.tamirat.java.srs.controller.StudentController;
import com.tamirat.java.srs.model.Student;

public class App 
{
	public static void main( String[] args )
	{

		StudentController controller =new StudentController();
		Student s = new Student();
		s.setStudentId("123");
		s.setFirstName("stsy");
		s.setLastName("fjfj");
		controller.addStudent(s);

        String x="123";
		Student stu =controller.getStudentById(x);

		displayStudent(stu);
		String id="123";
		controller.deleteStudent(id);
		s=controller.getStudentById("2453");
		displayStudent(s);
		
	}
	public static  void displayStudent(Student s) {

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
