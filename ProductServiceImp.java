package com.api.nimapinfotechTest.service.imp;

import com.api.nimapinfotechTest.model.Category;
import com.api.nimapinfotechTest.model.Product;
import com.api.nimapinfotechTest.model.dto.ProductDTO;
import com.api.nimapinfotechTest.repository.CategoryRepository;
import com.api.nimapinfotechTest.repository.ProductRepository;
import com.api.nimapinfotechTest.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(this::convertToProductDTO).collect(Collectors.toList());
	}

	@Override
	public ProductDTO getProductById(Integer productId) throws NotFoundException {
		Product product = getProductIfExists(productId);
		return convertToProductDTO(product);
	}

	@Override
	public ProductDTO createProduct(ProductDTO productDTO) throws NotFoundException {
		Product product = convertToProductEntity(productDTO);
		Category category = getCategoryIfExists(productDTO.getCategoryId());
		product.setCategory(category);
		Product savedProduct = productRepository.save(product);
		return convertToProductDTO(savedProduct);
	}

	@Override
	public ProductDTO updateProduct(Integer productId, ProductDTO productDTO) throws NotFoundException {
		Product existingProduct = getProductIfExists(productId);
		Category category = getCategoryIfExists(productDTO.getCategoryId());

		existingProduct.setProductName(productDTO.getProductName());
		existingProduct.setProductPrice(productDTO.getProductPrice());
		existingProduct.setProductStock(productDTO.getProductStock());
		existingProduct.setProductQuantity(productDTO.getProductQuantity());
		existingProduct.setAvailable(productDTO.isAvailable());
		existingProduct.setProductAbout(productDTO.getProductAbout());
		existingProduct.setCategory(category);

		Product updatedProduct = productRepository.save(existingProduct);
		return convertToProductDTO(updatedProduct);
	}

	@Override
	public void deleteProduct(Integer productId) throws NotFoundException {
		Product product = getProductIfExists(productId);
		productRepository.delete(product);
	}

	private Product getProductIfExists(Integer productId) throws NotFoundException {
		return productRepository.findById(productId).orElseThrow(() -> new NotFoundException());
	}

	private Category getCategoryIfExists(Long categoryId) throws NotFoundException {
		return categoryRepository.findById(categoryId).orElseThrow(() -> new NotFoundException());

	}

	private ProductDTO convertToProductDTO(Product product) {
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(product, productDTO);
		productDTO.setCategoryId(product.getCategory().getId());
		return productDTO;
	}

	private Product convertToProductEntity(ProductDTO productDTO) {
		Product product = new Product();
		BeanUtils.copyProperties(productDTO, product);
		return product;
	}
}
