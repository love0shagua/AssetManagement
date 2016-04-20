package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;
import com.entity.Userinformation;
public class AddUserAction extends ActionSupport {
	
	private IUserService userService;
	private String username;
	
	public IUserService getUserService() {
		return userService;
	}



	public void setUserService(IUserService userService) {
		this.userService = userService;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	


	
	public String addUserInfo(){
		Userinformation userinformation = new Userinformation();
		userinformation.setUsername(username);
	    userService.addUser(userinformation);
		return SUCCESS;
	}
}
