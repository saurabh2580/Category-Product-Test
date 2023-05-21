package com.api.nimapinfotechTest.service;

import com.api.nimapinfotechTest.model.dto.ProductDTO;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface ProductService {

	public List<ProductDTO> getAllProducts();

	public ProductDTO getProductById(Integer productId) throws NotFoundException;

	public ProductDTO createProduct(ProductDTO productDTO) throws NotFoundException;

	public ProductDTO updateProduct(Integer productId, ProductDTO productDTO) throws NotFoundException;

	public void deleteProduct(Integer productId) throws NotFoundException;

	public Page<Product> productwithPage(int offset, int pageSize);

}
