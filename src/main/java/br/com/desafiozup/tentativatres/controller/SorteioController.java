package br.com.desafiozup.tentativatres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiozup.tentativatres.dao.ResultadoDAO;
import br.com.desafiozup.tentativatres.dao.SorteioDAO;
import br.com.desafiozup.tentativatres.model.Sorteio;
import br.com.desafiozup.tentativatres.repository.SorteioReposiroty;

@RestController
public class SorteioController {

	@Autowired
	private SorteioReposiroty sorteioRepository;
	
	@Autowired
	private SorteioDAO sDao;
	
	@GetMapping("sorteios")
	public List<ResultadoDAO> sorteios(){
		
		//List<Sorteio> sorteios = sorteioRepository.findAll();
		
		
		return sDao.getSorteio("ANDRESOUSA2@GMAIL.COM");
	}
	
	
}
