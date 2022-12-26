package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.ConstructorEntity;
import com.race.adpter.repository.entitys.ConstructorResultsEntity;

public interface ConstructorRepository   extends PagingAndSortingRepository<ConstructorEntity, Long>{

}
