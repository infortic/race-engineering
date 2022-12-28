	package com.race.domin.businessrules;
	
	import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
	import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.race.adpter.repository.DriverRepository;
	import com.race.adpter.repository.DriverStandingRepository;
	import com.race.adpter.repository.RaceRepository;
	import com.race.adpter.repository.entitys.DriverEntity;
	import com.race.adpter.repository.entitys.DriverStandingEntity;
	import com.race.adpter.repository.entitys.RacesEntity;
	import com.race.domin.model.DriverWithLongestDistanceBetweenFirstAndLastVictory;
	import com.race.domin.model.PilotsWithVictory;
	
	@Service
	public class Servicos {
		@Autowired
		private DriverStandingRepository driverStandingRepository;
		@Autowired 
		private DriverRepository driverRepository;
		@Autowired
		private RaceRepository raceRepository;
	
		public List<PilotsWithVictory> getpilotsWithVictory(){
			List<DriverStandingEntity> list  = driverStandingRepository.findPilotsWithVictorys();
			return pilotsWinsBuilder(list);
		}
		
		public List<RacesEntity> getpilotsGapVictory(){
			List<DriverStandingEntity> list  = driverStandingRepository.findPilotsWithVictorys();
			List<RacesEntity> racesWins = racesWinsWithDriver(list);
			for(RacesEntity t : racesWins ) {
				System.out.println(t.toString());
			}
			return racesWins;
		}
		
		public void getDriverGapWins(List<RacesEntity> racesWins) {
			RacesEntity gatWinsDriver = new RacesEntity();
			
			for(RacesEntity race : racesWins) {
				
			}
			
			
			//racesWins.stream().forEach(item -> item. );
			
			
		}
		
		private List<PilotsWithVictory> pilotsWinsBuilder(List<DriverStandingEntity> list){
			
			List<PilotsWithVictory> pilotsWithVictoryList = new ArrayList<>(); 
			
			for(DriverStandingEntity driverStanding: list) {
				Long driverIdLong = driverStanding.getDriverId();
				DriverEntity driver = driverRepository.findByDriverId(driverIdLong);
				PilotsWithVictory pilot =	PilotsWithVictory.with()
				.driverId(driver.getDriverRef())
				.givenName(driver.getSurname())
				.familyName(driver.getForename())
				.dateOfBirth(driver.getDob())
				.nationality(driver.getNationality())
				.wins(driverStanding.getWins())
				.build();
				pilotsWithVictoryList.add(pilot);
			}
			
			return pilotsWithVictoryList;
		}
		
		
	private List<RacesEntity> racesWinsWithDriver(List<DriverStandingEntity> list){
			
			List<DriverWithLongestDistanceBetweenFirstAndLastVictory> pilots = new ArrayList<>(); 
			
			List<RacesEntity> racesWins = new ArrayList<>();
			List<Long> raceIds = new ArrayList<>();
			for(DriverStandingEntity driverStanding: list) {
				raceIds.add(driverStanding.getRaceld());
				
				
			}
			
			racesWins = raceRepository.findByRaceIds(raceIds);
			for(DriverStandingEntity driverStanding: list) {
				racesWins.stream().forEach(item -> item.setDriverId(driverStanding.getDriverId()));
			}
			
			
			
			return racesWins;
		}
	
	private RacesEntity getLestWins(List<RacesEntity> racesWins) {
		RacesEntity race = new RacesEntity();
		int v1 = 0;
		for(RacesEntity r : racesWins) {
			Integer v2 = Integer.valueOf(r.getYearTextss());
			if(v1<v2) {
				v1 = v2;
				race = r; 		
			}
		}
		return race;
	}
		
//	private List<RacesEntity> getRacesWinsbydriver(Long driveId) {
//	//	List<DriverStandingEntity> racesWinsbyPilot = driverStandingRepository.findRaceWinsByDriverId(driveId);
//		List<RacesEntity> racesWinsByPilot =  new ArrayList<>();
//		List<Long> ids = new ArrayList<>();
//		for (DriverStandingEntity driver: racesWinsbyPilot) {
//			ids.add(driver.getRaceld());
//		}
//		return raceRepository.findByRaceId(ids);
//	}
	
	
	
}
