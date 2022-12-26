package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.CircuitEntity;

public interface CircuitRepository extends PagingAndSortingRepository<CircuitEntity, Long> {
	
}
