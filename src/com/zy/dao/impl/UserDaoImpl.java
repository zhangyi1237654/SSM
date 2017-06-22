package com.zy.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zy.dao.UserDao;
import com.zy.entity.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public List<User> getAll() {
		
		return this.getSqlSession().selectList("com.zy.entity.user.mapper.getAll");
	}

}
