package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq13443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq14433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq31443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq33441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq34431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq41433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq43431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44331.FieEsq44331;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao44331 {
	@PersistenceContext
	private EntityManager manager;
	
	private IFieEsqDao44331Repository iFieEsqDao44331Repository ;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq33144(FieEsq33144 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq33414(FieEsq33414 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq33441(FieEsq33441 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq31344(FieEsq31344 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq31434(FieEsq31434 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq31443(FieEsq31443 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34314(FieEsq34314 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34341(FieEsq34341 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34134(FieEsq34134 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34143(FieEsq34143 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34431(FieEsq34431 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34413(FieEsq34413 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13344(FieEsq13344 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13434(FieEsq13434 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq13443(FieEsq13443 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq14433(FieEsq14433 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq14343(FieEsq14343 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq14334(FieEsq14334 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44133(FieEsq44133 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44313(FieEsq44313 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44331(List<FieEsq44331> listaFieEsq44331){//
		iFieEsqDao44331Repository.saveAll(listaFieEsq44331);
	}
	public void gravarEsq41433(FieEsq41433 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq41343(FieEsq41343 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq41334(FieEsq41334 esquemas){//
		manager.persist(esquemas);	
	}
	public void gravarEsq43413(FieEsq43413 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43431(FieEsq43431 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43143(FieEsq43143 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43134(FieEsq43134 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43341(FieEsq43341 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43314(FieEsq43314 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
//para listar em tela 33144
	
	public List<FieEsq33144> listarFieEsq33144(String filtro) {
	       String consulta = "select l from FieEsq33144 l where l.numEsq33144 like :nuncerc";
	          TypedQuery<FieEsq33144> query = manager.createQuery(consulta, FieEsq33144.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33414
	
	public List<FieEsq33414> listarFieEsq33414(String filtro) {
	       String consulta = "select l from FieEsq33414 l where l.numEsq33414 like :nuncerc";
	          TypedQuery<FieEsq33414> query = manager.createQuery(consulta, FieEsq33414.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33441
	
	public List<FieEsq33441> listarFieEsq33441(String filtro) {
	       String consulta = "select l from FieEsq33441 l where l.numEsq33441 like :nuncerc";
	          TypedQuery<FieEsq33441> query = manager.createQuery(consulta, FieEsq33441.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 31344
	
	public List<FieEsq31344> listarFieEsq31344(String filtro) {
	       String consulta = "select l from FieEsq31344 l where l.numEsq31344 like :nuncerc";
	          TypedQuery<FieEsq31344> query = manager.createQuery(consulta, FieEsq31344.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq43314> listarFieEsq43314(String filtro) {
	       String consulta = "select l from FieEsq43314 l where l.numEsq43314 like :nuncerc";
	          TypedQuery<FieEsq43314> query = manager.createQuery(consulta, FieEsq43314.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43134> listarFieEsq43134(String filtro) {
	       String consulta = "select l from FieEsq43134 l where l.numEsq43134 like :nuncerc";
	          TypedQuery<FieEsq43134> query = manager.createQuery(consulta, FieEsq43134.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43143> listarFieEsq43143(String filtro) {
	       String consulta = "select l from FieEsq43143 l where l.numEsq43143 like :nuncerc";
	          TypedQuery<FieEsq43143> query = manager.createQuery(consulta, FieEsq43143.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43431> listarFieEsq43431(String filtro) {
	       String consulta = "select l from FieEsq43431 l where l.numEsq43431 like :nuncerc";
	          TypedQuery<FieEsq43431> query = manager.createQuery(consulta, FieEsq43431.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43413> listarFieEsq43413(String filtro) {
	       String consulta = "select l from FieEsq43413 l where l.numEsq43413 like :nuncerc";
	          TypedQuery<FieEsq43413> query = manager.createQuery(consulta, FieEsq43413.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41334> listarFieEsq41334(String filtro) {
	       String consulta = "select l from FieEsq41334 l where l.numEsq41334 like :nuncerc";
	          TypedQuery<FieEsq41334> query = manager.createQuery(consulta, FieEsq41334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41343> listarFieEsq41343(String filtro) {
	       String consulta = "select l from FieEsq41343 l where l.numEsq41343 like :nuncerc";
	          TypedQuery<FieEsq41343> query = manager.createQuery(consulta, FieEsq41343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41433> listarFieEsq41433(String filtro) {
	       String consulta = "select l from FieEsq41433 l where l.numEsq41433 like :nuncerc";
	          TypedQuery<FieEsq41433> query = manager.createQuery(consulta, FieEsq41433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44331> listarFieEsq44331(String filtro) {
	       String consulta = "select l from FieEsq44331 l where l.numEsq44331 like :nuncerc";
	          TypedQuery<FieEsq44331> query = manager.createQuery(consulta, FieEsq44331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44313> listarFieEsq44313(String filtro) {
	       String consulta = "select l from FieEsq44313 l where l.numEsq44313 like :nuncerc";
	          TypedQuery<FieEsq44313> query = manager.createQuery(consulta, FieEsq44313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44133> listarFieEsq44133(String filtro) {
	       String consulta = "select l from FieEsq44133 l where l.numEsq44133 like :nuncerc";
	          TypedQuery<FieEsq44133> query = manager.createQuery(consulta, FieEsq44133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14334> listarFieEsq14334(String filtro) {
	       String consulta = "select l from FieEsq14334 l where l.numEsq14334 like :nuncerc";
	          TypedQuery<FieEsq14334> query = manager.createQuery(consulta, FieEsq14334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14343> listarFieEsq14343(String filtro) {
	       String consulta = "select l from FieEsq14343 l where l.numEsq14343 like :nuncerc";
	          TypedQuery<FieEsq14343> query = manager.createQuery(consulta, FieEsq14343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14433> listarFieEsq14433(String filtro) {
	       String consulta = "select l from FieEsq14433 l where l.numEsq14433 like :nuncerc";
	          TypedQuery<FieEsq14433> query = manager.createQuery(consulta, FieEsq14433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13443> listarFieEsq13443(String filtro) {
	       String consulta = "select l from FieEsq13443 l where l.numEsq13443 like :nuncerc";
	          TypedQuery<FieEsq13443> query = manager.createQuery(consulta, FieEsq13443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13434> listarFieEsq13434(String filtro) {
	       String consulta = "select l from FieEsq13434 l where l.numEsq13434 like :nuncerc";
	          TypedQuery<FieEsq13434> query = manager.createQuery(consulta, FieEsq13434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13344> listarFieEsq13344(String filtro) {
	       String consulta = "select l from FieEsq13344 l where l.numEsq13344 like :nuncerc";
	          TypedQuery<FieEsq13344> query = manager.createQuery(consulta, FieEsq13344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34413> listarFieEsq34413(String filtro) {
	       String consulta = "select l from FieEsq34413 l where l.numEsq34413 like :nuncerc";
	          TypedQuery<FieEsq34413> query = manager.createQuery(consulta, FieEsq34413.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34431> listarFieEsq34431(String filtro) {
	       String consulta = "select l from FieEsq34431 l where l.numEsq34431 like :nuncerc";
	          TypedQuery<FieEsq34431> query = manager.createQuery(consulta, FieEsq34431.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34143> listarFieEsq34143(String filtro) {
	       String consulta = "select l from FieEsq34143 l where l.numEsq34143 like :nuncerc";
	          TypedQuery<FieEsq34143> query = manager.createQuery(consulta, FieEsq34143.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34134> listarFieEsq34134(String filtro) {
	       String consulta = "select l from FieEsq34134 l where l.numEsq34134 like :nuncerc";
	          TypedQuery<FieEsq34134> query = manager.createQuery(consulta, FieEsq34134.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34341> listarFieEsq34341(String filtro) {
	       String consulta = "select l from FieEsq34341 l where l.numEsq34341 like :nuncerc";
	          TypedQuery<FieEsq34341> query = manager.createQuery(consulta, FieEsq34341.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34314> listarFieEsq34314(String filtro) {
	       String consulta = "select l from FieEsq34314 l where l.numEsq34314 like :nuncerc";
	          TypedQuery<FieEsq34314> query = manager.createQuery(consulta, FieEsq34314.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31443> listarFieEsq31443(String filtro) {
	       String consulta = "select l from FieEsq31443 l where l.numEsq31443 like :nuncerc";
	          TypedQuery<FieEsq31443> query = manager.createQuery(consulta, FieEsq31443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31434> listarFieEsq31434(String filtro) {
	       String consulta = "select l from FieEsq31434 l where l.numEsq31434 like :nuncerc";
	          TypedQuery<FieEsq31434> query = manager.createQuery(consulta, FieEsq31434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
