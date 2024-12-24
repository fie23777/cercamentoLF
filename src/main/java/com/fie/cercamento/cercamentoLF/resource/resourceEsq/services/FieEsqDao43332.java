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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
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
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
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
		public String gravarEsq43332(List<FieEsq43332> esquemas){  
	        List<FieEsq43332> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository43332.existsByNumEsq43332(esquema.getNumEsq43332()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository43332.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq43323(List<FieEsq43323> esquemas){
	        List<FieEsq43323> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = (List<FieEsq43323>) esquemas.stream()
	                    .filter(esquema -> !irepository43323.existsByNumEsq43323(esquema.getNumEsq43323()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository43323.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq43233(List<FieEsq43233> esquemas){
	        List<FieEsq43233> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository43233.existsByNumEsq43233(esquema.getNumEsq43233()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository43233.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq42333(List<FieEsq42333> esquemas){
	        List<FieEsq42333> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository42333.existsByNumEsq42333(esquema.getNumEsq42333()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository42333.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq33342(List<FieEsq33342> esquemas){//
	        List<FieEsq33342> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository33342.existsByNumEsq33342(esquema.getNumEsq33342()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository33342.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq33324(List<FieEsq33324> esquemas){//
	        List<FieEsq33324> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository33324.existsByNumEsq33324(esquema.getNumEsq33324()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository33324.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq33423(List<FieEsq33423> esquemas){//
	        List<FieEsq33423> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository33423.existsByNumEsq33423(esquema.getNumEsq33423()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository33423.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq33243(List<FieEsq33243> esquemas){//
	        List<FieEsq33243> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository33243.existsByNumEsq33243(esquema.getNumEsq33243()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository33243.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq34233(List<FieEsq34233> esquemas){//
	        List<FieEsq34233> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository34233.existsByNumEsq34233(esquema.getNumEsq34233()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository34233.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq32433(List<FieEsq32433> esquemas){//
	        List<FieEsq32433> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository32433.existsByNumEsq32433(esquema.getNumEsq32433()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository32433.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq34332(List<FieEsq34332> esquemas){//
	        List<FieEsq34332> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository34332.existsByNumEsq34332(esquema.getNumEsq34332()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository34332.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq34323(List<FieEsq34323> esquemas){//
	        List<FieEsq34323> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository34323.existsByNumEsq34323(esquema.getNumEsq34323()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository34323.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq32334(List<FieEsq32334> esquemas){//
	        List<FieEsq32334> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository32334.existsByNumEsq32334(esquema.getNumEsq32334()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository32334.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq32343(List<FieEsq32343> esquemas){//
	        List<FieEsq32343> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository32343.existsByNumEsq32343(esquema.getNumEsq32343()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository32343.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq24333(List<FieEsq24333> esquemas){//
	        List<FieEsq24333> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository24333.existsByNumEsq24333(esquema.getNumEsq24333()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository24333.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq23433(List<FieEsq23433> esquemas){//
	        List<FieEsq23433> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository23433.existsByNumEsq23433(esquema.getNumEsq23433()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository23433.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq23343(List<FieEsq23343> esquemas){//
	        List<FieEsq23343> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository23343.existsByNumEsq23343(esquema.getNumEsq23343()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository23343.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
		}
		public String gravarEsq23334(List<FieEsq23334> esquemas){//
	        List<FieEsq23334> esquemasFiltrados;
	        synchronized(this) {
	            esquemasFiltrados = esquemas.stream()
	                    .filter(esquema -> !irepository23334.existsByNumEsq23334(esquema.getNumEsq23334()))
	                    .collect(Collectors.toList());

	            if (!esquemasFiltrados.isEmpty()) {
	                irepository23334.saveAll(esquemasFiltrados);
	                return GRAVADO_COM_SUCESSO;
	            } else {        	
	                return JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS;
	            }
	        }
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
