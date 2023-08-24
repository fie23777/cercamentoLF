package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository12444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository14244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository14424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository14442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository21444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository24144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository24414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository24441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository41244;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository41424;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository41442;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository42144;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository42414;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository42441;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository44124;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository44214;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository44412;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44421.Irepository44421;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao44421 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository12444 irepository12444;
	@Autowired private Irepository14244 irepository14244;
	@Autowired private Irepository14424 irepository14424;
	@Autowired private Irepository14442 irepository14442;
	@Autowired private Irepository21444 irepository21444;
	@Autowired private Irepository24144 irepository24144;
	@Autowired private Irepository24414 irepository24414;
	@Autowired private Irepository24441 irepository24441;
	@Autowired private Irepository41244 irepository41244;
	@Autowired private Irepository41424 irepository41424;
	@Autowired private Irepository41442 irepository41442;
	@Autowired private Irepository42144 irepository42144;
	@Autowired private Irepository42414 irepository42414;
	@Autowired private Irepository42441 irepository42441;
	@Autowired private Irepository44124 irepository44124;
	@Autowired private Irepository44214 irepository44214;
	@Autowired private Irepository44412 irepository44412;
	@Autowired private Irepository44421 irepository44421; 
	
	//para o esquema fie gravar em banco
	public void gravarEsq14442(List<FieEsq14442> esquemas){  
		irepository14442.saveAll(esquemas);
	}
	public void gravarEsq14424(List<FieEsq14424> esquemas){
		irepository14424.saveAll(esquemas);
	}
	public void gravarEsq14244(List<FieEsq14244> esquemas){
		irepository14244.saveAll(esquemas);
	}
	public void gravarEsq12444(List<FieEsq12444> esquemas){
		irepository12444.saveAll(esquemas);
	}
	public void gravarEsq44412(List<FieEsq44412> esquemas){//
		irepository44412.saveAll(esquemas);
	}
	public void gravarEsq44421(List<FieEsq44421> esquemas){//
		irepository44421.saveAll(esquemas);
	}
	public void gravarEsq44124(List<FieEsq44124> esquemas){//
		irepository44124.saveAll(esquemas);
	}
	public void gravarEsq44214(List<FieEsq44214> esquemas){//
		irepository44214.saveAll(esquemas);
	}
	public void gravarEsq41244(List<FieEsq41244> esquemas){//
		irepository41244.saveAll(esquemas);
	}
	public void gravarEsq42144(List<FieEsq42144> esquemas){//
		irepository42144.saveAll(esquemas);
	}
	public void gravarEsq41442(List<FieEsq41442> esquemas){//
		irepository41442.saveAll(esquemas);
	}
	public void gravarEsq41424(List<FieEsq41424> esquemas){//
		irepository41424.saveAll(esquemas);
	}
	public void gravarEsq42441(List<FieEsq42441> esquemas){//
		irepository42441.saveAll(esquemas);
	}
	public void gravarEsq42414(List<FieEsq42414> esquemas){//
		irepository42414.saveAll(esquemas);
	}
	public void gravarEsq21444(List<FieEsq21444> esquemas){//
		irepository21444.saveAll(esquemas);
	}
	public void gravarEsq24144(List<FieEsq24144> esquemas){//
		irepository24144.saveAll(esquemas);
	}
	public void gravarEsq24414(List<FieEsq24414> esquemas){//
		irepository24414.saveAll(esquemas);
	}
	public void gravarEsq24441(List<FieEsq24441> esquemas){//
		irepository24441.saveAll(esquemas);
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
