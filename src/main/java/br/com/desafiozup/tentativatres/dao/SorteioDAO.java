package br.com.desafiozup.tentativatres.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.desafiozup.tentativatres.model.Sorteio;

@Repository
public class SorteioDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	
	@SuppressWarnings("unchecked")
	public List<Sorteio> getSorteio(String email){
		
		return entityManager
				.createNamedStoredProcedureQuery("busca")
				.setParameter("id_entrada", email)
				.getResultList();
	}
	
}
