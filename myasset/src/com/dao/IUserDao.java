package com.dao;

import java.util.List;

import com.entity.Userinformation;

public interface IUserDao {
	public List getLoginUser(Integer userid,String userpwd);
	 public boolean saveUser(Userinformation userinformation);
}
