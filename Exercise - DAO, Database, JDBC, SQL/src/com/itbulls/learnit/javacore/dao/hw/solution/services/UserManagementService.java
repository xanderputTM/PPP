package com.itbulls.learnit.javacore.dao.hw.solution.services;

import java.util.List;

import com.itbulls.learnit.javacore.dao.hw.solution.entities.User;

public interface UserManagementService {

	String registerUser(User user);

	List<User> getUsers();

	User getUserByEmail(String userEmail);
	
	void resetPasswordForUser(User user);

}
