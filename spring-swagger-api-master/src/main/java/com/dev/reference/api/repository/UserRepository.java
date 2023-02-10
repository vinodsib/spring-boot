package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
