package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@SpringBootApplication
public class SpringBootHibernateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
		
		User user1 = new User( "Ram", "ram@gmail.com", "ram123", "male", "delhi");
		
		Configuration cfg = new Configuration();
		cfg.configure("/com/example/demo/config/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//-------------insertion-------------
		try 
		{
			session.save(user1);
			transaction.commit();
			System.out.println("user added successfully");
		} 
		catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}
		
		//-------------------select ---------
//		try 
//		{
//			User user = session.get(User.class, 1L);
//			System.out.println(user.getId());
//			System.out.println(user.getName());
//			System.out.println(user.getEmail());
//			System.out.println(user.getPassword());
//			System.out.println(user.getGender());
//			System.out.println(user.getCity());
//			
//		} 
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		//--------------update-----------
//		try 
//		{
//			User user =session.get(User.class, 1L);
//			user.setCity("Banglore");
//			
//			session.saveOrUpdate(user);
//			transaction.commit();
//			System.out.println("user updated successfully");
//			
//		} 
//		catch (Exception e) {
//			// TODO: handle exception
//			transaction.rollback();
//		}
		//-------------delete--------
//		try 
//		{
//			User user = new User();
//			user.setId(1L);
//			
//			session.delete(user);
//			transaction.commit();
//			System.out.println("user deleted successfully");
//			
//		} 
//		catch (Exception e) {
//			// TODO: handle exception
//			transaction.rollback();
//		}
		
		
		
		
	}

}
