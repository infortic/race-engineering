package com.race.adpter.readingfiles;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import com.race.adpter.repository.entitys.CircuitEntity;
import com.race.adpter.repository.entitys.ConstructorEntity;
import com.race.adpter.repository.entitys.ConstructorResultsEntity;
import com.race.adpter.repository.entitys.ConstructorStandingEntity;
import com.race.adpter.repository.entitys.DriverEntity;
import com.race.adpter.repository.entitys.DriverStandingEntity;
import com.race.adpter.repository.entitys.LapTimeEntity;
import com.race.adpter.repository.entitys.PitStopsEntity;
import com.race.adpter.repository.entitys.QualifyingEntity;
import com.race.adpter.repository.entitys.RacesEntity;
//import com.race.adpter.repository.entitys.QualifyingEntity;
//import com.race.adpter.repository.entitys.RacesEntity;
import com.race.adpter.repository.entitys.ResultsEntity;
import com.race.adpter.repository.entitys.SeansonsEntity;
//import com.race.adpter.repository.entitys.SeansonsEntity;
import com.race.adpter.repository.entitys.SprintResultEntity;
import com.race.adpter.repository.entitys.StatusEntity;
import com.race.adpter.util.Util;

@Service
public class ReadFile {

	private Util util = new Util();
	
		//1
		public List<CircuitEntity> readCircuit() throws IOException{ 
			List<CircuitEntity> list = new ArrayList<CircuitEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/circuits.csv")) {
				CircuitEntity entity = CircuitEntity.with()
						 .circuitId(Long.valueOf(item[0]))
						 .circuitRef(item[1])
						 .name(item[2])
						 .location(item[3])
						 .country(item[4])
						 .lat(new BigDecimal(item[5]))
						 .lng(new BigDecimal(item[6]))
						 .url(item[8]).build();
					if(!item[7].equals("N")){
						entity.setAlt(new BigInteger(item[7]));
					}
					
					list.add(entity);
			}
			return list;
		}	
		
		//2
		public List<ConstructorResultsEntity> readConstructorResult() throws IOException{ 
			List<ConstructorResultsEntity> list = new ArrayList<ConstructorResultsEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/constructor_results.csv")) {
				ConstructorResultsEntity entity = ConstructorResultsEntity.with()
						.constructorResultId(Long.valueOf(item[0]))
						.raceld(Long.valueOf(item[1]))
						.constructorId(Long.valueOf(item[2]))						 
						.points(new BigDecimal(item[3]))
						.status(item[4])
						.build();
				list.add(entity);
			}
			return list;
		}	
		//3
		public List<ConstructorStandingEntity> readConstructorStandings() throws IOException{ 
			List<ConstructorStandingEntity> list = new ArrayList<ConstructorStandingEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/constructor_standings.csv")) {
				ConstructorStandingEntity entity = ConstructorStandingEntity.with()
						.constructorStandingId(Long.valueOf(item[0]))
						.raceld(Long.valueOf(item[1]))
						.constructorld(Long.valueOf(item[2]))
						.points(new BigDecimal(item[3]))
						.position(Integer.valueOf(item[4]))
						.posiotionText(item[5])
						.wins(Integer.valueOf(item[6]))
						.build();
				list.add(entity);
			}
			return list;
		}	
		//4 nao implementado
		public List<ConstructorEntity> readConstructors() throws IOException{ 
			List<ConstructorEntity> list = new ArrayList<ConstructorEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/constructors.csv")) {
				ConstructorEntity entity = ConstructorEntity.with()
						.constructorId(Long.valueOf(item[0]))
						.constructorRef(item[1])
						.name(item[2])
						.nationality(item[3])
						.url(item[4])
						 .build();
				list.add(entity);
			}
			return list;
		}	
		//5
		public List<DriverStandingEntity> readDriverStandings() throws IOException{ 
			List<DriverStandingEntity> list = new ArrayList<DriverStandingEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/driver_standings.csv")) {
				DriverStandingEntity entity = DriverStandingEntity.with()
						.driverStandingId(Long.valueOf(item[0]))
						.raceld(Long.valueOf(item[1]))
						.driverId(Long.valueOf(item[2]))
						.points(new BigDecimal(item[3]))
						.position(Integer.valueOf(item[4]))
						.positionText(item[5])
						.wins(Integer.valueOf(6))
						.build();					
				list.add(entity);
			}
			return list;
		}	
		//6
		public List<DriverEntity> readDrivers() throws IOException{ 
			List<DriverEntity> list = new ArrayList<DriverEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/drivers.csv")) {
				DriverEntity entity = DriverEntity.with()
						.driverId(Long.valueOf(item[0]))
						.driverRef(item[1])
						.number(item[2])
						.code(item[3])
						.forename(item[4])
						.surname(item[5])
						.dob(item[6])
						.nationality(item[7])
						.url(item[8])
						.build();
				list.add(entity);
			}
			return list;
		}	
		//7
		public List<LapTimeEntity> readLapTimes() throws IOException{ 
			List<LapTimeEntity> list = new ArrayList<LapTimeEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/lap_times.csv")) {
				LapTimeEntity entity = LapTimeEntity.with()
						.raceId(Long.valueOf(item[0]))
						.driverId(Long.valueOf(item[1]))
						.lap(Integer.valueOf(item[2]))
						.position(Integer.valueOf(item[3]))
						.time(item[4])
						.milliseconds(Integer.valueOf(5))
						.build();
				list.add(entity);
			}
			return list;
		}	
		//8
		public List<PitStopsEntity> readPitStops() throws IOException{ 
			List<PitStopsEntity> list = new ArrayList<PitStopsEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/pit_stops.csv")) {
				PitStopsEntity entity = PitStopsEntity.with()
						.raceId(Long.valueOf(item[0]))
						.driverId(Long.valueOf(item[1]))
						.Stop(Integer.valueOf(item[2]))
						.lap(Integer.valueOf(item[3]))
						.time(item[4])
						.duration(item[5])
						.milliseconds(Integer.valueOf(item[6]))
						.build();
				list.add(entity);
			}
			return list;
		}	
		//9
		public List<QualifyingEntity> readQualifying() throws IOException{ 
			List<QualifyingEntity> list = new ArrayList<QualifyingEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/qualifying.csv")) {
				QualifyingEntity entity = QualifyingEntity.with()
						.raceId(null)
						.build();
				list.add(entity);
			}
			return list;
		}	
		//10
		public List<RacesEntity> readRaces() throws IOException{ 
			List<RacesEntity> list = new ArrayList<RacesEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/races.csv")) {}
				RacesEntity entity = RacesEntity.with()
						.raceId(null)
						.build();
				list.add(entity);
			
			return list;
		}	
		
		public List<ResultsEntity> readResults() throws IOException{ 
			List<ResultsEntity> list = new ArrayList<ResultsEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/results.csv")) {
				ResultsEntity entity = ResultsEntity.with()
						.resultId(Long.valueOf(item[0]))
						.raceId(Long.valueOf (item[1]))
						.driverId(Long.valueOf (item[2]))
						.constructorId(Long.valueOf (item[3]))
						.number(item[4])
						.grid(Integer.valueOf(item[5]))
						.position(item[6])
						.positionText(item[7])
						.positionOrder(Integer.valueOf(item[8]))
						.points(new BigDecimal(item[9]))
						.laps(Integer.valueOf(item[10]))
						.time(item[11])
						.milliseconds(item[12])
						.fastestLap(item[13])
						.rank(item[14])
						.fastestLapTime(item[15])
						.fastestLapSpeed(item[16])
				        .statusId(Long.valueOf(item[17]))
				    
				      .build();
				list.add(entity);
			}
			return list;
		}	
		
		public List<SeansonsEntity> readSeasons() throws IOException{ 
			List<SeansonsEntity> list = new ArrayList<SeansonsEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/seasons.csv")) {
				SeansonsEntity entity = SeansonsEntity.with()
						.yearText(null)
						.build();
				list.add(entity);
			}
			return list;
		}	
		
		public List<SprintResultEntity> readSprintResults() throws IOException{ 
			List<SprintResultEntity> list = new ArrayList<SprintResultEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/sprint_results.csv")) {
				SprintResultEntity entity = SprintResultEntity.with()
							
						.resultId(Long.valueOf(item[0]))
						.raceId(Long.valueOf (item[1]))
						.driverId(Long.valueOf (item[2]))
						.constructorId(Long.valueOf (item[3]))
						.number(Integer.valueOf(item[4]))
						.grid(Integer.valueOf(item[5]))
						.position(item[6])
						.positionText(item[7])
						.positionOrder(item[8])
						.points(new BigDecimal(item[9]))
						.laps(item[10])
						.time(item[11])
						.milliseconds(item[12])
						.fastestLap(item[13])
						.fastestLapTime(item[14])
				        .statusId(Long.valueOf(item[15]))
						.build();
				list.add(entity);
			}
			return list;
		}	
		
		public List<StatusEntity> readStatus() throws IOException{ 
			List<StatusEntity> list = new ArrayList<StatusEntity>();
			for (String[] item : util.readCsvFiles("src/main/resources/csv/sprint_results.csv")) {
				StatusEntity entity = StatusEntity.with()
							.statusId(Long.valueOf(item[0]))
							.status(item[1])
							.build();
				list.add(entity);
			}
			return list;
		}	
	
}
