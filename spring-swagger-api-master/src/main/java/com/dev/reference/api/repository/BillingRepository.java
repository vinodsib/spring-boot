package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.Billing;

public interface BillingRepository extends PagingAndSortingRepository<Billing, Long>  {

}
