package com.dao;

import java.util.List;

import com.entity.Assetclass;

public interface IAssetClassDao {
	public boolean addAssetClass(Object obj);
	public boolean removeAssetClass(Object obj);
	public boolean updateAssetClass(Object obj);
	public Assetclass findAssetClass(int id);
	public List findAllAssetClass();
}
