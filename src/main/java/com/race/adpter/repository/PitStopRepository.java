package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.PitStopsEntity;

public interface PitStopRepository  extends PagingAndSortingRepository<PitStopsEntity,Long> {

}
