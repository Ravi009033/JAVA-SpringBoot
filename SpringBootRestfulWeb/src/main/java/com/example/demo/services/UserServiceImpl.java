package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.respositories.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) 
	{
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() 
	{
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(int id) {
		
		return userRepository.findById(id);
	}

	@Override
	public User updateUser(int id, User user) {
		
		User userData = userRepository.findById(id).orElse(null);
		if(userData != null) {
		  return userRepository.save(user);
		}
		else throw new RuntimeException("user not found with id: "+id);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	
}
