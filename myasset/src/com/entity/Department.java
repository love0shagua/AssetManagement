package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer departmentid;
	private String departmentname;
	private Set userinformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String departmentname, Set userinformations) {
		this.departmentname = departmentname;
		this.userinformations = userinformations;
	}

	// Property accessors

	public Integer getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Set getUserinformations() {
		return this.userinformations;
	}

	public void setUserinformations(Set userinformations) {
		this.userinformations = userinformations;
	}

}