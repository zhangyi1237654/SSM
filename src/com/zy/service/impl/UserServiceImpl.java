package com.zy.service.impl;

import java.util.List;

import com.zy.dao.UserDao;
import com.zy.entity.User;
import com.zy.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAll() {
		
		
		return userDao.getAll();
	}

}
