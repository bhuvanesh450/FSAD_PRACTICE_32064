package com.klu.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product()
	{
		this.productId=101;
		this.productName="watch";
		this.price=75000.00;
		this.category="Electronics";
	}
	public int getProductId()
	{
		return productId;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getProductPrice()
	{
		return price;
	}
	
	public String getProductCategory()
	{
		return category;
	}
	

}
