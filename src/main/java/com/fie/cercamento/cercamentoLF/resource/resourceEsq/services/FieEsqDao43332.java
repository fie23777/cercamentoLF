package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq23433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq24333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq32433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq33423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq34332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq42333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model43332.FieEsq43332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository23334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository23343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository23433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository24333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository32334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository32343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository32433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository33243;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository33324;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository33342;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository33423;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository34233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository34323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository34332;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository42333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository43233;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository43323;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository43332.Irepository43332;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao43332 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository23334 irepository23334;
	@Autowired private Irepository23343 irepository23343;
	@Autowired private Irepository23433 irepository23433;
	@Autowired private Irepository24333 irepository24333;
	@Autowired private Irepository32334 irepository32334;
	@Autowired private Irepository32343 irepository32343;
	@Autowired private Irepository32433 irepository32433;
	@Autowired private Irepository33243 irepository33243;
	@Autowired private Irepository33324 irepository33324;
	@Autowired private Irepository33342 irepository33342;
	@Autowired private Irepository33423 irepository33423;
	@Autowired private Irepository34233 irepository34233;
	@Autowired private Irepository34323 irepository34323;
	@Autowired private Irepository34332 irepository34332;
	@Autowired private Irepository42333 irepository42333;
	@Autowired private Irepository43233 irepository43233;
	@Autowired private Irepository43323 irepository43323;
	@Autowired private Irepository43332 irepository43332;
	
	//para o esquema fie gravar em banco
		public void gravarEsq43332(List<FieEsq43332> esquemas){  
	        List<FieEsq43332> esquemasFiltrados = esquemas.stream()
	                .filter(esquema -> !irepository43332.existsById(esquema.getId()))
	                .collect(Collectors.toList());

	        if (!esquemasFiltrados.isEmpty()) {
	            irepository43332.saveAll(esquemasFiltrados);
	        }
		}
		public void gravarEsq43323(List<FieEsq43323> esquemas){
			irepository43323.saveAll(esquemas);
		}
		public void gravarEsq43233(List<FieEsq43233> esquemas){
			irepository43233.saveAll(esquemas);
		}
		public void gravarEsq42333(List<FieEsq42333> esquemas){
			irepository42333.saveAll(esquemas);
		}
		public void gravarEsq33342(List<FieEsq33342> esquemas){//
			irepository33342.saveAll(esquemas);
		}
		public void gravarEsq33324(List<FieEsq33324> esquemas){//
			irepository33324.saveAll(esquemas);
		}
		public void gravarEsq33423(List<FieEsq33423> esquemas){//
			irepository33423.saveAll(esquemas);
		}
		public void gravarEsq33243(List<FieEsq33243> esquemas){//
			irepository33243.saveAll(esquemas);
		}
		public void gravarEsq34233(List<FieEsq34233> esquemas){//
			irepository34233.saveAll(esquemas);
		}
		public void gravarEsq32433(List<FieEsq32433> esquemas){//
			irepository32433.saveAll(esquemas);
		}
		public void gravarEsq34332(List<FieEsq34332> esquemas){//
			irepository34332.saveAll(esquemas);
		}
		public void gravarEsq34323(List<FieEsq34323> esquemas){//
			irepository34323.saveAll(esquemas);
		}
		public void gravarEsq32334(List<FieEsq32334> esquemas){//
			irepository32334.saveAll(esquemas);
		}
		public void gravarEsq32343(List<FieEsq32343> esquemas){//
			irepository32343.saveAll(esquemas);
		}
		public void gravarEsq24333(List<FieEsq24333> esquemas){//
			irepository24333.saveAll(esquemas);
		}
		public void gravarEsq23433(List<FieEsq23433> esquemas){//
			irepository23433.saveAll(esquemas);
		}
		public void gravarEsq23343(List<FieEsq23343> esquemas){//
			irepository23343.saveAll(esquemas);
		}
		public void gravarEsq23334(List<FieEsq23334> esquemas){//
			irepository23334.saveAll(esquemas);
		}
		
		
		
		
	//para listar em tela 43332
		
		public List<FieEsq43332> listarFieEsq43332(String filtro) {
		       String consulta = "select l from FieEsq43332 l where l.numEsq43332 like :nuncerc";
		          TypedQuery<FieEsq43332> query = manager.createQuery(consulta, FieEsq43332.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 43323
		
		public List<FieEsq43323> listarFieEsq43323(String filtro) {
		       String consulta = "select l from FieEsq43323 l where l.numEsq43323 like :nuncerc";
		          TypedQuery<FieEsq43323> query = manager.createQuery(consulta, FieEsq43323.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 43233
		
		public List<FieEsq43233> listarFieEsq43233(String filtro) {
		       String consulta = "select l from FieEsq43233 l where l.numEsq43233 like :nuncerc";
		          TypedQuery<FieEsq43233> query = manager.createQuery(consulta, FieEsq43233.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 42333
		
		public List<FieEsq42333> listarFieEsq42333(String filtro) {
		       String consulta = "select l from FieEsq42333 l where l.numEsq42333 like :nuncerc";
		          TypedQuery<FieEsq42333> query = manager.createQuery(consulta, FieEsq42333.class).setMaxResults(10);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
	//************************************************************************************************************************
		
		
		
		
		public List<FieEsq23334> listarFieEsq23334(String filtro) {
		       String consulta = "select l from FieEsq23334 l where l.numEsq23334 like :nuncerc";
		          TypedQuery<FieEsq23334> query = manager.createQuery(consulta, FieEsq23334.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq23343> listarFieEsq23343(String filtro) {
		       String consulta = "select l from FieEsq23343 l where l.numEsq23343 like :nuncerc";
		          TypedQuery<FieEsq23343> query = manager.createQuery(consulta, FieEsq23343.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq23433> listarFieEsq23433(String filtro) {
		       String consulta = "select l from FieEsq23433 l where l.numEsq23433 like :nuncerc";
		          TypedQuery<FieEsq23433> query = manager.createQuery(consulta, FieEsq23433.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24333> listarFieEsq24333(String filtro) {
		       String consulta = "select l from FieEsq24333 l where l.numEsq24333 like :nuncerc";
		          TypedQuery<FieEsq24333> query = manager.createQuery(consulta, FieEsq24333.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32343> listarFieEsq32343(String filtro) {
		       String consulta = "select l from FieEsq32343 l where l.numEsq32343 like :nuncerc";
		          TypedQuery<FieEsq32343> query = manager.createQuery(consulta, FieEsq32343.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32334> listarFieEsq32334(String filtro) {
		       String consulta = "select l from FieEsq32334 l where l.numEsq32334 like :nuncerc";
		          TypedQuery<FieEsq32334> query = manager.createQuery(consulta, FieEsq32334.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34323> listarFieEsq34323(String filtro) {
		       String consulta = "select l from FieEsq34323 l where l.numEsq34323 like :nuncerc";
		          TypedQuery<FieEsq34323> query = manager.createQuery(consulta, FieEsq34323.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34332> listarFieEsq34332(String filtro) {
		       String consulta = "select l from FieEsq34332 l where l.numEsq34332 like :nuncerc";
		          TypedQuery<FieEsq34332> query = manager.createQuery(consulta, FieEsq34332.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32433> listarFieEsq32433(String filtro) {
		       String consulta = "select l from FieEsq32433 l where l.numEsq32433 like :nuncerc";
		          TypedQuery<FieEsq32433> query = manager.createQuery(consulta, FieEsq32433.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34233> listarFieEsq34233(String filtro) {
		       String consulta = "select l from FieEsq34233 l where l.numEsq34233 like :nuncerc";
		          TypedQuery<FieEsq34233> query = manager.createQuery(consulta, FieEsq34233.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33243> listarFieEsq33243(String filtro) {
		       String consulta = "select l from FieEsq33243 l where l.numEsq33243 like :nuncerc";
		          TypedQuery<FieEsq33243> query = manager.createQuery(consulta, FieEsq33243.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33423> listarFieEsq33423(String filtro) {
		       String consulta = "select l from FieEsq33423 l where l.numEsq33423 like :nuncerc";
		          TypedQuery<FieEsq33423> query = manager.createQuery(consulta, FieEsq33423.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33324> listarFieEsq33324(String filtro) {
		       String consulta = "select l from FieEsq33324 l where l.numEsq33324 like :nuncerc";
		          TypedQuery<FieEsq33324> query = manager.createQuery(consulta, FieEsq33324.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33342> listarFieEsq33342(String filtro) {
		       String consulta = "select l from FieEsq33342 l where l.numEsq33342 like :nuncerc";
		          TypedQuery<FieEsq33342> query = manager.createQuery(consulta, FieEsq33342.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}

}
