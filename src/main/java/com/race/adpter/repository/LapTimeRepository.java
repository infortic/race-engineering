package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.LapTimeEntity;

public interface LapTimeRepository  extends PagingAndSortingRepository<LapTimeEntity,Long> {

}
