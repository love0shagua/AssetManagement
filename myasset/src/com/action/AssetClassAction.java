package com.action;

import com.entity.Assetclass;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAssetClassService;

public class AssetClassAction extends ActionSupport {
	private IAssetClassService assetClassService;
	private String assetclasscoding;
	private String assetclassname;
	private Integer iassetclassid;
	private String iassetclassname;
	
	public IAssetClassService getAssetClassService() {
		return assetClassService;
	}

	public void setAssetClassService(IAssetClassService assetClassService) {
		this.assetClassService = assetClassService;
	}

	public String getAssetclasscoding() {
		return assetclasscoding;
	}

	public void setAssetclasscoding(String assetclasscoding) {
		this.assetclasscoding = assetclasscoding;
	}

	public String getAssetclassname() {
		return assetclassname;
	}

	public void setAssetclassname(String assetclassname) {
		this.assetclassname = assetclassname;
	}

	public Integer getIassetclassid() {
		return iassetclassid;
	}

	public void setIassetclassid(Integer iassetclassid) {
		this.iassetclassid = iassetclassid;
	}

	public String getIassetclassname() {
		return iassetclassname;
	}

	public void setIassetclassname(String iassetclassname) {
		this.iassetclassname = iassetclassname;
	}

	
	
	public String addAssetClass() {
		Assetclass assetclass = new Assetclass();
		assetclass.setAssetclasscoding(assetclasscoding);
		assetclass.setAssetclassname(assetclassname);
		assetclass.setIassetclassid(iassetclassid);
		assetclass.setIassetclassname(iassetclassname);
		if (assetClassService.addAssetClass(assetclass)){
			return "ok";
		}else {
			return "no";
		}
	
		
		
		
	}
	
}
