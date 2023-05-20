package com.api.nimapinfotechTest.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	private String CategoryName;
	private String CategoryAbout;

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL) 
	private Set<Product> product;

	public Set<Product> getProduct(Set<Product> product) {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Category(Integer cId, String categoryName, String categoryAbout) {
		super();
		this.cId = cId;
		this.CategoryName = categoryName;
		this.CategoryAbout = categoryAbout;
	}

	public Category() {
		super();
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getCategoryAbout() {
		return CategoryAbout;
	}

	public void setCategoryAbout(String categoryAbout) {
		CategoryAbout = categoryAbout;
	}

	@Override
	public String toString() {
		return "Category [cId=" + cId + ", CategoryName=" + CategoryName + ", CategoryAbout=" + CategoryAbout + "]";
	}

}
