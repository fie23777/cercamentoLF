package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq13533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq15333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq31533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq33513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq35331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq51333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model53331.FieEsq53331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository13335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository13353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository13533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository15333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository31335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository31353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository31533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository33153;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository33315;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository33351;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository33513;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository35133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository35313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository35331;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository51333;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository53133;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository53313;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository53331.Irepository53331;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Transactional
public class FieEsqDao53331 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository13335 irepository13335;
	@Autowired private Irepository13353 irepository13353;
	@Autowired private Irepository13533 irepository13533;
	@Autowired private Irepository15333 irepository15333;
	@Autowired private Irepository31335 irepository31335;
	@Autowired private Irepository31353 irepository31353;
	@Autowired private Irepository31533 irepository31533;
	@Autowired private Irepository33153 irepository33153;
	@Autowired private Irepository33315 irepository33315;
	@Autowired private Irepository33351 irepository33351;
	@Autowired private Irepository33513 irepository33513;
	@Autowired private Irepository35133 irepository35133;
	@Autowired private Irepository35313 irepository35313;
	@Autowired private Irepository35331 irepository35331;
	@Autowired private Irepository51333 irepository51333;
	@Autowired private Irepository53133 irepository53133;
	@Autowired private Irepository53313 irepository53313;
	@Autowired private Irepository53331 irepository53331;
	
	//para o esquema fie gravar em banco
	public void gravarEsq53331(List<FieEsq53331> esquemas){  
		irepository53331.saveAll(esquemas);
	}
	public void gravarEsq53313(List<FieEsq53313> esquemas){
		irepository53313.saveAll(esquemas);
	}
	public void gravarEsq53133(List<FieEsq53133> esquemas){
		irepository53133.saveAll(esquemas);
	}
	public void gravarEsq51333(List<FieEsq51333> esquemas){
		irepository51333.saveAll(esquemas);
	}
	public void gravarEsq33351(List<FieEsq33351> esquemas){//
		irepository33351.saveAll(esquemas);
	}
	public void gravarEsq33315(List<FieEsq33315> esquemas){//
		irepository33315.saveAll(esquemas);
	}
	public void gravarEsq33513(List<FieEsq33513> esquemas){//
		irepository33513.saveAll(esquemas);
	}
	public void gravarEsq33153(List<FieEsq33153> esquemas){//
		irepository33153.saveAll(esquemas);
	}
	public void gravarEsq35133(List<FieEsq35133> esquemas){//
		irepository35133.saveAll(esquemas);
	}
	public void gravarEsq31533(List<FieEsq31533> esquemas){//
		irepository31533.saveAll(esquemas);
	}
	public void gravarEsq35331(List<FieEsq35331> esquemas){//
		irepository35331.saveAll(esquemas);
	}
	public void gravarEsq35313(List<FieEsq35313> esquemas){//
		irepository35313.saveAll(esquemas);
	}
	public void gravarEsq31335(List<FieEsq31335> esquemas){//
		irepository31335.saveAll(esquemas);
	}
	public void gravarEsq31353(List<FieEsq31353> esquemas){//
		irepository31353.saveAll(esquemas);
	}
	public void gravarEsq15333(List<FieEsq15333> esquemas){//
		irepository15333.saveAll(esquemas);
	}
	public void gravarEsq13533(List<FieEsq13533> esquemas){//
		irepository13533.saveAll(esquemas);
	}
	public void gravarEsq13353(List<FieEsq13353> esquemas){//
		irepository13353.saveAll(esquemas);
	}
	public void gravarEsq13335(List<FieEsq13335> esquemas){//
		irepository13335.saveAll(esquemas);
	}
	
	
	
	
//para listar em tela 53331
	
	public List<FieEsq53331> listarFieEsq53331(String filtro) {
	       String consulta = "select l from FieEsq53331 l where l.numEsq53331 like :nuncerc";
	          TypedQuery<FieEsq53331> query = manager.createQuery(consulta, FieEsq53331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53313
	
	public List<FieEsq53313> listarFieEsq53313(String filtro) {
	       String consulta = "select l from FieEsq53313 l where l.numEsq53313 like :nuncerc";
	          TypedQuery<FieEsq53313> query = manager.createQuery(consulta, FieEsq53313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53133
	
	public List<FieEsq53133> listarFieEsq53133(String filtro) {
	       String consulta = "select l from FieEsq53133 l where l.numEsq53133 like :nuncerc";
	          TypedQuery<FieEsq53133> query = manager.createQuery(consulta, FieEsq53133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51333
	
	public List<FieEsq51333> listarFieEsq51333(String filtro) {
	       String consulta = "select l from FieEsq51333 l where l.numEsq51333 like :nuncerc";
	          TypedQuery<FieEsq51333> query = manager.createQuery(consulta, FieEsq51333.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	
	public List<FieEsq13335> listarFieEsq13335(String filtro) {
	       String consulta = "select l from FieEsq13335 l where l.numEsq13335 like :nuncerc";
	          TypedQuery<FieEsq13335> query = manager.createQuery(consulta, FieEsq13335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13353> listarFieEsq13353(String filtro) {
	       String consulta = "select l from FieEsq13353 l where l.numEsq13353 like :nuncerc";
	          TypedQuery<FieEsq13353> query = manager.createQuery(consulta, FieEsq13353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13533> listarFieEsq13533(String filtro) {
	       String consulta = "select l from FieEsq13533 l where l.numEsq13533 like :nuncerc";
	          TypedQuery<FieEsq13533> query = manager.createQuery(consulta, FieEsq13533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15333> listarFieEsq15333(String filtro) {
	       String consulta = "select l from FieEsq15333 l where l.numEsq15333 like :nuncerc";
	          TypedQuery<FieEsq15333> query = manager.createQuery(consulta, FieEsq15333.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31353> listarFieEsq31353(String filtro) {
	       String consulta = "select l from FieEsq31353 l where l.numEsq31353 like :nuncerc";
	          TypedQuery<FieEsq31353> query = manager.createQuery(consulta, FieEsq31353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31335> listarFieEsq31335(String filtro) {
	       String consulta = "select l from FieEsq31335 l where l.numEsq31335 like :nuncerc";
	          TypedQuery<FieEsq31335> query = manager.createQuery(consulta, FieEsq31335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35313> listarFieEsq35313(String filtro) {
	       String consulta = "select l from FieEsq35313 l where l.numEsq35313 like :nuncerc";
	          TypedQuery<FieEsq35313> query = manager.createQuery(consulta, FieEsq35313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35331> listarFieEsq35331(String filtro) {
	       String consulta = "select l from FieEsq35331 l where l.numEsq35331 like :nuncerc";
	          TypedQuery<FieEsq35331> query = manager.createQuery(consulta, FieEsq35331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31533> listarFieEsq31533(String filtro) {
	       String consulta = "select l from FieEsq31533 l where l.numEsq31533 like :nuncerc";
	          TypedQuery<FieEsq31533> query = manager.createQuery(consulta, FieEsq31533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35133> listarFieEsq35133(String filtro) {
	       String consulta = "select l from FieEsq35133l where l.numEsq35133like :nuncerc";
	          TypedQuery<FieEsq35133> query = manager.createQuery(consulta, FieEsq35133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33153> listarFieEsq33153(String filtro) {
	       String consulta = "select l from FieEsq33153 l where l.numEsq33153 like :nuncerc";
	          TypedQuery<FieEsq33153> query = manager.createQuery(consulta, FieEsq33153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33513> listarFieEsq33513(String filtro) {
	       String consulta = "select l from FieEsq33513 l where l.numEsq33513 like :nuncerc";
	          TypedQuery<FieEsq33513> query = manager.createQuery(consulta, FieEsq33513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33315> listarFieEsq33315(String filtro) {
	       String consulta = "select l from FieEsq33315 l where l.numEsq33315 like :nuncerc";
	          TypedQuery<FieEsq33315> query = manager.createQuery(consulta, FieEsq33315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33351> listarFieEsq33351(String filtro) {
	       String consulta = "select l from FieEsq33351 l where l.numEsq33351 like :nuncerc";
	          TypedQuery<FieEsq33351> query = manager.createQuery(consulta, FieEsq33351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
