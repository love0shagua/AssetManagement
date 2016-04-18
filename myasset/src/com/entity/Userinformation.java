package com.entity;

/**
 * Userinformation entity. @author MyEclipse Persistence Tools
 */

public class Userinformation implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Department department;
	private Roletype roletype;
	private String username;
	private String userpwd;
	private Integer userstate;
	private Integer usersex;

	// Constructors

	/** default constructor */
	public Userinformation() {
	}

	/** full constructor */
	public Userinformation(Department department, Roletype roletype,
			String username, String userpwd, Integer userstate, Integer usersex) {
		this.department = department;
		this.roletype = roletype;
		this.username = username;
		this.userpwd = userpwd;
		this.userstate = userstate;
		this.usersex = usersex;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Roletype getRoletype() {
		return this.roletype;
	}

	public void setRoletype(Roletype roletype) {
		this.roletype = roletype;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public Integer getUserstate() {
		return this.userstate;
	}

	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}

	public Integer getUsersex() {
		return this.usersex;
	}

	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}

}