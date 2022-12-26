package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.CircuitEntity;
import com.race.adpter.repository.entitys.QualifyingEntity;

public interface QualifyingRepository extends PagingAndSortingRepository<QualifyingEntity, Long> {
	
}
