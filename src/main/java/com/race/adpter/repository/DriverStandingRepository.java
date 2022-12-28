package com.race.adpter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.race.adpter.repository.entitys.DriverStandingEntity;

public interface DriverStandingRepository  extends PagingAndSortingRepository<DriverStandingEntity,Long> {
	
	 @Query("select d from DriverStandingEntity d where d.wins > 0  ")
	  public List<DriverStandingEntity> findPilotsWithVictorys();
	 
	 @Query("select  d from DriverStandingEntity d where d.wins > 0 and d.driverId = ?1 ")
	  public List<DriverStandingEntity> findRaceWinsByDriverId(Long id);

}
