package com.api.nimapinfotechTest.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.api.nimapinfotechTest.model.Category;

public interface CategoryService {

	public List<Category> getAllCategory(); // get

	public Category createCategory(Category ca); // create

	public Category updateCategory(Integer cId, Category ca) throws NotFoundException; // update

	public Category getCategoryById(Integer cId) throws NotFoundException; // getById

	public void deleteCategory(Integer cId) throws NotFoundException; // deleteById

}
