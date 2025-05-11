package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.User;

public interface UserService {
	public User createUser(User user);
	public List<User> getAllUser();
	public Optional<User> getUser(int id);
	public User updateUser(int id, User user);
	public void deleteUser(int id);
}
