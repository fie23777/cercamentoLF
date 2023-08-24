package com.fie.cercamento.cercamentoLF.resource.resourcesoudados;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.EsqCincoModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco.IEsqCinco;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.EsqDoisModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois.IEsqDois;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.EsqQuatroModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoquatro.IEsqQuatro;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.EsqTresModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres.IEsqTres;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.EsqUmModel;
import com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum.IEsqUm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Service
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
	public void gravarEsqUm(List<EsqUmModel> numerosEsqUm){
		iEsqUmRepository.saveAll(numerosEsqUm);
	}
	public void gravarEsqDois(List<EsqDoisModel> numerosEsqDois){
		iEsqDoisRepository.saveAll(numerosEsqDois);
	}
	public void gravarEsqTres(List<EsqTresModel> numerosEsqTres){
		iEsqTresRepository.saveAll(numerosEsqTres);
	}
	public void gravarEsqQuatro(List<EsqQuatroModel> numerosEsqQuatro){
		iEsqQuatroRepository.saveAll(numerosEsqQuatro);
	}
	public void gravarEsqCinco(List<EsqCincoModel> numerosEsqCinco){
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
	public List<EsqUmModel> listarEsqUm2() {
	       String consulta = "select l from EsqUmModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUmModel> query = manager.createQuery(consulta, EsqUmModel.class);
	                                      query.setParameter("numInicio", 1);
	                                      query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqUmModel> listarEsqUm3() {
	       String consulta = "select l from EsqUmModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUmModel> query = manager.createQuery(consulta, EsqUmModel.class);
	                                      query.setParameter("numInicio", 11);
	                                      query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqUmModel> listarEsqUm4() {
	       String consulta = "select l from EsqUmModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqUmModel> query = manager.createQuery(consulta, EsqUmModel.class);
	                                      query.setParameter("numInicio", 21);
	                                      query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
//***************************************************************************************************************	
	
	//listar dois esquema 2, 3 ou 4 	
	
	
	public List<EsqDoisModel> listarEsqDois2() {
	       String consulta = "select l from EsqDoisModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDoisModel> query = manager.createQuery(consulta, EsqDoisModel.class);
	                                                query.setParameter("numInicio", 1);
                                                    query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqDoisModel> listarEsqDois3() {
	       String consulta = "select l from EsqDoisModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDoisModel> query = manager.createQuery(consulta, EsqDoisModel.class);
	                                                query.setParameter("numInicio", 11);
                                                 query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqDoisModel> listarEsqDois4() {
	       String consulta = "select l from EsqDoisModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqDoisModel> query = manager.createQuery(consulta, EsqDoisModel.class);
	                                                query.setParameter("numInicio", 21);
                                                 query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
//*************************************************************************************************************************8	
	
	
	
	
	
	//listar tres esquema 2, 3 ou 4 
	
	
	public List<EsqTresModel> listarEsqTres2() {
	       String consulta = "select l from EsqTresModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTresModel> query = manager.createQuery(consulta, EsqTresModel.class);
                                          query.setParameter("numInicio", 1);
                                          query.setParameter("numFinal", 10);	                                      
	      return  query.getResultList();
		}
	public List<EsqTresModel> listarEsqTres3() {
	       String consulta = "select l from EsqTresModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTresModel> query = manager.createQuery(consulta, EsqTresModel.class);
                                       query.setParameter("numInicio", 11);
                                       query.setParameter("numFinal", 20);	                                      
	      return  query.getResultList();
		}
	public List<EsqTresModel> listarEsqTres4() {
	       String consulta = "select l from EsqTresModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqTresModel> query = manager.createQuery(consulta, EsqTresModel.class);
                                       query.setParameter("numInicio", 21);
                                       query.setParameter("numFinal", 25);	                                      
	      return  query.getResultList();
		}
	
	
//***********************************************************************************************************	
	
	
	//listar quatro esquema 2, 3 ou 4
	
	public List<EsqQuatroModel> listarEsqQuatro2() {
	       String consulta = "select l from EsqQuatroModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatroModel> query = manager.createQuery(consulta, EsqQuatroModel.class);
                                           query.setParameter("numInicio", 1);
                                           query.setParameter("numFinal", 10);
	      return  query.getResultList();
		}
	public List<EsqQuatroModel> listarEsqQuatro3() {
	       String consulta = "select l from EsqQuatroModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatroModel> query = manager.createQuery(consulta, EsqQuatroModel.class);
                                        query.setParameter("numInicio", 11);
                                        query.setParameter("numFinal", 20);
	      return  query.getResultList();
		}
	public List<EsqQuatroModel> listarEsqQuatro4() {
	       String consulta = "select l from EsqQuatroModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqQuatroModel> query = manager.createQuery(consulta, EsqQuatroModel.class);
                                        query.setParameter("numInicio", 21);
                                        query.setParameter("numFinal", 25);
	      return  query.getResultList();
		}
	
	
//*******************************************************************************************************************8	
	
	
	//listar cinco esquema 2, 3 ou 4	
	
	public List<EsqCincoModel> listarEsqCinco2() {
	       String consulta = "select l from EsqCincoModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCincoModel> query = manager.createQuery(consulta, EsqCincoModel.class);
                                           query.setParameter("numInicio", 1);
                                           query.setParameter("numFinal", 10);

	      return  query.getResultList();
		}
	public List<EsqCincoModel> listarEsqCinco3() {
	       String consulta = "select l from EsqCincoModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCincoModel> query = manager.createQuery(consulta, EsqCincoModel.class);
                                        query.setParameter("numInicio", 11);
                                        query.setParameter("numFinal", 20);

	      return  query.getResultList();
		}
	public List<EsqCincoModel> listarEsqCinco4() {
	       String consulta = "select l from EsqCincoModel l where l.id BETWEEN :numInicio AND :numFinal";
	          TypedQuery<EsqCincoModel> query = manager.createQuery(consulta, EsqCincoModel.class);
                                        query.setParameter("numInicio", 21);
                                        query.setParameter("numFinal", 25);

	      return  query.getResultList();
		}
}
