package br.com.desafiozup.tentativatres.dao;

import lombok.Data;

@Data
public class ResultadoDAO {
	
	private String email;
	private long idSorteio;
	private byte valorSorteado;
	private String nomeSorteio;
		

}
