package com.stack2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="StackUsers")
public class User {
	@Id
	private int uid;
	private String uname;
	private String uemail;
	private long umob;
	private String address;
	private String password;
	private boolean isCustomer;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String uemail, long umob, String address, String password, boolean isCustomer) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.umob = umob;
		this.address = address;
		this.password = password;
		this.isCustomer = isCustomer;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public long getUmob() {
		return umob;
	}
	public void setUmob(long umob) {
		this.umob = umob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isCustomer() {
		return isCustomer;
	}
	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", umob=" + umob + ", address="
				+ address + ", password=" + password + ", isCustomer=" + isCustomer + "]";
	}


}
