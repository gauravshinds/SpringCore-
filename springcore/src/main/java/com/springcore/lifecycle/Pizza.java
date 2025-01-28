package com.springcore.lifecycle;

public class Pizza {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Propertry Set");
		this.price = price;
	}

	public Pizza() {
		super();
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	

}
