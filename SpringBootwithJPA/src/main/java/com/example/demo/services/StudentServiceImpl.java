package com.example.demo.services;

import java.io.ObjectInputFilter.Status;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		
		try 
		{
			studentRepository.save(std);
			status = true;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;	
		}
	@Override
	public List<Student> getAllStudents() 
	{
		return studentRepository.findAll();
	}
	@Override
	public Student getStudent(long id) 
	{
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}
	
	@Override
	public boolean updateStudent(long id, float marks) {
		Student student = getStudent(id);
		if(student != null) {
			student.setMarks(marks);
			studentRepository.save(student);
			
			return true;
		}
		return false;
	}
	
	@Override
	public boolean deleteStudent(long id) {
		boolean status = false;
		try 
		{
			studentRepository.deleteById(id);
			status = true;
			return status;
		} 
		catch (Exception e) {
			
		}
		return status;
	}
	

}
