package com.ernyj.contextawareserver.struts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ernyj.contextawareserver.dao.BaseDAOImpl;
import com.ernyj.contextawareserver.dao.User;

public class DataTest {
	
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	private BaseDAOImpl baseDAOImpl = (BaseDAOImpl)ctx.getBean("dao");
			
	public void addUser(){
		User user = new User(new String("201023"), new String("yang"), new String("5056"), null);
		baseDAOImpl.saveOrUpdate(user);
	}
	public User loadUserById(Integer index){ 
		return (User)baseDAOImpl.getById(User.class, index); 
	}
	
//	public static void main(String args[]){
//	
//	}
}
