package com.api.nimapinfotechTest.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.api.nimapinfotechTest.model.Category;

public interface CategoryServiceIn {

	public Category createCategory(Category cat); // create

	public Category getCategoryById(Long categoryId) throws NotFoundException;

	public void deleteCategory(Long categoryId) throws NotFoundException;

	public Category updateCategory(Long categoryId, Category categoryDetails) throws NotFoundException;

	public List<Category> getAllCategories();

}
