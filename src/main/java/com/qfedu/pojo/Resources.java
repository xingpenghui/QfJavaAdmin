package com.qfedu.pojo;

public class Resources {

	private Integer resid;
	private String resname;
	private Integer pid;
	private String permission;
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Integer getResid() {
		return resid;
	}

	public void setResid(Integer resid) {
		this.resid = resid;
	}

	public String getResname() {
		return resname;
	}

	public void setResname(String resname) {
		this.resname = resname;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
}
