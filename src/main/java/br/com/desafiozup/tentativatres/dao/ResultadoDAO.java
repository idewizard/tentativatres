package br.com.desafiozup.tentativatres.dao;

import javax.persistence.Parameter;

import lombok.Data;

@Data
public class ResultadoDAO {
	
	private String email;
	private long idSorteio;
	private int valorSorteado;
	private String nomeSorteio;
		

}
