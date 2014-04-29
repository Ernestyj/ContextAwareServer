package com.ernyj.contextawareserver.struts;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.ernyj.contextawareserver.dao.User;
import com.ernyj.contextawareserver.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ServletResponseAware{
	private UserService userService;
	//表单数据
	private String userid, username, userpassword;
	
	private HttpServletResponse response;

	public String addUser() throws Exception{
		User user = new User(userid, username, userpassword);
		
		if (userService.saveOrUpdateUser(user)){ addActionMessage("User is added.");
		}else{ addActionMessage("Adding user failed."); }
		
		ServletOutputStream writer = null;
		try{
	        writer = response.getOutputStream();
	        writer.println("success");
	    } catch( Exception e ) { throw e;
	    } finally{ if( writer != null ) writer.close(); }
		
		return null;
	}
	
//	public void validateLogin(){
//		if(null == userName || userName.trim().length() < 1){
//			addFieldError("userName", "Login account can not be null.");
//		}
//		if(null == userPassword || userPassword.trim().length() < 3){
//			addFieldError("userPassword", "Login password can not be less than 3 characters.");
//		}
//	}
//	
//	public String login() throws Exception{
//		Userinfo tempUser = userService.userLogin(userName.trim(), userPassword.trim());
//		if(tempUser != null){
//			//ServletActionContext.getRequest().getSession().setAttribute("userInfo", tempUser);
//			return INPUT;
//		}else{
//			addActionError("User login failed.");
//			return INPUT;				
//		}
//	}
//	
//	public String logout() throws Exception{
//		//ServletActionContext.getRequest().getSession().removeAttribute("user");
//		return INPUT;
//	}
	
//	public String delUser() throws Exception{
//		if (user.getIndex() != null){
//			if (userService.delUser(user.getIndex())){
//				addActionMessage("User is deleted.");
//			}else{
//				addActionMessage("Deleting user failed.");
//			}			
//		}else{
//			addActionMessage("Deleting user failed.");
//		}
//		return SUCCESS;
//		return null;
//	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response; 
	}
	public HttpServletResponse getResponse() { return response; }
	public void setUserService(UserService userService){ this.userService = userService; }
	public UserService getUserService(){ return this.userService; }
	//表单数据getter, setter
	public String getUserid() { return userid; }
	public void setUserid(String userid) { this.userid = userid; }
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getUserpassword() { return userpassword; }
	public void setUserpassword(String userpassword) { this.userpassword = userpassword; }

}
