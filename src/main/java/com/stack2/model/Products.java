package com.stack2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Products {
	
	@Id
	private int pid;
	private String pname;
	private double price;
	private String category;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int pid, String pname, double price, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", category=" + category + "]";
	}
	

}
