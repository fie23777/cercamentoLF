package com.fie.cercamento.cercamentoLF.resource.resourceEsq.esq33333;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FieEsqDao33333 {
    @PersistenceContext
	private EntityManager manager;

	@Autowired
	private IFieEsq33333 iFieEsq33333;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	//*******************************************************************************8
	public void gravarEsq33333(List<FieEsq33333Model> numerosEsqCinco){//
		iFieEsq33333.saveAll(numerosEsqCinco);
	}
	
//para listar em tela 33333
	
	public List<FieEsq33333Model> listarFieEsq33333(String filtro) {
	       String consulta = "select l from FieEsq33333 l where l.numEsq33333 like :nuncerc";
	          TypedQuery<FieEsq33333Model> query = manager.createQuery(consulta, FieEsq33333Model.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
