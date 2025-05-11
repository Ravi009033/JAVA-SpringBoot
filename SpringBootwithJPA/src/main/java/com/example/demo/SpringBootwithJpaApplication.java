package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
import com.example.demo.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootwithJpaApplication {

	public static void main(String[] args) 
	{
		 ApplicationContext context = SpringApplication.run(SpringBootwithJpaApplication.class, args);
		 StudentService stdService = context.getBean(StudentServiceImpl.class);
		 
		 //----------------insertion operation-------------
		 Student std = new Student("Mohan", 102, 96.5f);
		 boolean status = stdService.addStudentDetails(std);
		 if(status) {
			 System.out.println("insert successfully");
		 }
		 else {
			System.out.println("insert failed");
		}
		 
		 //--------------- select all operation ----------
//		 List<Student> stdList = stdService.getAllStudents();
//		 for(Student student: stdList) {
//			 System.out.println("Id: "+student.getId());
//			 System.out.println("Name: "+student.getName());
//			 System.out.println("Roll no: "+student.getRollno());
//			 System.out.println("Marks: "+student.getMarks());
//			 System.out.println("----------------------------");
//		 }
		 
		 //------------------select single student operation 2-------------
//		  Student student = stdService.getStudent(3L);
//		 
//			 if(student!=null) {
//				 System.out.println("Id: "+student.getId());
//				 System.out.println("Name: "+student.getName());
//				 System.out.println("Roll no: "+student.getRollno());
//				 System.out.println("Marks: "+student.getMarks());
//				 System.out.println("----------------------------");
//			 }
//			 else {
//				 System.out.println("Student is not found");
//			 }
		 
		//------------------updation operation-----------------
//		 boolean status = stdService.updateStudent(1L, 90.2f);
//		 if(status) {
//			 System.out.println("updated successfully");
//		 }
//		 else {
//			 System.out.println("updated failed");
//		 }
		 
		 //-----------------deletion operation----------------
//		 boolean status = stdService.deleteStudent(2L);
//		 if(status) {
//			 System.out.println("delete successfully");
//		 }
//		 else {
//			 System.out.println("delete failed");
//		 }
	}

}
