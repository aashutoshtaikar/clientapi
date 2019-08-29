package com.trade.clientapi.service;

import java.util.List;

import com.trade.clientapi.entity.User;

/*UserService: Describes the rules for the UserServiceImpl
 * 				The UserServiceImpl class must delegate calls to the DAO layer
 * */
public interface UserService {
	public List<User> findAll();
	public User findById(String username);
	public void save(User theUser);
	public void deleteById(String username);
}
