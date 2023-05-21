package com.api.nimapinfotechTest.model.dto;

public class CategoryDTO {

	private Integer cId;
	private String categoryName;
	private String categoryAbout;

	public CategoryDTO() {
	}

	public CategoryDTO(Integer cId, String categoryName, String categoryAbout) {
		this.cId = cId;
		this.categoryName = categoryName;
		this.categoryAbout = categoryAbout;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryAbout() {
		return categoryAbout;
	}

	public void setCategoryAbout(String categoryAbout) {
		this.categoryAbout = categoryAbout;
	}
}
