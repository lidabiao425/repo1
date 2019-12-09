package com.neuedu.pojo;

import java.util.Date;
import java.util.List;

public class User {

	
	private String uname;
	
	private double height;
	
	private int age;
	
	private boolean mar;
	
	private Date birthday;	

	private Address address;
	
	private List<Address> addrList;
	
	public List<Address> getAddrList() {
		return addrList;
	}

	public void setAddrList(List<Address> addrList) {
		this.addrList = addrList;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMar() {
		return mar;
	}

	public void setMar(boolean mar) {
		this.mar = mar;
	}
	
	
}
