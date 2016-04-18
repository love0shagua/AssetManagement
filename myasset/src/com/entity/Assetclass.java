package com.entity;

/**
 * Assetclass entity. @author MyEclipse Persistence Tools
 */

public class Assetclass implements java.io.Serializable {

	// Fields

	private Integer assetclassid;
	private String assetclasscoding;
	private String assetclassname;
	private Integer iassetclassid;
	private String iassetclassname;

	// Constructors

	/** default constructor */
	public Assetclass() {
	}

	/** full constructor */
	public Assetclass(String assetclasscoding, String assetclassname,
			Integer iassetclassid, String iassetclassname) {
		this.assetclasscoding = assetclasscoding;
		this.assetclassname = assetclassname;
		this.iassetclassid = iassetclassid;
		this.iassetclassname = iassetclassname;
	}

	// Property accessors

	public Integer getAssetclassid() {
		return this.assetclassid;
	}

	public void setAssetclassid(Integer assetclassid) {
		this.assetclassid = assetclassid;
	}

	public String getAssetclasscoding() {
		return this.assetclasscoding;
	}

	public void setAssetclasscoding(String assetclasscoding) {
		this.assetclasscoding = assetclasscoding;
	}

	public String getAssetclassname() {
		return this.assetclassname;
	}

	public void setAssetclassname(String assetclassname) {
		this.assetclassname = assetclassname;
	}

	public Integer getIassetclassid() {
		return this.iassetclassid;
	}

	public void setIassetclassid(Integer iassetclassid) {
		this.iassetclassid = iassetclassid;
	}

	public String getIassetclassname() {
		return this.iassetclassname;
	}

	public void setIassetclassname(String iassetclassname) {
		this.iassetclassname = iassetclassname;
	}

}