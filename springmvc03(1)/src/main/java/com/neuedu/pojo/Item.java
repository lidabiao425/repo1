package com.neuedu.pojo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Item {

	private int id;
	
	@Size(min=2,max=10,message="商品名字的字符个数在2-10个之间")
	private String name;
	
	private double price;
	
	@NotNull(message="商品的生产日期不能为空")
	private Date createDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
}
