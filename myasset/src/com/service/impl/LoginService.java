package com.service.impl;

import com.service.ILoginService;
import com.dao.IUserDao;

public class LoginService implements ILoginService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
