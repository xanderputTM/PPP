package com.itbulls.learnit.javacore.dao.hw.solution.dao;

import java.util.List;

import com.itbulls.learnit.javacore.dao.hw.solution.dto.UserDto;

public interface UserDao {
	
	boolean saveUser(UserDto user);
	
	List<UserDto> getUsers();

	UserDto getUserByEmail(String userEmail);

	UserDto getUserById(int id);

}
