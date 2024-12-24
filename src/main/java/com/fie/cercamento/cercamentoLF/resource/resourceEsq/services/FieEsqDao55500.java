package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository00555;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository05055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository05505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository05550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository50055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository50505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository50550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository55005;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository55050;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55500.Irepository55500;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;


@Service
public class FieEsqDao55500 {
	
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
	
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository00555 irepository00555;
	@Autowired private Irepository05055 irepository05055;
	@Autowired private Irepository05505 irepository05505;
	@Autowired private Irepository05550 irepository05550;
	@Autowired private Irepository50055 irepository50055;
	@Autowired private Irepository50505 irepository50505;
	@Autowired private Irepository50550 irepository50550;
	@Autowired private Irepository55005 irepository55005;
	@Autowired private Irepository55050 irepository55050;
	@Autowired private Irepository55500 irepository55500; 
	
	//para o esquema fie gravar em banco
	
	//para o esquema fie gravar em banco
		public void gravarEsq55500(List<FieEsq55500> esquemas){  
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq55050(List<FieEsq55050> esquemas){
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq55005(List<FieEsq55005> esquemas){
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq50505(List<FieEsq50505> esquemas){
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq50550(List<FieEsq50550> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq50055(List<FieEsq50055> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq05055(List<FieEsq05055> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq05505(List<FieEsq05505> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq05550(List<FieEsq05550> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public void gravarEsq00555(List<FieEsq00555> esquemas){//
	        List<FieEsq44232> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository44232.existsByNumEsq44232(esquema.getNumEsq44232()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository44232.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
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
