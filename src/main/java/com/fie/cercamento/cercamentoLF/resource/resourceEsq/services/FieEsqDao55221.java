package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq12552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq15522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq21552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq22551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq25521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq51522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq52521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55122;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55212;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55221.FieEsq55221;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository12255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository12525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository12552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository15225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository15252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository15522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository21255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository21525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository21552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository22155;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository22515;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository22551;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository25521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository51225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository51252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository51522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52125;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52152;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52215;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52251;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52512;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository52521;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository55122;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository55212;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55221.Irepository55221;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao55221 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository12255 irepository12255;
	@Autowired private Irepository12525 irepository12525;
	@Autowired private Irepository12552 irepository12552;
	@Autowired private Irepository15225 irepository15225;
	@Autowired private Irepository15252 irepository15252;
	@Autowired private Irepository15522 irepository15522;
	@Autowired private Irepository21255 irepository21255;
	@Autowired private Irepository21525 irepository21525;
	@Autowired private Irepository21552 irepository21552;
	@Autowired private Irepository22155 irepository22155;
	@Autowired private Irepository22515 irepository22515;
	@Autowired private Irepository22551 irepository22551;
	@Autowired private Irepository25125 irepository25125;
	@Autowired private Irepository25152 irepository25152;
	@Autowired private Irepository25215 irepository25215;
	@Autowired private Irepository25251 irepository25251;
	@Autowired private Irepository25512 irepository25512;
	@Autowired private Irepository25521 irepository25521;
	@Autowired private Irepository51225 irepository51225;
	@Autowired private Irepository51252 irepository51252;
	@Autowired private Irepository51522 irepository51522;
	@Autowired private Irepository52125 irepository52125;
	@Autowired private Irepository52152 irepository52152;
	@Autowired private Irepository52215 irepository52215;
	@Autowired private Irepository52251 irepository52251;
	@Autowired private Irepository52512 irepository52512;
	@Autowired private Irepository52521 irepository52521;
	@Autowired private Irepository55122 irepository55122;
	@Autowired private Irepository55212 irepository55212;
	@Autowired private Irepository55221 irepository55221;
	
	//para o esquema fie gravar em banco
	
	//*******************************************************************************8
	public void gravarEsq55122(List<FieEsq55122> esquemas){  
		irepository55122.saveAll(esquemas);
	}
	public void gravarEsq55212(List<FieEsq55212> esquemas){
		irepository55212.saveAll(esquemas);
	}
	public void gravarEsq55221(List<FieEsq55221> esquemas){
		irepository55221.saveAll(esquemas);
	}
	public void gravarEsq51522(List<FieEsq51522> esquemas){
		irepository51522.saveAll(esquemas);
	}
	public void gravarEsq51252(List<FieEsq51252> esquemas){//
		irepository51252.saveAll(esquemas);
	}
	public void gravarEsq51225(List<FieEsq51225> esquemas){//
		irepository51225.saveAll(esquemas);
	}
	public void gravarEsq52512(List<FieEsq52512> esquemas){//
		irepository52512.saveAll(esquemas);
	}
	public void gravarEsq52521(List<FieEsq52521> esquemas){//
		irepository52521.saveAll(esquemas);
	}
	public void gravarEsq52152(List<FieEsq52152> esquemas){//
		irepository52152.saveAll(esquemas);
	}
	public void gravarEsq52125(List<FieEsq52125> esquemas){//
		irepository52125.saveAll(esquemas);
	}
	public void gravarEsq52251(List<FieEsq52251> esquemas){//
		irepository52251.saveAll(esquemas);
	}
	public void gravarEsq52215(List<FieEsq52215> esquemas){//
		irepository52215.saveAll(esquemas);
	}
	public void gravarEsq15522(List<FieEsq15522> esquemas){//
		irepository15522.saveAll(esquemas);
	}
	public void gravarEsq15252(List<FieEsq15252> esquemas){//
		irepository15252.saveAll(esquemas);
	}
	public void gravarEsq15225(List<FieEsq15225> esquemas){//
		irepository15225.saveAll(esquemas);
	}
	public void gravarEsq12255(List<FieEsq12255> esquemas){//
		irepository12255.saveAll(esquemas);
	}
	public void gravarEsq12525(List<FieEsq12525> esquemas){//
		irepository12525.saveAll(esquemas);
	}
	public void gravarEsq12552(List<FieEsq12552> esquemas){//
		irepository12552.saveAll(esquemas);
	}
	public void gravarEsq22155(List<FieEsq22155> esquemas){//
		irepository22155.saveAll(esquemas);
	}
	public void gravarEsq22515(List<FieEsq22515> esquemas){//
		irepository22515.saveAll(esquemas);
	}
	public void gravarEsq22551(List<FieEsq22551> esquemas){//
		irepository22551.saveAll(esquemas);
	}
	public void gravarEsq21255(List<FieEsq21255> esquemas){//
		irepository21255.saveAll(esquemas);
	}
	public void gravarEsq21525(List<FieEsq21525> esquemas){//
		irepository21525.saveAll(esquemas);
	}
	public void gravarEsq21552(List<FieEsq21552> esquemas){//
		irepository21552.saveAll(esquemas);	
	}
	public void gravarEsq25215(List<FieEsq25215> esquemas){//
		irepository25215.saveAll(esquemas);
	}
	public void gravarEsq25251(List<FieEsq25251> esquemas){//
		irepository25251.saveAll(esquemas);
	}
	public void gravarEsq25125(List<FieEsq25125> esquemas){//
		irepository25125.saveAll(esquemas);
	}
	public void gravarEsq25152(List<FieEsq25152> esquemas){//
		irepository25152.saveAll(esquemas);
	}
	public void gravarEsq25521(List<FieEsq25521> esquemas){//
		irepository25521.saveAll(esquemas);
	}
	public void gravarEsq25512(List<FieEsq25512> esquemas){//
		irepository25512.saveAll(esquemas);
	}
	
	
	
//para listar em tela 55122
	
	public List<FieEsq55122> listarFieEsq55122(String filtro) {
	       String consulta = "select l from FieEsq55122 l where l.numEsq55122 like :nuncerc";
	          TypedQuery<FieEsq55122> query = manager.createQuery(consulta, FieEsq55122.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55212
	
	public List<FieEsq55212> listarFieEsq55212(String filtro) {
	       String consulta = "select l from FieEsq55212 l where l.numEsq55212 like :nuncerc";
	          TypedQuery<FieEsq55212> query = manager.createQuery(consulta, FieEsq55212.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55221
	
	public List<FieEsq55221> listarFieEsq55221(String filtro) {
	       String consulta = "select l from FieEsq55221 l where l.numEsq55221 like :nuncerc";
	          TypedQuery<FieEsq55221> query = manager.createQuery(consulta, FieEsq55221.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51522
	
	public List<FieEsq51522> listarFieEsq51522(String filtro) {
	       String consulta = "select l from FieEsq51522 l where l.numEsq51522 like :nuncerc";
	          TypedQuery<FieEsq51522> query = manager.createQuery(consulta, FieEsq51522.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq25512> listarFieEsq25512(String filtro) {
	       String consulta = "select l from FieEsq25512 l where l.numEsq25512 like :nuncerc";
	          TypedQuery<FieEsq25512> query = manager.createQuery(consulta, FieEsq25512.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25152> listarFieEsq25152(String filtro) {
	       String consulta = "select l from FieEsq25152 l where l.numEsq25152 like :nuncerc";
	          TypedQuery<FieEsq25152> query = manager.createQuery(consulta, FieEsq25152.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25125> listarFieEsq25125(String filtro) {
	       String consulta = "select l from FieEsq25125 l where l.numEsq25125 like :nuncerc";
	          TypedQuery<FieEsq25125> query = manager.createQuery(consulta, FieEsq25125.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25251> listarFieEsq25251(String filtro) {
	       String consulta = "select l from FieEsq25251 l where l.numEsq25251 like :nuncerc";
	          TypedQuery<FieEsq25251> query = manager.createQuery(consulta, FieEsq25251.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25215> listarFieEsq25215(String filtro) {
	       String consulta = "select l from FieEsq25215 l where l.numEsq25215 like :nuncerc";
	          TypedQuery<FieEsq25215> query = manager.createQuery(consulta, FieEsq25215.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21552> listarFieEsq21552(String filtro) {
	       String consulta = "select l from FieEsq21552 l where l.numEsq21552 like :nuncerc";
	          TypedQuery<FieEsq21552> query = manager.createQuery(consulta, FieEsq21552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21525> listarFieEsq21525(String filtro) {
	       String consulta = "select l from FieEsq21525 l where l.numEsq21525 like :nuncerc";
	          TypedQuery<FieEsq21525> query = manager.createQuery(consulta, FieEsq21525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21255> listarFieEsq21255(String filtro) {
	       String consulta = "select l from FieEsq21255 l where l.numEsq21255 like :nuncerc";
	          TypedQuery<FieEsq21255> query = manager.createQuery(consulta, FieEsq21255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22551> listarFieEsq22551(String filtro) {
	       String consulta = "select l from FieEsq22551 l where l.numEsq22551 like :nuncerc";
	          TypedQuery<FieEsq22551> query = manager.createQuery(consulta, FieEsq22551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22515> listarFieEsq22515(String filtro) {
	       String consulta = "select l from FieEsq22515 l where l.numEsq22515 like :nuncerc";
	          TypedQuery<FieEsq22515> query = manager.createQuery(consulta, FieEsq22515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22155> listarFieEsq22155(String filtro) {
	       String consulta = "select l from FieEsq22155 l where l.numEsq22155 like :nuncerc";
	          TypedQuery<FieEsq22155> query = manager.createQuery(consulta, FieEsq22155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12552> listarFieEsq12552(String filtro) {
	       String consulta = "select l from FieEsq12552 l where l.numEsq12552 like :nuncerc";
	          TypedQuery<FieEsq12552> query = manager.createQuery(consulta, FieEsq12552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12525> listarFieEsq12525(String filtro) {
	       String consulta = "select l from FieEsq12525 l where l.numEsq12525 like :nuncerc";
	          TypedQuery<FieEsq12525> query = manager.createQuery(consulta, FieEsq12525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12255> listarFieEsq12255(String filtro) {
	       String consulta = "select l from FieEsq12255 l where l.numEsq12255 like :nuncerc";
	          TypedQuery<FieEsq12255> query = manager.createQuery(consulta, FieEsq12255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15225> listarFieEsq15225(String filtro) {
	       String consulta = "select l from FieEsq15225 l where l.numEsq15225 like :nuncerc";
	          TypedQuery<FieEsq15225> query = manager.createQuery(consulta, FieEsq15225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15252> listarFieEsq15252(String filtro) {
	       String consulta = "select l from FieEsq15252 l where l.numEsq15252 like :nuncerc";
	          TypedQuery<FieEsq15252> query = manager.createQuery(consulta, FieEsq15252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15522> listarFieEsq15522(String filtro) {
	       String consulta = "select l from FieEsq15522 l where l.numEsq15522 like :nuncerc";
	          TypedQuery<FieEsq15522> query = manager.createQuery(consulta, FieEsq15522.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52215> listarFieEsq52215(String filtro) {
	       String consulta = "select l from FieEsq52215 l where l.numEsq52215 like :nuncerc";
	          TypedQuery<FieEsq52215> query = manager.createQuery(consulta, FieEsq52215.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52251> listarFieEsq52251(String filtro) {
	       String consulta = "select l from FieEsq52251 l where l.numEsq52251 like :nuncerc";
	          TypedQuery<FieEsq52251> query = manager.createQuery(consulta, FieEsq52251.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52125> listarFieEsq52125(String filtro) {
	       String consulta = "select l from FieEsq52125 l where l.numEsq52125 like :nuncerc";
	          TypedQuery<FieEsq52125> query = manager.createQuery(consulta, FieEsq52125.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52152> listarFieEsq52152(String filtro) {
	       String consulta = "select l from FieEsq52152 l where l.numEsq52152 like :nuncerc";
	          TypedQuery<FieEsq52152> query = manager.createQuery(consulta, FieEsq52152.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52521> listarFieEsq52521(String filtro) {
	       String consulta = "select l from FieEsq52521 l where l.numEsq52521 like :nuncerc";
	          TypedQuery<FieEsq52521> query = manager.createQuery(consulta, FieEsq52521.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52512> listarFieEsq52512(String filtro) {
	       String consulta = "select l from FieEsq52512 l where l.numEsq52512 like :nuncerc";
	          TypedQuery<FieEsq52512> query = manager.createQuery(consulta, FieEsq52512.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51225> listarFieEsq51225(String filtro) {
	       String consulta = "select l from FieEsq51225 l where l.numEsq51225 like :nuncerc";
	          TypedQuery<FieEsq51225> query = manager.createQuery(consulta, FieEsq51225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51252> listarFieEsq51252(String filtro) {
	       String consulta = "select l from FieEsq51252 l where l.numEsq51252 like :nuncerc";
	          TypedQuery<FieEsq51252> query = manager.createQuery(consulta, FieEsq51252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}

