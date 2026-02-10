package com.nubi.fws.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nubi.fws.model.User;
import com.nubi.fws.repository.UserRepo;
import com.nubi.fws.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;

	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public void deleteUserById(int userId) {
		userRepo.deleteById(userId);
	}

	@Override
	public User getUserById(int userId) {
		return userRepo.findById(userId).get();
	}

	@Override
	public void updateUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
