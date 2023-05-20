package com.api.nimapinfotechTest.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.api.nimapinfotechTest.model.Product;
import com.api.nimapinfotechTest.repository.ProductRepo;
import com.api.nimapinfotechTest.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = this.repo.findAll();
		return list;
	}

	@Override
	public Product createProduct(Product pro) {
		this.repo.save(pro);
		return null;
	}

	@Override
	public Product getProductById(Integer pId) throws NotFoundException {
		Product pro = this.repo.findById(pId).orElseThrow(() -> new NotFoundException());
		return pro;
	}

	@Override
	public Product updateProductById(Integer pId, Product updatePro) throws NotFoundException {
		Product existingProduct = this.repo.findById(pId).orElseThrow(() -> new NotFoundException());
		existingProduct.setProductName(updatePro.getProductName());
		existingProduct.setProductAbout(updatePro.getProductAbout());
		existingProduct.setProductPrice(updatePro.getProductPrice());
		existingProduct.setProductQuantity(updatePro.getProductQuantity());
		existingProduct.setAvailable(updatePro.isAvailable());
		existingProduct.setCategory(updatePro.getCategory());
		existingProduct.setProductStock(updatePro.getProductStock());
		repo.save(existingProduct);
		return existingProduct;
	}

	@Override
	public void deleteProductById(Integer pId) throws NotFoundException {
		Product pro = this.repo.findById(pId).orElseThrow(() -> new NotFoundException());
		repo.delete(pro);
	}
}
