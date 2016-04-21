package com.action;

import java.util.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import sun.net.www.content.text.Generic;

import com.entity.Assetclass;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAssetClassService;

public class AssetClassAction extends ActionSupport {
	private IAssetClassService assetClassService;
	private Integer assetclassid;
	private String assetclasscoding;
	private String assetclassname;
	private Integer iassetclassid;
	private String iassetclassname;
	private List assetClassList;
	private Assetclass assetclass;
	
	
	public Assetclass getAssetclass() {
		return assetclass;
	}

	public void setAssetclass(Assetclass assetclass) {
		this.assetclass = assetclass;
	}

	public List getAssetClassList() {
		return assetClassList;
	}

	public void setAssetClassList(List assetClassList) {
		this.assetClassList = assetClassList;
	}

	public IAssetClassService getAssetClassService() {
		return assetClassService;
	}

	public Integer getAssetclassid() {
		return assetclassid;
	}

	public void setAssetclassid(Integer assetclassid) {
		this.assetclassid = assetclassid;
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

	
	//添加
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
	//删除
	public String removeAssetClass(){
		Assetclass assetclass = new Assetclass();
		assetclass.setAssetclassid(assetclassid);
		if (assetClassService.removeAssetClass(assetclass)){
			return "ok";
		}else{
			return "no";
		}
	}
	//修改
	public String updateAssetClass(){
		Assetclass assetclass = new Assetclass();
		assetclass.setAssetclassid(assetclassid);
		assetclass.setAssetclasscoding(assetclasscoding);
		assetclass.setAssetclassname(assetclassname);
		assetclass.setIassetclassid(iassetclassid);
		assetclass.setIassetclassname(iassetclassname);
		if (assetClassService.updateAssetClass(assetclass)){
			return "ok";
		}else {
			return "no";
		}
	}
	//查询所有资产分类
	public String findAllAssetClass(){

		this.assetClassList = assetClassService.findAllAssetClass();
		if ( this.assetClassList != null ){
			return SUCCESS;
		}else{
			return "no";
		}
		
	}
	
	//根据id查询资产分类
	public String findAssetClass(){
		this.assetclass = assetClassService.findAssetClass(assetclassid);
		if ( this.assetclass != null ){
			return SUCCESS;
		}else{
			return "no";
		}
	}
}
