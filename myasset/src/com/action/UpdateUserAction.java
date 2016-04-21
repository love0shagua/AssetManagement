package com.action;

import com.entity.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;

public class UpdateUserAction extends ActionSupport {
	private IUserService userService;
	private Userinformation userinformation;
	private Integer userid;
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
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
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
	public Userinformation getUserinformation() {
		return userinformation;
	}
	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}
	public String getUser(){
		this.userinformation = userService.getUser(userid);
		return SUCCESS;
	}
	
	public String updateUser(){
		Userinformation userinformation = new Userinformation();
		userinformation.setUserid(userid);
		userinformation.setUsername(username);
		userinformation.setUserpwd(userpwd);
		userinformation.setUsersex(usersex);
	    userinformation.setUserstate(userstate);
		userService.saveOrUpdateUser(userinformation);
		return SUCCESS;
	}

}
