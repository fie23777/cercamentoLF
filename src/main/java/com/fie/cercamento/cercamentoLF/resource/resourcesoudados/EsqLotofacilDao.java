package com.fie.cercamento.cercamentoLF.resource.resourcesoudados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCinco;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.IEsqCinco;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDois;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.IEsqDois;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatro;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.IEsqQuatro;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTres;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.IEsqTres;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUm;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.IEsqUm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EsqLotofacilDao {
    @PersistenceContext
	private EntityManager manager;
	@Autowired
	private IEsqUm iEsqUmRepository;
	@Autowired
	private IEsqDois iEsqDoisRepository;
	@Autowired
	private IEsqTres iEsqTresRepository;
	@Autowired
	private IEsqQuatro iEsqQuatroRepository;
	@Autowired
	private IEsqCinco iEsqCincoRepository;
	
	
	//*****************************************************Inserir no banco*********************************
	public void gravarEsqUm(List<EsqUm> numerosEsqUm){
		iEsqUmRepository.saveAll(numerosEsqUm);
	}
	public void gravarEsqDois(List<EsqDois> numerosEsqDois){
		iEsqDoisRepository.saveAll(numerosEsqDois);
	}
	public void gravarEsqTres(List<EsqTres> numerosEsqTres){
		iEsqTresRepository.saveAll(numerosEsqTres);
	}
	public void gravarEsqQuatro(List<EsqQuatro> numerosEsqQuatro){
		iEsqQuatroRepository.saveAll(numerosEsqQuatro);
	}
	public void gravarEsqCinco(List<EsqCinco> numerosEsqCinco){
		iEsqCincoRepository.saveAll(numerosEsqCinco);
	}
	//***************************************************************************Lista de 5****************************
	public String listarEsqUm5(){
		return "1-2-3-4-5-";
	}
	public String listarEsqDois5(){
		return "6-7-8-9-10-";
	}
	public String listarEsqTres5(){
		return "11-12-13-14-15-";
	}
	public String listarEsqQuatro5(){
		return "16-17-18-19-20-";
	}
	public String listarEsqCinco5(){
		return "21-22-23-24-25";
	}
//*****************************************************************************Lista de 1*****************************
	
public String[] listarEsqUm1(){
	String[] recrutas = {"1-","2-","3-","4-","5-"};

	return recrutas;
	
}
public String[] listarEsqDois1(){
	String[] recrutas = {"6-","7-","8-","9-","10-"};

	return recrutas;
	
}
public String[] listarEsqTres1(){
	String[] recrutas = {"11-","12-","13-","14-","15-"};

	return recrutas;
	
}
public String[] listarEsqQuatro1(){
	String[] recrutas = {"16-","17-","18-","19-","20-"};

	return recrutas;
	
}
public String[] listarEsqCinco1(){
	String[] recrutas = {"21","22","23","24","25"};

	return recrutas;
	
}
	//***********************************************************************************************Lista de 2 3 ou 4 de Um*******************************
	
	//listar um esquema 2, 3 ou 4 
	public List<EsqUm> listarEsqUm2() {
	       String consulta = "select l from EsqUm l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUm> query = manager.createQuery(consulta, EsqUm.class);
	                                      query.setParameter("numInicio", 1);
	                                      query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqUm> listarEsqUm3() {
	       String consulta = "select l from EsqUm l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUm> query = manager.createQuery(consulta, EsqUm.class);
	                                      query.setParameter("numInicio", 11);
	                                      query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqUm> listarEsqUm4() {
	       String consulta = "select l from EsqUm l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUm> query = manager.createQuery(consulta, EsqUm.class);
	                                      query.setParameter("numInicio", 21);
	                                      query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
//***************************************************************************************************************	
	
	//listar dois esquema 2, 3 ou 4 	
	
	
	public List<EsqDois> listarEsqDois2() {
	       String consulta = "select l from EsqDois l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDois> query = manager.createQuery(consulta, EsqDois.class);
	                                                query.setParameter("numInicio", 1);
                                                    query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqDois> listarEsqDois3() {
	       String consulta = "select l from EsqDois l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDois> query = manager.createQuery(consulta, EsqDois.class);
	                                                query.setParameter("numInicio", 11);
                                                 query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqDois> listarEsqDois4() {
	       String consulta = "select l from EsqDois l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDois> query = manager.createQuery(consulta, EsqDois.class);
	                                                query.setParameter("numInicio", 21);
                                                 query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
//*************************************************************************************************************************8	
	
	
	
	
	
	//listar tres esquema 2, 3 ou 4 
	
	
	public List<EsqTres> listarEsqTres2() {
	       String consulta = "select l from EsqTres l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTres> query = manager.createQuery(consulta, EsqTres.class);
                                          query.setParameter("numInicio", 1);
                                          query.setParameter("numFinal", 10);	                                      
	      return  query.getResultList();
		}
	public List<EsqTres> listarEsqTres3() {
	       String consulta = "select l from EsqTres l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTres> query = manager.createQuery(consulta, EsqTres.class);
                                       query.setParameter("numInicio", 11);
                                       query.setParameter("numFinal", 20);	                                      
	      return  query.getResultList();
		}
	public List<EsqTres> listarEsqTres4() {
	       String consulta = "select l from EsqTres l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTres> query = manager.createQuery(consulta, EsqTres.class);
                                       query.setParameter("numInicio", 21);
                                       query.setParameter("numFinal", 25);	                                      
	      return  query.getResultList();
		}
	
	
//***********************************************************************************************************	
	
	
	//listar quatro esquema 2, 3 ou 4
	
	public List<EsqQuatro> listarEsqQuatro2() {
	       String consulta = "select l from EsqQuatro l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatro> query = manager.createQuery(consulta, EsqQuatro.class);
                                           query.setParameter("numInicio", 1);
                                           query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqQuatro> listarEsqQuatro3() {
	       String consulta = "select l from EsqQuatro l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatro> query = manager.createQuery(consulta, EsqQuatro.class);
                                        query.setParameter("numInicio", 11);
                                        query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqQuatro> listarEsqQuatro4() {
	       String consulta = "select l from EsqQuatro l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatro> query = manager.createQuery(consulta, EsqQuatro.class);
                                        query.setParameter("numInicio", 21);
                                        query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
	
//*******************************************************************************************************************8	
	
	
	//listar cinco esquema 2, 3 ou 4	
	
	public List<EsqCinco> listarEsqCinco2() {
	       String consulta = "select l from EsqCinco l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCinco> query = manager.createQuery(consulta, EsqCinco.class);
                                           query.setParameter("numInicio", 1);
                                           query.setParameter("numFinal", 10);

	      return  query.getResultList();
		}
	public List<EsqCinco> listarEsqCinco3() {
	       String consulta = "select l from EsqCinco l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCinco> query = manager.createQuery(consulta, EsqCinco.class);
                                        query.setParameter("numInicio", 11);
                                        query.setParameter("numFinal", 20);

	      return  query.getResultList();
		}
	public List<EsqCinco> listarEsqCinco4() {
	       String consulta = "select l from EsqCinco l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCinco> query = manager.createQuery(consulta, EsqCinco.class);
                                        query.setParameter("numInicio", 21);
                                        query.setParameter("numFinal", 25);

	      return  query.getResultList();
		}
}
