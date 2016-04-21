package com.dao;

import java.util.List;

public interface IUserDao {
	public List getLoginUser(Integer userid,String userpwd);
	public boolean add(Object o);
    public List getUserList();
}
