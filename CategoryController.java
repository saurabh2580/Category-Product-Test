package com.api.nimapinfotechTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.nimapinfotechTest.model.Category;
import com.api.nimapinfotechTest.service.imp.CategoryServiceImp;

@RestController
public class CategoryController {

	@Autowired
	private CategoryServiceImp service;

	@GetMapping("/api/categories?page=3")
	public ResponseEntity<List<Category>> getAllCategory() {
		List<Category> allCategory = this.service.getAllCategory();
		return ResponseEntity.ok(allCategory);
	}

	@PostMapping("/api/categories")
	public ResponseEntity<Category> createCategory(@RequestBody Category cat) {
		Category createCategory = this.service.createCategory(cat);
		return new ResponseEntity<Category>(createCategory, HttpStatus.CREATED);
	}

	@PutMapping("/api/categories/{cId}")
	public ResponseEntity<Category> updateCategory(@PathVariable Integer cId, @RequestBody Category cat)
			throws NotFoundException {
		Category updateCategory = this.service.updateCategory(cId, cat);
		return new ResponseEntity<Category>(updateCategory, HttpStatus.OK);
	}

	@GetMapping("/api/categories/{cId}")
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer cId) throws NotFoundException {
		Category getCategory = this.service.getCategoryById(cId);
		return new ResponseEntity<Category>(getCategory, HttpStatus.OK);
	}

	@DeleteMapping("/api/categories/{cId}")
	public ResponseEntity<String> deleteCategory(@PathVariable Integer cId) throws NotFoundException {
		this.service.deleteCategory(cId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
