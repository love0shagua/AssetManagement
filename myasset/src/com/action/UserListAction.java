package com.action;

import com.entity.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;
import java.util.List;

public class UserListAction extends ActionSupport {
	private IUserService userService;
	private List users;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public List getUsers() {
		return users;
	}
	public void setUsers(List users) {
		this.users = users;
	}
	
	public String userList(){
		this.users = userService.getUserList(); 
		return SUCCESS;
	}
}
