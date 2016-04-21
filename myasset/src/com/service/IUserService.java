package com.service;

import java.util.List;

import com.entity.Userinformation;

public interface IUserService {
	public Userinformation getLoginUser(Integer userid,String userpwd);
	public void addUser(Userinformation userinformation);
	public List getUserList();
}
