package com.action;

import com.entity.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;

public class DeleteUserAction extends ActionSupport {
	private IUserService userService;
	private Userinformation userinformation;
	private Integer userid;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public Userinformation getUserinformation() {
		return userinformation;
	}
	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	public Userinformation getUser(){
	
		return this.userinformation = userService.getUser(userid);
	}
	public String deleteUser(){
	    userService.deleteUser(getUser());
		return SUCCESS;
	}
}
