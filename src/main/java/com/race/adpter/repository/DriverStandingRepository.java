package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.DriverStandingEntity;

public interface DriverStandingRepository  extends PagingAndSortingRepository<DriverStandingEntity,Long> {

}
