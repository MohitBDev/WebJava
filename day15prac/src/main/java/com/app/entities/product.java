package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class product extends BaseEntity {
	
	private String pname;
	
	private  int  quantity;
	
	private  double  price;

	private  String Description;
	
	
	public product() {
		
	}
	
	
	
	public product(String pname, int quantity, double price, String description) {
		
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
		this.Description = description;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}



	@Override
	public String toString() {
		return "product [pname=" + pname + ", quantity=" + quantity + ", price=" + price + ", Description="
				+ Description + "]";
	}

	
}
