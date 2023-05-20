package com.api.nimapinfotechTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Pro_Id")
	private Integer pId;
	private String ProductName;
	private double ProductPrice;
	private int ProductStock;
	private int ProductQuantity;
	private boolean isAvailable;
	private String ProductAbout;

	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product() {
		super();
	}

	public Product(Integer pId, String productName, double productPrice, int productStock, int productQuantity,
			boolean isAvailable, String productAbout) {
		super();
		this.pId = pId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductStock = productStock;
		ProductQuantity = productQuantity;
		this.isAvailable = isAvailable;
		ProductAbout = productAbout;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}

	public int getProductStock() {
		return ProductStock;
	}

	public void setProductStock(int productStock) {
		ProductStock = productStock;
	}

	public int getProductQuantity() {
		return ProductQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getProductAbout() {
		return ProductAbout;
	}

	public void setProductAbout(String productAbout) {
		ProductAbout = productAbout;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ ", ProductStock=" + ProductStock + ", ProductQuantity=" + ProductQuantity + ", isAvailable="
				+ isAvailable + ", ProductAbout=" + ProductAbout + "]";
	}

}
