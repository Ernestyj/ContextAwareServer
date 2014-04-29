package com.ernyj.contextawareserver.service;

import java.util.List;

import com.ernyj.contextawareserver.dao.User;

public interface UserService {
//	public User userLogin(String loginName,String loginPwd);	
//	public boolean userRegister(User user);
//	public List<User> listAllUsers();	
	public User getUser(String id);	
//	public boolean delUser(Integer id);	
	public boolean saveOrUpdateUser(User user);
//	public Integer getIndexOfUser(String userId);
//	public boolean addUser(User user);
//	public User loadUser(String userId);
}
