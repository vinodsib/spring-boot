package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.AiResult;

public interface AiResultRepository extends PagingAndSortingRepository<AiResult, Long> {

}
