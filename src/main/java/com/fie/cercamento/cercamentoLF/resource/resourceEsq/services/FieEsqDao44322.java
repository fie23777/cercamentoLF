package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq22443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq23442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq24432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq32442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq34422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42234;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq42432;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq43422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44322;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao44322 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq24324(FieEsq24324 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq24342(FieEsq24342 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq42324(FieEsq42324 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq42342(FieEsq42342 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq42234(FieEsq42234 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42243(FieEsq42243 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42423(FieEsq42423 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42432(FieEsq42432 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43224(FieEsq43224 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43242(FieEsq43242 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq43422(FieEsq43422 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44223(FieEsq44223 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44232(FieEsq44232 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44322(FieEsq44322 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32244(FieEsq32244 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32424(FieEsq32424 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32442(FieEsq32442 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34224(FieEsq34224 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34242(FieEsq34242 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq34422(FieEsq34422 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22344(FieEsq22344 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22434(FieEsq22434 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22443(FieEsq22443 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23244(FieEsq23244 esquemas){//
		manager.persist(esquemas);	
	}
	public void gravarEsq23424(FieEsq23424 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23442(FieEsq23442 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24234(FieEsq24234 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24243(FieEsq24243 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24423(FieEsq24423 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24432(FieEsq24432 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
//para listar em tela 24324
	
	public List<FieEsq24324> listarFieEsq24324(String filtro) {
	       String consulta = "select l from FieEsq24324 l where l.numEsq24324 like :nuncerc";
	          TypedQuery<FieEsq24324> query = manager.createQuery(consulta, FieEsq24324.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 24342
	
	public List<FieEsq24342> listarFieEsq24342(String filtro) {
	       String consulta = "select l from FieEsq24342 l where l.numEsq24342 like :nuncerc";
	          TypedQuery<FieEsq24342> query = manager.createQuery(consulta, FieEsq24342.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 42324
	
	public List<FieEsq42324> listarFieEsq42324(String filtro) {
	       String consulta = "select l from FieEsq42324 l where l.numEsq42324 like :nuncerc";
	          TypedQuery<FieEsq42324> query = manager.createQuery(consulta, FieEsq42324.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 42342
	
	public List<FieEsq42342> listarFieEsq42342(String filtro) {
	       String consulta = "select l from FieEsq42342 l where l.numEsq42342 like :nuncerc";
	          TypedQuery<FieEsq42342> query = manager.createQuery(consulta, FieEsq42342.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq24432> listarFieEsq24432(String filtro) {
	       String consulta = "select l from FieEsq24432 l where l.numEsq24432 like :nuncerc";
	          TypedQuery<FieEsq24432> query = manager.createQuery(consulta, FieEsq24432.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24423> listarFieEsq24423(String filtro) {
	       String consulta = "select l from FieEsq24423 l where l.numEsq24423 like :nuncerc";
	          TypedQuery<FieEsq24423> query = manager.createQuery(consulta, FieEsq24423.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24243> listarFieEsq24243(String filtro) {
	       String consulta = "select l from FieEsq24243 l where l.numEsq24243 like :nuncerc";
	          TypedQuery<FieEsq24243> query = manager.createQuery(consulta, FieEsq24243.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24234> listarFieEsq24234(String filtro) {
	       String consulta = "select l from FieEsq24234 l where l.numEsq24234 like :nuncerc";
	          TypedQuery<FieEsq24234> query = manager.createQuery(consulta, FieEsq24234.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23442> listarFieEsq23442(String filtro) {
	       String consulta = "select l from FieEsq23442 l where l.numEsq23442 like :nuncerc";
	          TypedQuery<FieEsq23442> query = manager.createQuery(consulta, FieEsq23442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23424> listarFieEsq23424(String filtro) {
	       String consulta = "select l from FieEsq23424 l where l.numEsq23424 like :nuncerc";
	          TypedQuery<FieEsq23424> query = manager.createQuery(consulta, FieEsq23424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23244> listarFieEsq23244(String filtro) {
	       String consulta = "select l from FieEsq23244 l where l.numEsq23244 like :nuncerc";
	          TypedQuery<FieEsq23244> query = manager.createQuery(consulta, FieEsq23244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22443> listarFieEsq22443(String filtro) {
	       String consulta = "select l from FieEsq22443 l where l.numEsq22443 like :nuncerc";
	          TypedQuery<FieEsq22443> query = manager.createQuery(consulta, FieEsq22443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22434> listarFieEsq22434(String filtro) {
	       String consulta = "select l from FieEsq22434 l where l.numEsq22434 like :nuncerc";
	          TypedQuery<FieEsq22434> query = manager.createQuery(consulta, FieEsq22434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22344> listarFieEsq22344(String filtro) {
	       String consulta = "select l from FieEsq22344 l where l.numEsq22344 like :nuncerc";
	          TypedQuery<FieEsq22344> query = manager.createQuery(consulta, FieEsq22344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34422> listarFieEsq34422(String filtro) {
	       String consulta = "select l from FieEsq34422 l where l.numEsq34422 like :nuncerc";
	          TypedQuery<FieEsq34422> query = manager.createQuery(consulta, FieEsq34422.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34242> listarFieEsq34242(String filtro) {
	       String consulta = "select l from FieEsq34242 l where l.numEsq34242 like :nuncerc";
	          TypedQuery<FieEsq34242> query = manager.createQuery(consulta, FieEsq34242.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34224> listarFieEsq34224(String filtro) {
	       String consulta = "select l from FieEsq34224 l where l.numEsq34224 like :nuncerc";
	          TypedQuery<FieEsq34224> query = manager.createQuery(consulta, FieEsq34224.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32442> listarFieEsq32442(String filtro) {
	       String consulta = "select l from FieEsq32442 l where l.numEsq32442 like :nuncerc";
	          TypedQuery<FieEsq32442> query = manager.createQuery(consulta, FieEsq32442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32424> listarFieEsq32424(String filtro) {
	       String consulta = "select l from FieEsq32424 l where l.numEsq32424 like :nuncerc";
	          TypedQuery<FieEsq32424> query = manager.createQuery(consulta, FieEsq32424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32244> listarFieEsq32244(String filtro) {
	       String consulta = "select l from FieEsq32244 l where l.numEsq32244 like :nuncerc";
	          TypedQuery<FieEsq32244> query = manager.createQuery(consulta, FieEsq32244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44322> listarFieEsq44322(String filtro) {
	       String consulta = "select l from FieEsq44322 l where l.numEsq44322 like :nuncerc";
	          TypedQuery<FieEsq44322> query = manager.createQuery(consulta, FieEsq44322.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44232> listarFieEsq44232(String filtro) {
	       String consulta = "select l from FieEsq44232 l where l.numEsq44232 like :nuncerc";
	          TypedQuery<FieEsq44232> query = manager.createQuery(consulta, FieEsq44232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44223> listarFieEsq44223(String filtro) {
	       String consulta = "select l from FieEsq44223 l where l.numEsq44223 like :nuncerc";
	          TypedQuery<FieEsq44223> query = manager.createQuery(consulta, FieEsq44223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43422> listarFieEsq43422(String filtro) {
	       String consulta = "select l from FieEsq43422 l where l.numEsq43422 like :nuncerc";
	          TypedQuery<FieEsq43422> query = manager.createQuery(consulta, FieEsq43422.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43242> listarFieEsq43242(String filtro) {
	       String consulta = "select l from FieEsq43242 l where l.numEsq43242 like :nuncerc";
	          TypedQuery<FieEsq43242> query = manager.createQuery(consulta, FieEsq43242.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43224> listarFieEsq43224(String filtro) {
	       String consulta = "select l from FieEsq43224 l where l.numEsq43224 like :nuncerc";
	          TypedQuery<FieEsq43224> query = manager.createQuery(consulta, FieEsq43224.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42432> listarFieEsq42432(String filtro) {
	       String consulta = "select l from FieEsq42432 l where l.numEsq42432 like :nuncerc";
	          TypedQuery<FieEsq42432> query = manager.createQuery(consulta, FieEsq42432.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42423> listarFieEsq42423(String filtro) {
	       String consulta = "select l from FieEsq42423 l where l.numEsq42423 like :nuncerc";
	          TypedQuery<FieEsq42423> query = manager.createQuery(consulta, FieEsq42423.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42243> listarFieEsq42243(String filtro) {
	       String consulta = "select l from FieEsq42243 l where l.numEsq42243 like :nuncerc";
	          TypedQuery<FieEsq42243> query = manager.createQuery(consulta, FieEsq42243.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42234> listarFieEsq42234(String filtro) {
	       String consulta = "select l from FieEsq42234 l where l.numEsq42234 like :nuncerc";
	          TypedQuery<FieEsq42234> query = manager.createQuery(consulta, FieEsq42234.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
