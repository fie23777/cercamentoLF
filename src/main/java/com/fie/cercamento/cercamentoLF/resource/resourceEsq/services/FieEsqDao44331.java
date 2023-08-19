package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository13344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository13434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository13443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository14334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository14343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository14433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository31344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository31434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository31443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository33144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository33414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository33441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository34431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository41334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository41343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository41433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43134;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43143;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43314;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43341;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43413;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository43431;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository44133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository44313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44331.Irepository44331;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Transactional
public class FieEsqDao44331 {
	@PersistenceContext
	private EntityManager manager;
	
	@Autowired private Irepository13344 irepository13344;
	@Autowired private Irepository13434 irepository13434;
	@Autowired private Irepository13443 irepository13443;
	@Autowired private Irepository14334 irepository14334;
	@Autowired private Irepository14343 irepository14343;
	@Autowired private Irepository14433 irepository14433;
	@Autowired private Irepository31344 irepository31344;
	@Autowired private Irepository31434 irepository31434;
	@Autowired private Irepository31443 irepository31443;
	@Autowired private Irepository33144 irepository33144;
	@Autowired private Irepository33414 irepository33414;
	@Autowired private Irepository33441 irepository33441;
	@Autowired private Irepository34134 irepository34134;
	@Autowired private Irepository34143 irepository34143;
	@Autowired private Irepository34314 irepository34314;
	@Autowired private Irepository34341 irepository34341;
	@Autowired private Irepository34413 irepository34413;
	@Autowired private Irepository34431 irepository34431;
	@Autowired private Irepository41334 irepository41334;
	@Autowired private Irepository41343 irepository41343;
	@Autowired private Irepository41433 irepository41433;
	@Autowired private Irepository43134 irepository43134;
	@Autowired private Irepository43143 irepository43143;
	@Autowired private Irepository43314 irepository43314;
	@Autowired private Irepository43341 irepository43341;
	@Autowired private Irepository43413 irepository43413;
	@Autowired private Irepository43431 irepository43431;
	@Autowired private Irepository44133 irepository44133;
	@Autowired private Irepository44313 irepository44313;
	@Autowired private Irepository44331 irepository44331; 
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq33144(List<FieEsq33144> esquemas){  
		irepository33144.saveAll(esquemas);
	}
	public void gravarEsq33414(List<FieEsq33414> esquemas){
		irepository33414.saveAll(esquemas);
	}
	public void gravarEsq33441(List<FieEsq33441> esquemas){
		irepository33441.saveAll(esquemas);
	}
	public void gravarEsq31344(List<FieEsq31344> esquemas){
		irepository31344.saveAll(esquemas);
	}
	public void gravarEsq31434(List<FieEsq31434> esquemas){//
		irepository31434.saveAll(esquemas);
	}
	public void gravarEsq31443(List<FieEsq31443> esquemas){//
		irepository31443.saveAll(esquemas);
	}
	public void gravarEsq34314(List<FieEsq34314> esquemas){//
		irepository34314.saveAll(esquemas);
	}
	public void gravarEsq34341(List<FieEsq34341> esquemas){//
		irepository34341.saveAll(esquemas);
	}
	public void gravarEsq34134(List<FieEsq34134> esquemas){//
		irepository34134.saveAll(esquemas);
	}
	public void gravarEsq34143(List<FieEsq34143> esquemas){//
		irepository34143.saveAll(esquemas);
	}
	public void gravarEsq34431(List<FieEsq34431> esquemas){//
		irepository34431.saveAll(esquemas);
	}
	public void gravarEsq34413(List<FieEsq34413> esquemas){//
		irepository34413.saveAll(esquemas);
	}
	public void gravarEsq13344(List<FieEsq13344> esquemas){//
		irepository13344.saveAll(esquemas);
	}
	public void gravarEsq13434(List<FieEsq13434> esquemas){//
		irepository13434.saveAll(esquemas);
	}
	public void gravarEsq13443(List<FieEsq13443> esquemas){//
		irepository13443.saveAll(esquemas);
	}
	public void gravarEsq14433(List<FieEsq14433> esquemas){//
		irepository14433.saveAll(esquemas);
	}
	public void gravarEsq14343(List<FieEsq14343> esquemas){//
		irepository14343.saveAll(esquemas);
	}
	public void gravarEsq14334(List<FieEsq14334> esquemas){//
		irepository14334.saveAll(esquemas);
	}
	public void gravarEsq44133(List<FieEsq44133> esquemas){//
		irepository44133.saveAll(esquemas);
	}
	public void gravarEsq44313(List<FieEsq44313> esquemas){//
		irepository44313.saveAll(esquemas);
	}
	public void gravarEsq44331(List<FieEsq44331> listaFieEsq44331){//
		irepository44331.saveAll(listaFieEsq44331);
	}
	public void gravarEsq41433(List<FieEsq41433> esquemas){//
		irepository41433.saveAll(esquemas);
	}
	public void gravarEsq41343(List<FieEsq41343> esquemas){//
		irepository41343.saveAll(esquemas);
	}
	public void gravarEsq41334(List<FieEsq41334> esquemas){//
		irepository41334.saveAll(esquemas);	
	}
	public void gravarEsq43413(List<FieEsq43413> esquemas){//
		irepository43413.saveAll(esquemas);
	}
	public void gravarEsq43431(List<FieEsq43431> esquemas){//
		irepository43431.saveAll(esquemas);
	}
	public void gravarEsq43143(List<FieEsq43143> esquemas){//
		irepository43143.saveAll(esquemas);
	}
	public void gravarEsq43134(List<FieEsq43134> esquemas){//
		irepository43134.saveAll(esquemas);
	}
	public void gravarEsq43341(List<FieEsq43341> esquemas){//
		irepository43341.saveAll(esquemas);
	}
	public void gravarEsq43314(List<FieEsq43314> esquemas){//
		irepository43314.saveAll(esquemas);
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
