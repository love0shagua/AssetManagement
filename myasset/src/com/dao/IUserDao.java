package com.dao;

import java.util.List;

import com.entity.Userinformation;

public interface IUserDao {
	public List getLoginUser(Integer userid,String userpwd);
	public boolean add(Object o);
    public List getUserList();
    public Userinformation getUser(Integer userid);
    public boolean saveOrUpdateUser(Object o);
    public boolean deleteUser(Object o);
}
