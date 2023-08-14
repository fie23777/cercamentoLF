package com.fie.cercamento.cercamentoLF.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.FieEsq33333;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FieEsqDao33333 {
    @PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	//*******************************************************************************8
	public void gravarEsq33333(FieEsq33333 numerosEsqCinco){//
		manager.persist(numerosEsqCinco);
	}
	
//para listar em tela 33333
	
	public List<FieEsq33333> listarFieEsq33333(String filtro) {
	       String consulta = "select l from FieEsq33333 l where l.numEsq33333 like :nuncerc";
	          TypedQuery<FieEsq33333> query = manager.createQuery(consulta, FieEsq33333.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
