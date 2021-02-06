package br.com.desafiozup.tentativatres.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SorteioDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	
	@SuppressWarnings("unchecked")
	public List<ResultadoDAO> getSorteio(String email){
		
		 ResultadoDAO resultadoDAO = new ResultadoDAO();
		
		 //resultadoDAO.setEmail(entityManager.get);
		 
//		 resultadoDAO = (ResultadoDAO) entityManager
//				 .createNamedStoredProcedureQuery("busca")
//				.setParameter("email_entrada", email)
//				.getResultList().get(0);
//		 
//		 entityManager
//		 .createNamedStoredProcedureQuery("busca")
//		.setParameter("email_entrada", email)
//		.getResultList();
		 
		 String email_saida = entityManager
		 .createNamedStoredProcedureQuery("busca")
		.setParameter("email_entrada", email).getParameter("email_saida").toString();
		
		 
		 resultadoDAO.setEmail(email_saida);
		 
		 
		 List<ResultadoDAO> resultadoLista = new ArrayList<>();
		 
		 resultadoLista.add(resultadoDAO);
		 
		 return resultadoLista;
	}
	
}
