package com.ernyj.contextawareserver.struts;

import org.apache.struts2.ServletActionContext;

import com.ernyj.contextawareserver.dao.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** session过期、登录有效性及操作的权限验证拦截器 */
public class LoginedCheckInterceptor extends AbstractInterceptor {

	/** 拦截请求并进行登录有效性验证 */
	public String intercept(ActionInvocation ai) throws Exception {
		//取得请求的URL
		String url = ServletActionContext.getRequest().getRequestURL().toString();
		String prim = null;
		User user = null;
		int index = 0;
		//验证Session是否过期
		if(!ServletActionContext.getRequest().isRequestedSessionIdValid()){
			return "tologin";
		}else{
			//对登录与注销请求直接放行,不予拦截
			if (url.indexOf("admin_login.action")!=-1 || url.indexOf("admin_logout.action")!=-1){
				return ai.invoke();
			}else{
				user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
				//验证是否已经登录
				if (user==null){
					return "tologin";
				}else{
					return ai.invoke();				
				}				
			}			
		}
	}
}