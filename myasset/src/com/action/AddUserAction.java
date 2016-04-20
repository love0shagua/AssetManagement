package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;
import com.entity.Userinformation;
public class AddUserAction extends ActionSupport {
	private Userinformation userinformation;
	private IUserService userService;
	public Userinformation getUserinformation() {
		return userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String addUser(){
		
		userService.addUser(userinformation);
		return "add";
	}
}
