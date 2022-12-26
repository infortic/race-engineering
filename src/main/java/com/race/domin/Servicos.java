package com.race.domin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.race.adpter.repository.CircuitRepository;
import com.race.adpter.repository.entitys.CircuitEntity;

@Service
public class Servicos {

	@Autowired
	private CircuitRepository movimentoRepository;

	


	
	public Iterable<CircuitEntity> carregarTodosMovimentos() {
		return movimentoRepository.findAll();
	}
	
	
	
	
	
	
}
