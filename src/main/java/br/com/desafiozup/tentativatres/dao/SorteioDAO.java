package br.com.desafiozup.tentativatres.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


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
		 List<?> lista = new ArrayList<>();
		 
//		 lista = entityManager
//		 .createNamedStoredProcedureQuery("busca")
//		.setParameter("email_entrada", email)
//		.getResultList();
		 
		 String email_saida = entityManager
		 .createNamedStoredProcedureQuery("busca").setParameter("email_entrada", email)
		 .getParameter("email_saida").toString();
		 
		 
<<<<<<< Updated upstream
		// resultadoDAO.setEmail(email_saida);
=======
		 
//		
//		 
//		 
//		 
		 resultadoDAO.setEmail(email_saida);
//		 
>>>>>>> Stashed changes
		 
		 
		
		 
		 List<ResultadoDAO> resultadoLista = new ArrayList<>();
		 
		 resultadoLista.add(resultadoDAO);
		 
		 return resultadoLista;
	}
	
}
