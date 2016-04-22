package com.service.impl;

import java.util.List;

import com.dao.IAssetClassDao;
import com.dao.IUserDao;
import com.entity.Assetclass;
import com.entity.Userinformation;
import com.service.IAssetClassService;
import com.service.IUserService;

public class AssetClassService implements IAssetClassService {
	private IAssetClassDao assetClassDao;

	
	
	public IAssetClassDao getAssetClassDao() {
		return assetClassDao;
	}



	public void setAssetClassDao(IAssetClassDao assetClassDao) {
		this.assetClassDao = assetClassDao;
	}



	public boolean addAssetClass(Assetclass assetclass) {
		return assetClassDao.addAssetClass(assetclass);
	}
	
	public boolean removeAssetClass(Assetclass assetclass) {
		return assetClassDao.removeAssetClass(assetclass);
	}
	
	public boolean updateAssetClass(Assetclass assetclass){
		return assetClassDao.updateAssetClass(assetclass);
	}
	
	public List findAllAssetClass(){
		return assetClassDao.findAllAssetClass();
	}
	
	public Assetclass findAssetClass(int id){
		return assetClassDao.findAssetClass(id);
	}

}
