package br.com.desafiozup.tentativatres.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "valor_sorteado")
public class ValorSorteado {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "idvalor_sorteado")
	private long id;
	
	@Column( name = "valor_sorteado" , nullable = false )
	private byte valorSorteado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "fk_idregra_sorteio" , nullable = false)
	private RegraSorteio regraSorteio;
	
	@ManyToMany( mappedBy = "valorSorteado")
	private Set<Sorteio> sorteio = new HashSet<>();
	
}
