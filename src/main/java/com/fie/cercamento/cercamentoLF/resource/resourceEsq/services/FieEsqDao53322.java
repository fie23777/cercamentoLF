package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq22533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq23532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq25332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq32532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq33522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq35322;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq52332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53223;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53232;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53322.FieEsq53322;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class FieEsqDao53322 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq33522(FieEsq33522 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq33252(FieEsq33252 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq33225(FieEsq33225 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq35322(FieEsq35322 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq35232(FieEsq35232 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35223(FieEsq35223 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32352(FieEsq32352 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32325(FieEsq32325 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32532(FieEsq32532 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32523(FieEsq32523 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32235(FieEsq32235 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq32253(FieEsq32253 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53232(FieEsq53232 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53223(FieEsq53223 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq52233(FieEsq52233 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq52323(FieEsq52323 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq52332(FieEsq52332 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22533(FieEsq22533 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22353(FieEsq22353 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq22335(FieEsq22335 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25233(FieEsq25233 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25323(FieEsq25323 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25332(FieEsq25332 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23253(FieEsq23253 esquemas){//
		manager.persist(esquemas);	
	}
	public void gravarEsq23235(FieEsq23235 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23523(FieEsq23523 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23532(FieEsq23532 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23325(FieEsq23325 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23352(FieEsq23352 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53322(FieEsq53322 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
//para listar em tela 33522
	
	public List<FieEsq33522> listarFieEsq33522(String filtro) {
	       String consulta = "select l from FieEsq33522 l where l.numEsq33522 like :nuncerc";
	          TypedQuery<FieEsq33522> query = manager.createQuery(consulta, FieEsq33522.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33252
	
	public List<FieEsq33252> listarFieEsq33252(String filtro) {
	       String consulta = "select l from FieEsq33252 l where l.numEsq33252 like :nuncerc";
	          TypedQuery<FieEsq33252> query = manager.createQuery(consulta, FieEsq33252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33225
	
	public List<FieEsq33225> listarFieEsq33225(String filtro) {
	       String consulta = "select l from FieEsq33225 l where l.numEsq33225 like :nuncerc";
	          TypedQuery<FieEsq33225> query = manager.createQuery(consulta, FieEsq33225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 35322
	
	public List<FieEsq35322> listarFieEsq35322(String filtro) {
	       String consulta = "select l from FieEsq35322 l where l.numEsq35322 like :nuncerc";
	          TypedQuery<FieEsq35322> query = manager.createQuery(consulta, FieEsq35322.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq53322> listarFieEsq53322(String filtro) {
	       String consulta = "select l from FieEsq53322 l where l.numEsq53322 like :nuncerc";
	          TypedQuery<FieEsq53322> query = manager.createQuery(consulta, FieEsq53322.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23325> listarFieEsq23325(String filtro) {
	       String consulta = "select l from FieEsq23325 l where l.numEsq23325 like :nuncerc";
	          TypedQuery<FieEsq23325> query = manager.createQuery(consulta, FieEsq23325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23532> listarFieEsq23532(String filtro) {
	       String consulta = "select l from FieEsq23532 l where l.numEsq23532 like :nuncerc";
	          TypedQuery<FieEsq23532> query = manager.createQuery(consulta, FieEsq23532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23523> listarFieEsq23523(String filtro) {
	       String consulta = "select l from FieEsq23523 l where l.numEsq23523 like :nuncerc";
	          TypedQuery<FieEsq23523> query = manager.createQuery(consulta, FieEsq23523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23235> listarFieEsq23235(String filtro) {
	       String consulta = "select l from FieEsq23235 l where l.numEsq23235 like :nuncerc";
	          TypedQuery<FieEsq23235> query = manager.createQuery(consulta, FieEsq23235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23253> listarFieEsq23253(String filtro) {
	       String consulta = "select l from FieEsq23253 l where l.numEsq23253 like :nuncerc";
	          TypedQuery<FieEsq23253> query = manager.createQuery(consulta, FieEsq23253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25332> listarFieEsq25332(String filtro) {
	       String consulta = "select l from FieEsq25332 l where l.numEsq25332 like :nuncerc";
	          TypedQuery<FieEsq25332> query = manager.createQuery(consulta, FieEsq25332.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25323> listarFieEsq25323(String filtro) {
	       String consulta = "select l from FieEsq25323 l where l.numEsq25323 like :nuncerc";
	          TypedQuery<FieEsq25323> query = manager.createQuery(consulta, FieEsq25323.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25233> listarFieEsq25233(String filtro) {
	       String consulta = "select l from FieEsq25233 l where l.numEsq25233 like :nuncerc";
	          TypedQuery<FieEsq25233> query = manager.createQuery(consulta, FieEsq25233.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22335> listarFieEsq22335(String filtro) {
	       String consulta = "select l from FieEsq22335 l where l.numEsq22335 like :nuncerc";
	          TypedQuery<FieEsq22335> query = manager.createQuery(consulta, FieEsq22335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22353> listarFieEsq22353(String filtro) {
	       String consulta = "select l from FieEsq22353 l where l.numEsq22353 like :nuncerc";
	          TypedQuery<FieEsq22353> query = manager.createQuery(consulta, FieEsq22353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22533> listarFieEsq22533(String filtro) {
	       String consulta = "select l from FieEsq22533 l where l.numEsq22533 like :nuncerc";
	          TypedQuery<FieEsq22533> query = manager.createQuery(consulta, FieEsq22533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52332> listarFieEsq52332(String filtro) {
	       String consulta = "select l from FieEsq52332 l where l.numEsq52332 like :nuncerc";
	          TypedQuery<FieEsq52332> query = manager.createQuery(consulta, FieEsq52332.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52323> listarFieEsq52323(String filtro) {
	       String consulta = "select l from FieEsq52323 l where l.numEsq52323 like :nuncerc";
	          TypedQuery<FieEsq52323> query = manager.createQuery(consulta, FieEsq52323.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52233> listarFieEsq52233(String filtro) {
	       String consulta = "select l from FieEsq52233 l where l.numEsq52233 like :nuncerc";
	          TypedQuery<FieEsq52233> query = manager.createQuery(consulta, FieEsq52233.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53223> listarFieEsq53223(String filtro) {
	       String consulta = "select l from FieEsq53223 l where l.numEsq53223 like :nuncerc";
	          TypedQuery<FieEsq53223> query = manager.createQuery(consulta, FieEsq53223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53232> listarFieEsq53232(String filtro) {
	       String consulta = "select l from FieEsq53232 l where l.numEsq53232 like :nuncerc";
	          TypedQuery<FieEsq53232> query = manager.createQuery(consulta, FieEsq53232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32253> listarFieEsq32253(String filtro) {
	       String consulta = "select l from FieEsq32253 l where l.numEsq32253 like :nuncerc";
	          TypedQuery<FieEsq32253> query = manager.createQuery(consulta, FieEsq32253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32235> listarFieEsq32235(String filtro) {
	       String consulta = "select l from FieEsq32235 l where l.numEsq32235 like :nuncerc";
	          TypedQuery<FieEsq32235> query = manager.createQuery(consulta, FieEsq32235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32523> listarFieEsq32523(String filtro) {
	       String consulta = "select l from FieEsq32523 l where l.numEsq32523 like :nuncerc";
	          TypedQuery<FieEsq32523> query = manager.createQuery(consulta, FieEsq32523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32532> listarFieEsq32532(String filtro) {
	       String consulta = "select l from FieEsq32532 l where l.numEsq32532 like :nuncerc";
	          TypedQuery<FieEsq32532> query = manager.createQuery(consulta, FieEsq32532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32325> listarFieEsq32325(String filtro) {
	       String consulta = "select l from FieEsq32325 l where l.numEsq32325 like :nuncerc";
	          TypedQuery<FieEsq32325> query = manager.createQuery(consulta, FieEsq32325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq32352> listarFieEsq32352(String filtro) {
	       String consulta = "select l from FieEsq32352 l where l.numEsq32352 like :nuncerc";
	          TypedQuery<FieEsq32352> query = manager.createQuery(consulta, FieEsq32352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35223> listarFieEsq35223(String filtro) {
	       String consulta = "select l from FieEsq35223 l where l.numEsq35223 like :nuncerc";
	          TypedQuery<FieEsq35223> query = manager.createQuery(consulta, FieEsq35223.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35232> listarFieEsq35232(String filtro) {
	       String consulta = "select l from FieEsq35232 l where l.numEsq35232 like :nuncerc";
	          TypedQuery<FieEsq35232> query = manager.createQuery(consulta, FieEsq35232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
