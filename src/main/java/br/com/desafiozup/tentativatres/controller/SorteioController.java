package br.com.desafiozup.tentativatres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiozup.tentativatres.model.Sorteio;
import br.com.desafiozup.tentativatres.repository.SorteioReposiroty;

@RestController
public class SorteioController {

	@Autowired
	private SorteioReposiroty sorteioRepository;
	
	
	@GetMapping("sorteios")
	public List<Sorteio> sorteios(){
		
		List<Sorteio> sorteios = sorteioRepository.findAll();
		
		return sorteios;
	}
	
	
}
