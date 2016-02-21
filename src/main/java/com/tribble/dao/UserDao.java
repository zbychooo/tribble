package com.tribble.dao;

import java.util.List;

import com.tribble.model.User;

public interface UserDao {

	public void save(User user);
	public List<User> getAll();
	
}
