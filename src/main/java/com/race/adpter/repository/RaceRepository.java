package com.race.adpter.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.race.adpter.repository.entitys.RacesEntity;

public interface RaceRepository extends PagingAndSortingRepository<RacesEntity, Long> {
	 
	 @Query("select r from RacesEntity r where r.raceId in(?1) order by r.yearTextss asc")
	List<RacesEntity> findByRaceIds(List <Long> raceId);
	
	
}
