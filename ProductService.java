package com.api.nimapinfotechTest.service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.api.nimapinfotechTest.model.Product;

public interface ProductService {

	public Product createProduct(Product pro);// new create product

	public List<Product> getAllProduct();// get All product

	public Product getProductById(Integer cId) throws NotFoundException; // get product by id

	public Product updateProductById(Integer pId, Product updatePro) throws NotFoundException; // update by id

	public void deleteProductById(Integer pId) throws NotFoundException;// delete product by id

}
