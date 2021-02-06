package br.com.desafiozup.tentativatres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiozup.tentativatres.model.Pessoa;
import br.com.desafiozup.tentativatres.repository.PessoaRepository;

@RestController
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoa")
	public List<Pessoa> pessoa() {
		
		List<Pessoa> pessoas = pessoaRepository.findAll(); 
		
		return pessoas;
	}
	
}
