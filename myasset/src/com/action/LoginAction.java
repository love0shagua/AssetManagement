package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ILoginService;

public class LoginAction extends ActionSupport {
	
	private ILoginService loginService;
	private String username;
	private String userpwd;
	
	
	public ILoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	
	public String login() {
		System.out.print(this.getUsername()+"========================"+this.getUserpwd());
		return "main";
	}


}
