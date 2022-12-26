package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.StatusEntity;

public interface StatusRepository extends PagingAndSortingRepository<StatusEntity,Long> {

}
