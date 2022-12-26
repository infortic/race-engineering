package com.race.adpter.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.race.adpter.repository.entitys.ConstructorResultsEntity;
import com.race.adpter.repository.entitys.SeansonsEntity;

public interface SeansonsRepository   extends PagingAndSortingRepository<SeansonsEntity, Long>{

}
