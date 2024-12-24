package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322.FieEsq44232;
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
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository03444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository04344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository04434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository04443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository30444;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository34044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository34404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository34440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository40344;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository40434;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository40443;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository43044;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository43404;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository43440;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository44034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository44304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository44403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository44430.Irepository44430;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao44430 {
	
	private static final String GRAVADO_COM_SUCESSO = "Gravado com sucesso!";

	private static final String JÁ_EXISTE_ESSE_ESQUEMA_NO_BANCO_DE_DADOS = "Já existe esse esquema no banco de dados";
	
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository03444 irepository03444;
	@Autowired private Irepository04344 irepository04344;
	@Autowired private Irepository04434 irepository04434;
	@Autowired private Irepository04443 irepository04443;
	@Autowired private Irepository30444 irepository30444;
	@Autowired private Irepository34044 irepository34044;
	@Autowired private Irepository34404 irepository34404;
	@Autowired private Irepository34440 irepository34440;
	@Autowired private Irepository40344 irepository40344;
	@Autowired private Irepository40434 irepository40434;
	@Autowired private Irepository40443 irepository40443;
	@Autowired private Irepository43044 irepository43044;
	@Autowired private Irepository43404 irepository43404;
	@Autowired private Irepository43440 irepository43440;
	@Autowired private Irepository44034 irepository44034;
	@Autowired private Irepository44304 irepository44304;
	@Autowired private Irepository44403 irepository44403;
	@Autowired private Irepository44430 irepository44430; 
	
	//para o esquema fie gravar em banco
	
	public String gravarEsq34440(List<FieEsq34440> esquemas){  
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
	public String gravarEsq34404(List<FieEsq34404> esquemas){
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
	public String gravarEsq34044(List<FieEsq34044> esquemas){
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
	public String gravarEsq30444(List<FieEsq30444> esquemas){
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
	public String gravarEsq44430(List<FieEsq44430> esquemas){//
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
	public String gravarEsq44403(List<FieEsq44403> esquemas){//
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
	public String gravarEsq44304(List<FieEsq44304> esquemas){//
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
	public String gravarEsq44034(List<FieEsq44034> esquemas){//
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
	public String gravarEsq43044(List<FieEsq43044> esquemas){//
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
	public String gravarEsq40344(List<FieEsq40344> esquemas){//
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
	public String gravarEsq43440(List<FieEsq43440> esquemas){//
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
	public String gravarEsq43404(List<FieEsq43404> esquemas){//
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
	public String gravarEsq40443(List<FieEsq40443> esquemas){//
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
	public String gravarEsq40434(List<FieEsq40434> esquemas){//
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
	public String gravarEsq03444(List<FieEsq03444> esquemas){//
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
	public String gravarEsq04344(List<FieEsq04344> esquemas){//
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
	public String gravarEsq04434(List<FieEsq04434> esquemas){//
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
	public String gravarEsq04443(List<FieEsq04443> esquemas){//
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
