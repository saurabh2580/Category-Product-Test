package com.api.nimapinfotechTest.model.dto;

public class ProductDTO {

	private Integer productId;
	private String productName;
	private double productPrice;
	private int productStock;
	private int productQuantity;
	private boolean available;
	private String productAbout;
	private Long categoryId;

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Integer productId, String productName, double productPrice, int productStock, int productQuantity,
			boolean available, String productAbout, Long categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productQuantity = productQuantity;
		this.available = available;
		this.productAbout = productAbout;
		this.categoryId = categoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getProductAbout() {
		return productAbout;
	}

	public void setProductAbout(String productAbout) {
		this.productAbout = productAbout;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long long1) {
		this.categoryId = long1;
	}

}
