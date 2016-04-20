package com.service;

import com.entity.Userinformation;

public interface IUserService {
	public Userinformation getLoginUser(Integer userid,String userpwd);
	public void addUser(Userinformation userinformation);
}
