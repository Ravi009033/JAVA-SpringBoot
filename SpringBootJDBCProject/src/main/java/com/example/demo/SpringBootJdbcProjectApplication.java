package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
public class SpringBootJdbcProjectApplication implements CommandLineRunner 
{
	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{	
		//-------------------Insertion Operation-------------------
		User user1 = new User("Rohit","Rohit@gmail.com", "Male", "Delhi");
		User user2 = new User("Shyam","Shyam@gmail.com", "Male", "Delhi");
		boolean status = userDao.insertUser(user1);
		if(status) {
			System.out.println("insert successfully");
		}
		else {
			System.out.println("insert failed");
		}
		boolean status1 = userDao.insertUser(user2);
		if(status1) {
			System.out.println("insert successfully");
		}
		else {
			System.out.println("insert failed");
		}
		
		//-------------Updation Operation--------------
//		User user2 = new User("Shyam kapoor","Shyam@gmail.com", "Male", "Delhi");
//		boolean status = userDao.updateUser(user2);
//		if(status) {
//			System.out.println("Update successfully");
//		}
//		else {
//			System.out.println("Update failed");
//		}
		
		//-----------------select operation--------
//		User user = userDao.getUser("Ram@gmail.com");
//		System.out.println("Name: "+user.getName());
//		System.out.println("Name: "+user.getEmail());
//		System.out.println("Name: "+user.getGender());
//		System.out.println("Name: "+user.getCity());
		
		//------------Select operation all user--------
//		List<User> list = userDao.getAllUsers();
//		for(User u:list) {
//			System.out.println("------------------------");
//			System.out.println("Name: "+u.getName());
//			System.out.println("Name: "+u.getEmail());
//			System.out.println("Name: "+u.getGender());
//			System.out.println("Name: "+u.getCity());
//			
//		}

	}

}
