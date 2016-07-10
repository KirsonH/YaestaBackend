package com.yaesta.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaesta.persistence.entity.Category;
import com.yaesta.persistence.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getCategories(){
		return categoryRepository.findAll();
	}
	
	public Category findByVitexId(String vitexId){
		return categoryRepository.findByVitexId(vitexId);
	}
}
