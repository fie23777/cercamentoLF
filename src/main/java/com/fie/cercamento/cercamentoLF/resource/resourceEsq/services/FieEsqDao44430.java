package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq03444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq04443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq30444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq34440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq40443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq43440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44430.FieEsq44430;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class FieEsqDao44430 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq34440(FieEsq34440 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq34404(FieEsq34404 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq34044(FieEsq34044 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq30444(FieEsq30444 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq44430(FieEsq44430 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44403(FieEsq44403 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44304(FieEsq44304 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44034(FieEsq44034 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43044(FieEsq43044 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq40344(FieEsq40344 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43440(FieEsq43440 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43404(FieEsq43404 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq40443(FieEsq40443 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq40434(FieEsq40434 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq03444(FieEsq03444 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq04344(FieEsq04344 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq04434(FieEsq04434 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq04443(FieEsq04443 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
	
//para listar em tela 34440
	
	public List<FieEsq34440> listarFieEsq34440(String filtro) {
	       String consulta = "select l from FieEsq34440 l where l.numEsq34440 like :nuncerc";
	          TypedQuery<FieEsq34440> query = manager.createQuery(consulta, FieEsq34440.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 34404
	
	public List<FieEsq34404> listarFieEsq34404(String filtro) {
	       String consulta = "select l from FieEsq34404 l where l.numEsq34404 like :nuncerc";
	          TypedQuery<FieEsq34404> query = manager.createQuery(consulta, FieEsq34404.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 34044
	
	public List<FieEsq34044> listarFieEsq34044(String filtro) {
	       String consulta = "select l from FieEsq34044 l where l.numEsq34044 like :nuncerc";
	          TypedQuery<FieEsq34044> query = manager.createQuery(consulta, FieEsq34044.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 30444
	
	public List<FieEsq30444> listarFieEsq30444(String filtro) {
	       String consulta = "select l from FieEsq30444 l where l.numEsq30444 like :nuncerc";
	          TypedQuery<FieEsq30444> query = manager.createQuery(consulta, FieEsq30444.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	
	public List<FieEsq04443> listarFieEsq04443(String filtro) {
	       String consulta = "select l from FieEsq04443 l where l.numEsq04443 like :nuncerc";
	          TypedQuery<FieEsq04443> query = manager.createQuery(consulta, FieEsq04443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04434> listarFieEsq04434(String filtro) {
	       String consulta = "select l from FieEsq04434 l where l.numEsq04434 like :nuncerc";
	          TypedQuery<FieEsq04434> query = manager.createQuery(consulta, FieEsq04434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04344> listarFieEsq04344(String filtro) {
	       String consulta = "select l from FieEsq04344 l where l.numEsq04344 like :nuncerc";
	          TypedQuery<FieEsq04344> query = manager.createQuery(consulta, FieEsq04344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03444> listarFieEsq03444(String filtro) {
	       String consulta = "select l from FieEsq03444 l where l.numEsq03444 like :nuncerc";
	          TypedQuery<FieEsq03444> query = manager.createQuery(consulta, FieEsq03444.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40434> listarFieEsq40434(String filtro) {
	       String consulta = "select l from FieEsq40434 l where l.numEsq40434 like :nuncerc";
	          TypedQuery<FieEsq40434> query = manager.createQuery(consulta, FieEsq40434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40443> listarFieEsq40443(String filtro) {
	       String consulta = "select l from FieEsq40443 l where l.numEsq40443 like :nuncerc";
	          TypedQuery<FieEsq40443> query = manager.createQuery(consulta, FieEsq40443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43404> listarFieEsq43404(String filtro) {
	       String consulta = "select l from FieEsq43404 l where l.numEsq43404 like :nuncerc";
	          TypedQuery<FieEsq43404> query = manager.createQuery(consulta, FieEsq43404.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43440> listarFieEsq43440(String filtro) {
	       String consulta = "select l from FieEsq43440 l where l.numEsq43440 like :nuncerc";
	          TypedQuery<FieEsq43440> query = manager.createQuery(consulta, FieEsq43440.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40344> listarFieEsq40344(String filtro) {
	       String consulta = "select l from FieEsq40344 l where l.numEsq40344 like :nuncerc";
	          TypedQuery<FieEsq40344> query = manager.createQuery(consulta, FieEsq40344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43044> listarFieEsq43044(String filtro) {
	       String consulta = "select l from FieEsq43044 l where l.numEsq43044 like :nuncerc";
	          TypedQuery<FieEsq43044> query = manager.createQuery(consulta, FieEsq43044.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44034> listarFieEsq44034(String filtro) {
	       String consulta = "select l from FieEsq44034 l where l.numEsq44034 like :nuncerc";
	          TypedQuery<FieEsq44034> query = manager.createQuery(consulta, FieEsq44034.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44304> listarFieEsq44304(String filtro) {
	       String consulta = "select l from FieEsq44304 l where l.numEsq44304 like :nuncerc";
	          TypedQuery<FieEsq44304> query = manager.createQuery(consulta, FieEsq44304.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44403> listarFieEsq44403(String filtro) {
	       String consulta = "select l from FieEsq44403 l where l.numEsq44403 like :nuncerc";
	          TypedQuery<FieEsq44403> query = manager.createQuery(consulta, FieEsq44403.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44430> listarFieEsq44430(String filtro) {
	       String consulta = "select l from FieEsq44430 l where l.numEsq44430 like :nuncerc";
	          TypedQuery<FieEsq44430> query = manager.createQuery(consulta, FieEsq44430.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
