package com.service.impl;

import java.util.List;

import com.dao.IUserDao;
import com.entity.Userinformation;
import com.service.IAssetClassService;
import com.service.IUserService;

public class AssetClassService implements IAssetClassService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean AddAssetClass(Integer userid,String userpwd) {
	
		return true;
	}

}
