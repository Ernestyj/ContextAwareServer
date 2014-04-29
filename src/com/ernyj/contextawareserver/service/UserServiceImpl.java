package com.ernyj.contextawareserver.service;

import com.ernyj.contextawareserver.dao.BaseDAO;
import com.ernyj.contextawareserver.dao.User;

public class UserServiceImpl implements UserService{
	private BaseDAO dao;
	
//	@Override
//	public User userLogin(String loginName, String loginPwd) {
//		String hql = "from UserInfo as user where user.userName='" + loginName + 
//									"' and user.userPassword='" + loginPwd + "'";
//		return (User)dao.loadObject(hql);
//	}
//	@Override
//	public boolean userRegister(User user) {
//		return saveOrUpdateUser(user);
//	}
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<User> listAllUsers() {
//		return dao.findAll("Userinfo");
//	}
	@Override
	public User getUser(String id) {
		try{
			return (User)dao.getById(User.class, id);
		}catch(Exception ex){ ex.printStackTrace(); }
		return null;
	}
//	@Override
//	public boolean delUser(Integer id) {
//		boolean status = false;
//		try{
//			dao.delById(User.class, id);
//			status = true;
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}	
//		return status;
//	}
	@Override
	public boolean saveOrUpdateUser(User user) {
		boolean status = false;
		try{
			dao.saveOrUpdate(user);
			status = true;
		}catch(Exception ex){ ex.printStackTrace(); }
		return status;
	}
//	@Override
//	public boolean addUser(User user){	//因为数据库设计及saveOrUpdate特征，此处saveOrUpdate只能save，无法正确检查update
//		boolean status = false;
//		try{
//			User userResult = loadUser(user.getUserid());
//			if(null == userResult){	//增加用户
//				dao.saveOrUpdate(user);
//				status = true;
//			}
//		}catch(Exception ex){ ex.printStackTrace(); }	
//		return status;
//	}
//	@Override
//	public Integer getIndexOfUser(String userId) {
//		Integer index = null;
//		try{
//			User userResult = loadUser(userId);
//			if(null != userResult){
//				String queryhql = "select user.index from Userinfo as user where user.userId='" + userId + "'";
//				List result = dao.query(queryhql);
//				index = (Integer)result.get(0);
//			}
//		}catch(Exception ex){ ex.printStackTrace(); }	
//		return index;
//	}
//	@Override
//	public User loadUser(String userId) {
//		User userResult = null;
//		try{
//			String hql = "from Userinfo as user where user.userId='" + userId + "'";
//			userResult = (User)dao.loadObject(hql);
//		}catch(Exception ex){ ex.printStackTrace(); }
//		return userResult;
//	}
	
	public BaseDAO getDao() { return dao; }
	public void setDao(BaseDAO dao) { this.dao = dao; }
	
}
