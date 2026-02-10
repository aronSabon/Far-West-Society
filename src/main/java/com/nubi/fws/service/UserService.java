package com.nubi.fws.service;

import java.util.List;

import com.nubi.fws.model.User;

public interface UserService {

	void addUser(User user);

	List<User> getAllUser();

	void deleteUserById(int userId);

	User getUserById(int userId);

	void updateUser(User user);

	User findByUsername(String username);

}
