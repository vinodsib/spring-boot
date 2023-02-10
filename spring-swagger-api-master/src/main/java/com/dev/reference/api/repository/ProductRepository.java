package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
