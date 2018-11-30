package com.qfedu.pojo;

import java.util.List;

public class User {

	private Integer uid;
	private String username;
	private String password;
	private String realname;
	private String sex;
	private String phone;
	private String registertime;
	private String loginTime;

/*	private List<Blog> blogList;*/
	
	
	
	
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	/*public List<Blog> getBlogList() {
		return blogList;
	}
	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}*/
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegistertime() {
		return registertime;
	}
	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
