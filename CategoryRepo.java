package com.api.nimapinfotechTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.nimapinfotechTest.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
