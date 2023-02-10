package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
