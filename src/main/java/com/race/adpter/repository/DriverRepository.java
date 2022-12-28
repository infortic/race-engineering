package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.DriverEntity;

public interface DriverRepository  extends PagingAndSortingRepository <DriverEntity,Long> {
	
	DriverEntity findByDriverId(Long driverId);

}
