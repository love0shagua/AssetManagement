package com.service.impl;

import java.util.List;

import com.dao.IUserDao;
import com.entity.Userinformation;
import com.service.IUserService;

public class UserService implements IUserService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public Userinformation getLoginUser(Integer userid,String userpwd) {
		List list=userDao.getLoginUser(userid,userpwd);
		if(list!=null&&list.size()==1){
			return (Userinformation)list.get(0);
		}
		else
		return null;
	}
	public void addUser(Userinformation userinformation) {
		this.userDao.add(userinformation);
	}
	
    public List getUserList() {
		
		return this.userDao.getUserList();
	}
    public Userinformation getUser(Integer userid){
    	return userDao.getUser(userid);
    }
    public void saveOrUpdateUser(Userinformation userinformation) {
    	 
    	userDao.saveOrUpdateUser(userinformation);
		
	}
}
