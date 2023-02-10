package com.dev.reference.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.reference.api.domain.AiResult;
import com.dev.reference.api.domain.Category;

import com.dev.reference.api.domain.Product;
import com.dev.reference.api.domain.User;
import com.dev.reference.api.repository.AiResultRepository;
import com.dev.reference.api.repository.CategoryRepository;
import com.dev.reference.api.repository.ProductRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private AiResultRepository aiResultRepository;


	/*
	 * This API is used to fetch all Product Details
	 */
	@GetMapping("/all")
	@ApiOperation(value = "Fetch all Product Details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AiResult.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Error") })
	public List<Product> allProducts() {
		System.out.println("==> Inside allProducts() <==");
		List<Product> product = (List<Product>) productRepository.findAll();

		return product;
	}

	/**
	 * Find by user <code>id</code>
	 * 
	 * @param id user's id
	 * 
	 * @return the {@link User} object
	 */
	@GetMapping("/{id}")
	@ApiOperation(value = "Fetch a Product")
	public Optional<Product> getUser(@PathVariable Long id) {
		System.out.println("==> Inside getUser() <==");
		return productRepository.findById(id);
	}

	/**
	 * This API is used to Add Product
	 * 
	 * @param User
	 * @return User
	 */
	@RequestMapping(path = "/addProduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add a Product")
	public Product createUser(@RequestBody Product product) {
		System.out.println("==> Inside Create Product <== " + product);
		Product savedProduct = productRepository.save(product);

		return savedProduct;
	}

	/**
	 * Updates the user
	 * 
	 * @param product
	 * @return
	 */
	@RequestMapping(path = "/update", method = RequestMethod.PUT)
	@ApiOperation(value = "Update a Product")
	public Product update(@RequestBody Product product) {
		Product updatedProduct = productRepository.save(product);

		return updatedProduct;
	}

	/**
	 * Deletes user identified with <code>id</code>
	 * 
	 * @param id
	 */
	@RequestMapping(path = "/{product_id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete a product")
	public void delete(@PathVariable("product_id") Long id) {
		productRepository.deleteById(id);
	}
	
	/*
	 * This API is used to fetch all Category Details
	 */
	@GetMapping("/category/all")
	@ApiOperation(value = "Fetch all Category Details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = AiResult.class),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server Error") })
	public List<Category> allCategories() {
		System.out.println("==> Inside allCategories() <==");
		List<Category> categories = (List<Category>) categoryRepository.findAll();

		return categories;
	}
	
	/**
	 * Find by Category <code>id</code>
	 * 
	 * @param id Category id
	 * 
	 * @return the {@link User} object
	 */
	@GetMapping("/category/{id}")
	@ApiOperation(value = "Fetch a Product")
	public Optional<Category> getCategory(@PathVariable Long id) {
		System.out.println("==> Inside getCategory() <==");
		return categoryRepository.findById(id);
	}
	/**
	 * This API is used to Add category
	 * 
	 * @param Category
	 * @return category
	 */
	@RequestMapping(path = "/category/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add a Category")
	public Category createUser(@RequestBody Category category) {
		System.out.println("==> Inside Create Product <== " + category);
		Category savedcategory = categoryRepository.save(category);

		return savedcategory;
	}
	/**
	 * Updates the Category
	 * 
	 * @param Category
	 * @return updatedCategory
	 */
	@RequestMapping(path = "/category/update", method = RequestMethod.PUT)
	@ApiOperation(value = "Update a category")
	public Category update(@RequestBody Category category) {
		Category updatedCategory = categoryRepository.save(category);

		return updatedCategory;
	}
	
	/**
	 * Deletes Category identified with <code>id</code>
	 * 
	 * @param id
	 */
	@RequestMapping(path = "/category/{category_id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete a product")
	public void delete1(@PathVariable("category_id") Long id) {
		categoryRepository.deleteById(id);
	}
	@RequestMapping(path = "/aiResult", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "AiResult ")
	public AiResult createUser(@RequestBody AiResult aiResult) {
		System.out.println("==> Inside AiResult <== " + aiResult);
		AiResult savedaiResult = aiResultRepository.save(aiResult);

		return savedaiResult;
	}
}
