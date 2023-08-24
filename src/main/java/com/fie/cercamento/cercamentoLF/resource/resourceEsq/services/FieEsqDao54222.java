package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22245;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22254;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22452;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq22542;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq24522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq25422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq42522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq45222;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq52422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54222.FieEsq54222;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository22245;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository22254;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository22452;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository22542;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository24225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository24252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository24522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository25224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository25242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository25422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository42225;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository42252;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository42522;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository45222;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository52224;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository52242;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository52422;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54222.Irepository54222;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
public class FieEsqDao54222 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository22245 irepository22245;
	@Autowired private Irepository22254 irepository22254;
	@Autowired private Irepository22452 irepository22452;
	@Autowired private Irepository22542 irepository22542;
	@Autowired private Irepository24225 irepository24225;
	@Autowired private Irepository24252 irepository24252;
	@Autowired private Irepository24522 irepository24522;
	@Autowired private Irepository25224 irepository25224;
	@Autowired private Irepository25242 irepository25242;
	@Autowired private Irepository25422 irepository25422;
	@Autowired private Irepository42225 irepository42225;
	@Autowired private Irepository42252 irepository42252;
	@Autowired private Irepository42522 irepository42522;
	@Autowired private Irepository45222 irepository45222;
	@Autowired private Irepository52224 irepository52224;
	@Autowired private Irepository52242 irepository52242;
	@Autowired private Irepository52422 irepository52422;
	@Autowired private Irepository54222 irepository54222; 
	
	//para o esquema fie gravar em banco
	
		public void gravarEsq52224(List<FieEsq52224> esquemas){  
			irepository52224.saveAll(esquemas);
		}
		public void gravarEsq52242(List<FieEsq52242> esquemas){
			irepository52242.saveAll(esquemas);
		}
		public void gravarEsq52422(List<FieEsq52422> esquemas){
			irepository52422.saveAll(esquemas);
		}
		public void gravarEsq54222(List<FieEsq54222> esquemas){
			irepository54222.saveAll(esquemas);
		}
		public void gravarEsq22254(List<FieEsq22254> esquemas){//
			irepository22254.saveAll(esquemas);
		}
		public void gravarEsq22245(List<FieEsq22245> esquemas){//
			irepository22245.saveAll(esquemas);
		}
		public void gravarEsq22542(List<FieEsq22542> esquemas){//
			irepository22542.saveAll(esquemas);
		}
		public void gravarEsq22452(List<FieEsq22452> esquemas){//
			irepository22452.saveAll(esquemas);
		}
		public void gravarEsq25422(List<FieEsq25422> esquemas){//
			irepository25422.saveAll(esquemas);
		}
		public void gravarEsq42522(List<FieEsq42522> esquemas){//
			irepository42522.saveAll(esquemas);
		}
		public void gravarEsq25224(List<FieEsq25224> esquemas){//
			irepository25224.saveAll(esquemas);
		}
		public void gravarEsq25242(List<FieEsq25242> esquemas){//
			irepository25242.saveAll(esquemas);
		}
		public void gravarEsq24225(List<FieEsq24225> esquemas){//
			irepository24225.saveAll(esquemas);
		}
		public void gravarEsq24252(List<FieEsq24252> esquemas){//
			irepository24252.saveAll(esquemas);
		}
		public void gravarEsq45222(List<FieEsq45222> esquemas){//
			irepository45222.saveAll(esquemas);
		}
		public void gravarEsq24522(List<FieEsq24522> esquemas){//
			irepository24522.saveAll(esquemas);
		}
		public void gravarEsq42252(List<FieEsq42252> esquemas){//
			irepository42252.saveAll(esquemas);
		}
		public void gravarEsq42225(List<FieEsq42225> esquemas){//
			irepository42225.saveAll(esquemas);
		}
		
		
		
		
	//para listar em tela 52224
		
		public List<FieEsq52224> listarFieEsq52224(String filtro) {
		       String consulta = "select l from FieEsq52224 l where l.numEsq52224 like :nuncerc";
		          TypedQuery<FieEsq52224> query = manager.createQuery(consulta, FieEsq52224.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 52242
		
		public List<FieEsq52242> listarFieEsq52242(String filtro) {
		       String consulta = "select l from FieEsq52242 l where l.numEsq52242 like :nuncerc";
		          TypedQuery<FieEsq52242> query = manager.createQuery(consulta, FieEsq52242.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 52422
		
		public List<FieEsq52422> listarFieEsq52422(String filtro) {
		       String consulta = "select l from FieEsq52422 l where l.numEsq52422 like :nuncerc";
		          TypedQuery<FieEsq52422> query = manager.createQuery(consulta, FieEsq52422.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 54222
		
		public List<FieEsq54222> listarFieEsq54222(String filtro) {
		       String consulta = "select l from FieEsq54222 l where l.numEsq54222 like :nuncerc";
		          TypedQuery<FieEsq54222> query = manager.createQuery(consulta, FieEsq54222.class).setMaxResults(10);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
	//************************************************************************************************************************
		
		
		
		
		public List<FieEsq42225> listarFieEsq42225(String filtro) {
		       String consulta = "select l from FieEsq42225 l where l.numEsq42225 like :nuncerc";
		          TypedQuery<FieEsq42225> query = manager.createQuery(consulta, FieEsq42225.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq42252> listarFieEsq42252(String filtro) {
		       String consulta = "select l from FieEsq42252 l where l.numEsq42252 like :nuncerc";
		          TypedQuery<FieEsq42252> query = manager.createQuery(consulta, FieEsq42252.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24522> listarFieEsq24522(String filtro) {
		       String consulta = "select l from FieEsq24522 l where l.numEsq24522 like :nuncerc";
		          TypedQuery<FieEsq24522> query = manager.createQuery(consulta, FieEsq24522.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq45222> listarFieEsq45222(String filtro) {
		       String consulta = "select l from FieEsq45222 l where l.numEsq45222 like :nuncerc";
		          TypedQuery<FieEsq45222> query = manager.createQuery(consulta, FieEsq45222.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24252> listarFieEsq24252(String filtro) {
		       String consulta = "select l from FieEsq24252 l where l.numEsq24252 like :nuncerc";
		          TypedQuery<FieEsq24252> query = manager.createQuery(consulta, FieEsq24252.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24225> listarFieEsq24225(String filtro) {
		       String consulta = "select l from FieEsq24225 l where l.numEsq24225 like :nuncerc";
		          TypedQuery<FieEsq24225> query = manager.createQuery(consulta, FieEsq24225.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25242> listarFieEsq25242(String filtro) {
		       String consulta = "select l from FieEsq25242 l where l.numEsq25242 like :nuncerc";
		          TypedQuery<FieEsq25242> query = manager.createQuery(consulta, FieEsq25242.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25224> listarFieEsq25224(String filtro) {
		       String consulta = "select l from FieEsq25224 l where l.numEsq25224 like :nuncerc";
		          TypedQuery<FieEsq25224> query = manager.createQuery(consulta, FieEsq25224.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq42522> listarFieEsq42522(String filtro) {
		       String consulta = "select l from FieEsq42522 l where l.numEsq42522 like :nuncerc";
		          TypedQuery<FieEsq42522> query = manager.createQuery(consulta, FieEsq42522.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25422> listarFieEsq25422(String filtro) {
		       String consulta = "select l from FieEsq25422l where l.numEsq25422like :nuncerc";
		          TypedQuery<FieEsq25422> query = manager.createQuery(consulta, FieEsq25422.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22452> listarFieEsq22452(String filtro) {
		       String consulta = "select l from FieEsq22452 l where l.numEsq22452 like :nuncerc";
		          TypedQuery<FieEsq22452> query = manager.createQuery(consulta, FieEsq22452.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22542> listarFieEsq22542(String filtro) {
		       String consulta = "select l from FieEsq22542 l where l.numEsq22542 like :nuncerc";
		          TypedQuery<FieEsq22542> query = manager.createQuery(consulta, FieEsq22542.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22245> listarFieEsq22245(String filtro) {
		       String consulta = "select l from FieEsq22245 l where l.numEsq22245 like :nuncerc";
		          TypedQuery<FieEsq22245> query = manager.createQuery(consulta, FieEsq22245.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22254> listarFieEsq22254(String filtro) {
		       String consulta = "select l from FieEsq22254 l where l.numEsq22254 like :nuncerc";
		          TypedQuery<FieEsq22254> query = manager.createQuery(consulta, FieEsq22254.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}

}
