package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentService 
{

	public boolean addStudentDetails(Student std);
	public List<Student> getAllStudents();
	public Student getStudent(long id);
	public boolean updateStudent(long id, float marks);
	public boolean deleteStudent(long id);
	
}
