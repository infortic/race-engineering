package com.race.adpter.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.race.adpter.readingfiles.ReadFile;
import com.race.adpter.repository.CircuitRepository;
import com.race.adpter.repository.ConstructorRepository;
import com.race.adpter.repository.ConstructorResultRepository;
import com.race.adpter.repository.ConstructorStandingRepository;
import com.race.adpter.repository.DriverRepository;
import com.race.adpter.repository.DriverStandingRepository;
import com.race.adpter.repository.LapTimeRepository;
import com.race.adpter.repository.PitStopRepository;
import com.race.adpter.repository.QualifyingRepository;
import com.race.adpter.repository.RaceRepository;
import com.race.adpter.repository.ResultRepository;
import com.race.adpter.repository.SeansonsRepository;
import com.race.adpter.repository.SprintResultRepository;
import com.race.adpter.repository.StatusRepository;

@Service
@EnableAsync
public class ConfigurationUpApplication extends RouteBuilder {

	@Autowired
	private CircuitRepository movimentoRepository;
	@Autowired
	private ConstructorResultRepository constructorResultRepository;
	@Autowired
	private ConstructorStandingRepository constructorStandingRepository;
	@Autowired
	private DriverStandingRepository driverStandingRepository;
	@Autowired
	private DriverRepository driverRepository;
	@Autowired
    private ReadFile readFile;
	@Autowired
	private LapTimeRepository lapTimeRepository;
	@Autowired
	private PitStopRepository pitStopRepository;
	@Autowired
	private ResultRepository resultRepository;
	@Autowired
	private SprintResultRepository sprintResultRepository;
	@Autowired
	private StatusRepository statusRepository;
	@Autowired
	private QualifyingRepository qualifyingRepository;
	@Autowired
	private RaceRepository raceRepository;
	@Autowired
	private SeansonsRepository seansonsRepository;
	@Autowired
	private ConstructorRepository constructorRepository;
	
	@Override
	public void configure() throws Exception {
		
		from("timer://foo?repeatCount=1")
		.process(new inclusaoDadosProcess())
		.to("log: masa de dados incluida");
		
	}
	public class inclusaoDadosProcess implements Processor{

		@Override
		public void process(Exchange exchange) throws Exception {
			log.info("Iniciando Escrita Banco de Dados");
		//	movimentoRepository.saveAll(readFile.readCircuit());
			log.info("Circuit.csv incluido");
	//		constructorResultRepository.saveAll(readFile.readConstructorResult());
			log.info("ConstructorResult.csv incluido");
	//		constructorStandingRepository.saveAll(readFile.readConstructorStandings());
			log.info("ConstructorStandings.csv incluido");
			driverStandingRepository.saveAll(readFile.readDriverStandings());
			log.info("DriverStandings.csv incluido");
			driverRepository.saveAll(readFile.readDrivers());
			log.info("Drivers.csv incluido");
//			lapTimeRepository.saveAll(readFile.readLapTimes());
			log.info("LapTimes.csv incluido");
//			pitStopRepository.saveAll(readFile.readPitStops());
			log.info("PitStops.csv incluido");
//			resultRepository.saveAll(readFile.readResults());
			log.info("Results.csv incluido");
///			sprintResultRepository.saveAll(readFile.readSprintResults());
			log.info("SprintResults.csv incluido");
	//		statusRepository.saveAll(readFile.readStatus());
			log.info("Status.csv incluido");
		//	qualifyingRepository.saveAll(readFile.readQualifying());
			log.info("Qualifying.csv incluido");
			raceRepository.saveAll(readFile.readRaces());
			log.info("Races.csv incluido");
//	seansonsRepository.saveAll(readFile.readSeasons());
			log.info("Seasons.csv incluido");
//			constructorRepository.saveAll(readFile.readConstructors());
			log.info("Constructors.csv incluido");
			log.info("Alimentação do banco de dados concluída");
			
		}

	}
	
}

