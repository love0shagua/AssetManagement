package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;

public class LoginAction extends ActionSupport {
	
	private IUserService userService;
	private Integer userid;
	private String userpwd;
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	
	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	
	public String execute() {
		userService.getLoginUser(userid, userpwd);
		return SUCCESS;
	}


}
