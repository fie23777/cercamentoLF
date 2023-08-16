package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq00555;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq05550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq50550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55005;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55050;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55500.FieEsq55500;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao55500 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	//para o esquema fie gravar em banco
		public void gravarEsq55500(FieEsq55500 esquemas){  
			manager.persist(esquemas);
		}
		public void gravarEsq55050(FieEsq55050 esquemas){
			manager.persist(esquemas);
		}
		public void gravarEsq55005(FieEsq55005 esquemas){
			manager.persist(esquemas);
		}
		public void gravarEsq50505(FieEsq50505 esquemas){
			manager.persist(esquemas);
		}
		public void gravarEsq50550(FieEsq50550 esquemas){//
			manager.persist(esquemas);
		}
		public void gravarEsq50055(FieEsq50055 esquemas){//
			manager.persist(esquemas);
		}
		public void gravarEsq05055(FieEsq05055 esquemas){//
			manager.persist(esquemas);
		}
		public void gravarEsq05505(FieEsq05505 esquemas){//
			manager.persist(esquemas);
		}
		public void gravarEsq05550(FieEsq05550 esquemas){//
			manager.persist(esquemas);
		}
		public void gravarEsq00555(FieEsq00555 esquemas){//
			manager.persist(esquemas);
		}
		
		
		
	//para listar em tela 55500
		
		public List<FieEsq55500> listarFieEsq55500(String filtro) {
		       String consulta = "select l from FieEsq55500 l where l.numEsq55500 like :nuncerc";
		          TypedQuery<FieEsq55500> query = manager.createQuery(consulta, FieEsq55500.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 55050
		
		public List<FieEsq55050> listarFieEsq55050(String filtro) {
		       String consulta = "select l from FieEsq55050 l where l.numEsq55050 like :nuncerc";
		          TypedQuery<FieEsq55050> query = manager.createQuery(consulta, FieEsq55050.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 55005
		
		public List<FieEsq55005> listarFieEsq55005(String filtro) {
		       String consulta = "select l from FieEsq55005 l where l.numEsq55005 like :nuncerc";
		          TypedQuery<FieEsq55005> query = manager.createQuery(consulta, FieEsq55005.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 50505
		
		public List<FieEsq50505> listarFieEsq50505(String filtro) {
		       String consulta = "select l from FieEsq50505 l where l.numEsq50505 like :nuncerc";
		          TypedQuery<FieEsq50505> query = manager.createQuery(consulta, FieEsq50505.class).setMaxResults(10);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
	//************************************************************************************************************************
		public List<FieEsq00555> listarFieEsq00555(String filtro) {
		       String consulta = "select l from FieEsq00555 l where l.numEsq00555 like :nuncerc";
		          TypedQuery<FieEsq00555> query = manager.createQuery(consulta, FieEsq00555.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq05550> listarFieEsq05550(String filtro) {
		       String consulta = "select l from FieEsq05550 l where l.numEsq05550 like :nuncerc";
		          TypedQuery<FieEsq05550> query = manager.createQuery(consulta, FieEsq05550.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq05505> listarFieEsq05505(String filtro) {
		       String consulta = "select l from FieEsq05505 l where l.numEsq05505 like :nuncerc";
		          TypedQuery<FieEsq05505> query = manager.createQuery(consulta, FieEsq05505.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq05055> listarFieEsq05055(String filtro) {
		       String consulta = "select l from FieEsq05055 l where l.numEsq05055 like :nuncerc";
		          TypedQuery<FieEsq05055> query = manager.createQuery(consulta, FieEsq05055.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq50055> listarFieEsq50055(String filtro) {
		       String consulta = "select l from FieEsq50055 l where l.numEsq50055 like :nuncerc";
		          TypedQuery<FieEsq50055> query = manager.createQuery(consulta, FieEsq50055.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq50550> listarFieEsq50550(String filtro) {
		       String consulta = "select l from FieEsq50550 l where l.numEsq50550 like :nuncerc";
		          TypedQuery<FieEsq50550> query = manager.createQuery(consulta, FieEsq50550.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}

}
