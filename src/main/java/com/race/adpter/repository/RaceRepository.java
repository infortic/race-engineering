package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.CircuitEntity;
import com.race.adpter.repository.entitys.RacesEntity;

public interface RaceRepository extends PagingAndSortingRepository<RacesEntity, Long> {
	
}
