package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.ResultsEntity;

public interface ResultRepository  extends PagingAndSortingRepository<ResultsEntity,Long> {

}
