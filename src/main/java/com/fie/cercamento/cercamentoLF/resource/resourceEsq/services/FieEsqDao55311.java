package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq11553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq13551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq15531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq31551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq35511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51135;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq51531;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53115;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53151;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq53511;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55113;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55131;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55311.FieEsq55311;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao55311 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq55311(FieEsq55311 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq55131(FieEsq55131 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq55113(FieEsq55113 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq53511(FieEsq53511 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq53151(FieEsq53151 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53115(FieEsq53115 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51531(FieEsq51531 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51513(FieEsq51513 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51351(FieEsq51351 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51315(FieEsq51315 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51153(FieEsq51153 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq51135(FieEsq51135 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35511(FieEsq35511 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35151(FieEsq35151 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35115(FieEsq35115 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq31155(FieEsq31155 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq31515(FieEsq31515 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq31551(FieEsq31551 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq11355(FieEsq11355 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq11535(FieEsq11535 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq11553(FieEsq11553 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13155(FieEsq13155 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13515(FieEsq13515 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15135(FieEsq15135 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15153(FieEsq15153 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15315(FieEsq15315 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15351(FieEsq15351 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15513(FieEsq15513 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq15531(FieEsq15531 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13551(FieEsq13551 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
//para listar em tela 55311
	
	public List<FieEsq55311> listarFieEsq55311(String filtro) {
	       String consulta = "select l from FieEsq55311 l where l.numEsq55311 like :nuncerc";
	          TypedQuery<FieEsq55311> query = manager.createQuery(consulta, FieEsq55311.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55131
	
	public List<FieEsq55131> listarFieEsq55131(String filtro) {
	       String consulta = "select l from FieEsq55131 l where l.numEsq55131 like :nuncerc";
	          TypedQuery<FieEsq55131> query = manager.createQuery(consulta, FieEsq55131.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55113
	
	public List<FieEsq55113> listarFieEsq55113(String filtro) {
	       String consulta = "select l from FieEsq55113 l where l.numEsq55113 like :nuncerc";
	          TypedQuery<FieEsq55113> query = manager.createQuery(consulta, FieEsq55113.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53511
	
	public List<FieEsq53511> listarFieEsq53511(String filtro) {
	       String consulta = "select l from FieEsq53511 l where l.numEsq53511 like :nuncerc";
	          TypedQuery<FieEsq53511> query = manager.createQuery(consulta, FieEsq53511.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq15531> listarFieEsq15531(String filtro) {
	       String consulta = "select l from FieEsq15531 l where l.numEsq15531 like :nuncerc";
	          TypedQuery<FieEsq15531> query = manager.createQuery(consulta, FieEsq15531.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15351> listarFieEsq15351(String filtro) {
	       String consulta = "select l from FieEsq15351 l where l.numEsq15351 like :nuncerc";
	          TypedQuery<FieEsq15351> query = manager.createQuery(consulta, FieEsq15351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15315> listarFieEsq15315(String filtro) {
	       String consulta = "select l from FieEsq15315 l where l.numEsq15315 like :nuncerc";
	          TypedQuery<FieEsq15315> query = manager.createQuery(consulta, FieEsq15315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15153> listarFieEsq15153(String filtro) {
	       String consulta = "select l from FieEsq15153 l where l.numEsq15153 like :nuncerc";
	          TypedQuery<FieEsq15153> query = manager.createQuery(consulta, FieEsq15153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15135> listarFieEsq15135(String filtro) {
	       String consulta = "select l from FieEsq15135 l where l.numEsq15135 like :nuncerc";
	          TypedQuery<FieEsq15135> query = manager.createQuery(consulta, FieEsq15135.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13515> listarFieEsq13515(String filtro) {
	       String consulta = "select l from FieEsq13515 l where l.numEsq13515 like :nuncerc";
	          TypedQuery<FieEsq13515> query = manager.createQuery(consulta, FieEsq13515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13155> listarFieEsq13155(String filtro) {
	       String consulta = "select l from FieEsq13155 l where l.numEsq13155 like :nuncerc";
	          TypedQuery<FieEsq13155> query = manager.createQuery(consulta, FieEsq13155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11553> listarFieEsq11553(String filtro) {
	       String consulta = "select l from FieEsq11553 l where l.numEsq11553 like :nuncerc";
	          TypedQuery<FieEsq11553> query = manager.createQuery(consulta, FieEsq11553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11535> listarFieEsq11535(String filtro) {
	       String consulta = "select l from FieEsq11535 l where l.numEsq11535 like :nuncerc";
	          TypedQuery<FieEsq11535> query = manager.createQuery(consulta, FieEsq11535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq11355> listarFieEsq11355(String filtro) {
	       String consulta = "select l from FieEsq11355 l where l.numEsq11355 like :nuncerc";
	          TypedQuery<FieEsq11355> query = manager.createQuery(consulta, FieEsq11355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31551> listarFieEsq31551(String filtro) {
	       String consulta = "select l from FieEsq31551 l where l.numEsq31551 like :nuncerc";
	          TypedQuery<FieEsq31551> query = manager.createQuery(consulta, FieEsq31551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31515> listarFieEsq31515(String filtro) {
	       String consulta = "select l from FieEsq31515 l where l.numEsq31515 like :nuncerc";
	          TypedQuery<FieEsq31515> query = manager.createQuery(consulta, FieEsq31515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31155> listarFieEsq31155(String filtro) {
	       String consulta = "select l from FieEsq31155 l where l.numEsq31155 like :nuncerc";
	          TypedQuery<FieEsq31155> query = manager.createQuery(consulta, FieEsq31155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35115> listarFieEsq35115(String filtro) {
	       String consulta = "select l from FieEsq35115 l where l.numEsq35115 like :nuncerc";
	          TypedQuery<FieEsq35115> query = manager.createQuery(consulta, FieEsq35115.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35151> listarFieEsq35151(String filtro) {
	       String consulta = "select l from FieEsq35151 l where l.numEsq35151 like :nuncerc";
	          TypedQuery<FieEsq35151> query = manager.createQuery(consulta, FieEsq35151.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35511> listarFieEsq35511(String filtro) {
	       String consulta = "select l from FieEsq35511 l where l.numEsq35511 like :nuncerc";
	          TypedQuery<FieEsq35511> query = manager.createQuery(consulta, FieEsq35511.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51135> listarFieEsq51135(String filtro) {
	       String consulta = "select l from FieEsq51135 l where l.numEsq51135 like :nuncerc";
	          TypedQuery<FieEsq51135> query = manager.createQuery(consulta, FieEsq51135.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51153> listarFieEsq51153(String filtro) {
	       String consulta = "select l from FieEsq51153 l where l.numEsq51153 like :nuncerc";
	          TypedQuery<FieEsq51153> query = manager.createQuery(consulta, FieEsq51153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51315> listarFieEsq51315(String filtro) {
	       String consulta = "select l from FieEsq51315 l where l.numEsq51315 like :nuncerc";
	          TypedQuery<FieEsq51315> query = manager.createQuery(consulta, FieEsq51315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51351> listarFieEsq51351(String filtro) {
	       String consulta = "select l from FieEsq51351 l where l.numEsq51351 like :nuncerc";
	          TypedQuery<FieEsq51351> query = manager.createQuery(consulta, FieEsq51351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51513> listarFieEsq51513(String filtro) {
	       String consulta = "select l from FieEsq51513 l where l.numEsq51513 like :nuncerc";
	          TypedQuery<FieEsq51513> query = manager.createQuery(consulta, FieEsq51513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51531> listarFieEsq51531(String filtro) {
	       String consulta = "select l from FieEsq51531 l where l.numEsq51531 like :nuncerc";
	          TypedQuery<FieEsq51531> query = manager.createQuery(consulta, FieEsq51531.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53115> listarFieEsq53115(String filtro) {
	       String consulta = "select l from FieEsq53115 l where l.numEsq53115 like :nuncerc";
	          TypedQuery<FieEsq53115> query = manager.createQuery(consulta, FieEsq53115.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53151> listarFieEsq53151(String filtro) {
	       String consulta = "select l from FieEsq53151 l where l.numEsq53151 like :nuncerc";
	          TypedQuery<FieEsq53151> query = manager.createQuery(consulta, FieEsq53151.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15513> listarFieEsq15513(String filtro) {
	       String consulta = "select l from FieEsq15513 l where l.numEsq15513 like :nuncerc";
	          TypedQuery<FieEsq15513> query = manager.createQuery(consulta, FieEsq15513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13551> listarFieEsq13551(String filtro) {
	       String consulta = "select l from FieEsq13551 l where l.numEsq13551 like :nuncerc";
	          TypedQuery<FieEsq13551> query = manager.createQuery(consulta, FieEsq13551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
