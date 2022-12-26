package com.race.adpter.inbound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.race.adpter.repository.entitys.CircuitEntity;
import com.race.domin.Servicos;

@RestController
@RequestMapping("/cu")
@CrossOrigin(origins = "*")
public class WebService {

	@Autowired
	private Servicos servicos;
	
//	@PostMapping
//	@CrossOrigin(origins = "http://localhost:4200")
//	public ResponseEntity<?> salvar(@RequestBody CircuitEntity movimento){
//		return new ResponseEntity<>(servicos.incluirMovimento(movimento),HttpStatus.OK);
//	}
//	
	@GetMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> CarregarTodos(){
		return new ResponseEntity<>(servicos.carregarTodosMovimentos(),HttpStatus.OK);
	}
//	
//	@GetMapping("/produtos")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public ResponseEntity<?> CarregarTodosProdutos(){
//		return new ResponseEntity<>(servicos.carregarTodosProdutos(),HttpStatus.OK);
//	}
//	
//	@GetMapping("/cosif-por-produto/{id}")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public ResponseEntity<?> getCosifPorProduto(@PathVariable Long id){
//		return new ResponseEntity<>(servicos.getCosifPorProduto(id),HttpStatus.OK);
//	}
//	
//	@GetMapping("/obter-movimento-mes-ano/{mes}/{ano}")
//	@CrossOrigin(origins = "http://localhost:4200")
//	public ResponseEntity<?> getMovimentoPorMesAno(@PathVariable Integer mes,@PathVariable Integer ano){
//		return new ResponseEntity<>(servicos.getMovimentoPorMesAno(mes, ano),HttpStatus.OK);
//	}
//	
//	
	
}
