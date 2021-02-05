package br.com.desafiozup.tentativatres.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "regra_sorteio")
public class RegraSorteio {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "idregra_sorteio")
	private long id;
	
	@Column( name = "tipo_sorteio" , nullable = false , unique = true)
	private String tipoSorteio;
	
	@Column( name = "qtd_valor_sorteio" , nullable = false)
	private int qtdValorSorteio;
	
	@OneToMany( mappedBy = "regraSorteio" , cascade = CascadeType.PERSIST)
	private List<ValorSorteado> valorSorteado;
	
}
