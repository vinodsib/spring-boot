package com.dev.reference.api.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dev.reference.api.domain.Favourites;

public interface FavouritesRepository extends PagingAndSortingRepository<Favourites,Long> {

}
