package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;


import java.util.List;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq12444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq14442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq21444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq24441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq41442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq42441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44124;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44214;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44412;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44421.FieEsq44421;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao44421 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	public void gravarEsq14442(FieEsq14442 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq14424(FieEsq14424 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq14244(FieEsq14244 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq12444(FieEsq12444 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq44412(FieEsq44412 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44421(FieEsq44421 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44124(FieEsq44124 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq44214(FieEsq44214 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq41244(FieEsq41244 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42144(FieEsq42144 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq41442(FieEsq41442 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq41424(FieEsq41424 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42441(FieEsq42441 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq42414(FieEsq42414 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq21444(FieEsq21444 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24144(FieEsq24144 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24414(FieEsq24414 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq24441(FieEsq24441 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
	
//para listar em tela 14442
	
	public List<FieEsq14442> listarFieEsq14442(String filtro) {
	       String consulta = "select l from FieEsq14442 l where l.numEsq14442 like :nuncerc";
	          TypedQuery<FieEsq14442> query = manager.createQuery(consulta, FieEsq14442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 14424
	
	public List<FieEsq14424> listarFieEsq14424(String filtro) {
	       String consulta = "select l from FieEsq14424 l where l.numEsq14424 like :nuncerc";
	          TypedQuery<FieEsq14424> query = manager.createQuery(consulta, FieEsq14424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 14244
	
	public List<FieEsq14244> listarFieEsq14244(String filtro) {
	       String consulta = "select l from FieEsq14244 l where l.numEsq14244 like :nuncerc";
	          TypedQuery<FieEsq14244> query = manager.createQuery(consulta, FieEsq14244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 12444
	
	public List<FieEsq12444> listarFieEsq12444(String filtro) {
	       String consulta = "select l from FieEsq12444 l where l.numEsq12444 like :nuncerc";
	          TypedQuery<FieEsq12444> query = manager.createQuery(consulta, FieEsq12444.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	
	public List<FieEsq24441> listarFieEsq24441(String filtro) {
	       String consulta = "select l from FieEsq24441 l where l.numEsq24441 like :nuncerc";
	          TypedQuery<FieEsq24441> query = manager.createQuery(consulta, FieEsq24441.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24414> listarFieEsq24414(String filtro) {
	       String consulta = "select l from FieEsq24414 l where l.numEsq24414 like :nuncerc";
	          TypedQuery<FieEsq24414> query = manager.createQuery(consulta, FieEsq24414.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq24144> listarFieEsq24144(String filtro) {
	       String consulta = "select l from FieEsq24144 l where l.numEsq24144 like :nuncerc";
	          TypedQuery<FieEsq24144> query = manager.createQuery(consulta, FieEsq24144.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21444> listarFieEsq21444(String filtro) {
	       String consulta = "select l from FieEsq21444 l where l.numEsq21444 like :nuncerc";
	          TypedQuery<FieEsq21444> query = manager.createQuery(consulta, FieEsq21444.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42414> listarFieEsq42414(String filtro) {
	       String consulta = "select l from FieEsq42414 l where l.numEsq42414 like :nuncerc";
	          TypedQuery<FieEsq42414> query = manager.createQuery(consulta, FieEsq42414.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42441> listarFieEsq42441(String filtro) {
	       String consulta = "select l from FieEsq42441 l where l.numEsq42441 like :nuncerc";
	          TypedQuery<FieEsq42441> query = manager.createQuery(consulta, FieEsq42441.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41424> listarFieEsq41424(String filtro) {
	       String consulta = "select l from FieEsq41424 l where l.numEsq41424 like :nuncerc";
	          TypedQuery<FieEsq41424> query = manager.createQuery(consulta, FieEsq41424.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41442> listarFieEsq41442(String filtro) {
	       String consulta = "select l from FieEsq41442 l where l.numEsq41442 like :nuncerc";
	          TypedQuery<FieEsq41442> query = manager.createQuery(consulta, FieEsq41442.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq42144> listarFieEsq42144(String filtro) {
	       String consulta = "select l from FieEsq42144 l where l.numEsq42144 like :nuncerc";
	          TypedQuery<FieEsq42144> query = manager.createQuery(consulta, FieEsq42144.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41244> listarFieEsq41244(String filtro) {
	       String consulta = "select l from FieEsq41244 l where l.numEsq41244 like :nuncerc";
	          TypedQuery<FieEsq41244> query = manager.createQuery(consulta, FieEsq41244.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44214> listarFieEsq44214(String filtro) {
	       String consulta = "select l from FieEsq44214 l where l.numEsq44214 like :nuncerc";
	          TypedQuery<FieEsq44214> query = manager.createQuery(consulta, FieEsq44214.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44124> listarFieEsq44124(String filtro) {
	       String consulta = "select l from FieEsq44124 l where l.numEsq44124 like :nuncerc";
	          TypedQuery<FieEsq44124> query = manager.createQuery(consulta, FieEsq44124.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44421> listarFieEsq44421(String filtro) {
	       String consulta = "select l from FieEsq44421 l where l.numEsq44421 like :nuncerc";
	          TypedQuery<FieEsq44421> query = manager.createQuery(consulta, FieEsq44421.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44412> listarFieEsq44412(String filtro) {
	       String consulta = "select l from FieEsq44412 l where l.numEsq44412 like :nuncerc";
	          TypedQuery<FieEsq44412> query = manager.createQuery(consulta, FieEsq44412.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
