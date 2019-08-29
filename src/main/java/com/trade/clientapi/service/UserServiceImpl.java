package com.trade.clientapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trade.clientapi.dao.UserRepo;
import com.trade.clientapi.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userDao;
	
	@Override
	@Transactional
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	@Transactional
	public User findById(String username) {
		Optional<User> result = userDao.findById(username);
		User user = null;
		if (result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("Did not find user with username:"+username);
		}
		return user;
	}

	@Override
	@Transactional
	public void save(User theEmployee) {
		userDao.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(String username) {
		userDao.deleteById(username);
	}

}
