package com.nit.java8.stream;

public class Product {
	
	private String brandName;
	private long price;
	private String priceInString;
	
	
	public Product(String brandName, long price, String priceInString) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.priceInString=priceInString;
	}
	


	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}



	public String getPriceInString() {
		return priceInString;
	}



	public void setPriceInString(String priceInString) {
		this.priceInString = priceInString;
	}



	@Override
	public String toString() {
		return "[brandName=" + brandName + ", price=" + price + ", priceInString=" + priceInString + "]";
	}
	
	
	

}
