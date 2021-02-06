package br.com.desafiozup.tentativatres.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Data
@Entity
@Table(name = "sorteio")
public class Sorteio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "idsorteio")
	private long id;
	
	@Column( name = "data_sorteio" , nullable = false)
	private Date dataSorteio;
		
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_idpessoa" , nullable = false)	
	private Pessoa pessoa;
	
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
		name = "sorteio_valorsorteado",
		joinColumns =  { @JoinColumn( name = "idsorteio")},
		inverseJoinColumns = { @JoinColumn( name = "idvalor_sorteado")}
	)
	private Set<ValorSorteado> valorSorteado = new HashSet<>();

}
