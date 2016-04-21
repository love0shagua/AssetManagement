package com.action;

import com.entity.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class AddUserAction extends ActionSupport {
	private IUserService userService;
	private String username;
	private String userpwd;
	private Integer userstate;
	private Integer usersex;
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
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public Integer getUserstate() {
		return userstate;
	}
	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}
	public Integer getUsersex() {
		return usersex;
	}
	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}
	
	public String addUser(){
    Userinformation userinformation = new Userinformation();
    userinformation.setUsername(username);
    userinformation.setUserpwd(userpwd);
    userinformation.setUsersex(usersex);
    userinformation.setUserstate(userstate);
    userService.addUser(userinformation);
    return SUCCESS;
	}
}
