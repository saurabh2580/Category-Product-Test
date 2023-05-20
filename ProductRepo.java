package com.api.nimapinfotechTest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.nimapinfotechTest.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
