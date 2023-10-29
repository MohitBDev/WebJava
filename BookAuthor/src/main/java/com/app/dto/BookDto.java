package com.app.dto;



public class BookDto {
	private Long bid;
	private String bname;

	private String category;
	
	private double price; 

	private Long authorid;

	public String getBname() {
		return bname;
	}
	

	public Long getBid() {
		return bid;
	}


	public void setBid(Long bid) {
		this.bid = bid;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getAuthorid() {
		return authorid;
	}

	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}

	@Override
	public String toString() {
		return "BookDto [bname=" + bname + ", category=" + category + ", price=" + price + ", authorid=" + authorid
				+ "]";
	}

	public BookDto() {
		super();
	}
	

}
