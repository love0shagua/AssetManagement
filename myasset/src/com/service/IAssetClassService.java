package com.service;

import java.util.List;

import com.entity.Assetclass;
import com.entity.Userinformation;

public interface IAssetClassService {
	public boolean addAssetClass(Assetclass assetclass);
	public boolean removeAssetClass(Assetclass assetclass);
	public boolean updateAssetClass(Assetclass assetclass);
	public Assetclass findAssetClass(int id);
	public List findAllAssetClass();
}
