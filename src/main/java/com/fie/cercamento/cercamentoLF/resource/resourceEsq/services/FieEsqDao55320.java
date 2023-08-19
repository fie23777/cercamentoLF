package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq02553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq03552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq05532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq20553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq23550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq25530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq30552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq32550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35205;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq35520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq50532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq52530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53205;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq53520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55023;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55032;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55203;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55230;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55302;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model55320.FieEsq55320;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository02355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository02535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository02553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository03255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository03525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository03552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository05532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository20355;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository20535;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository20553;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository23055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository23505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository23550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository25530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository30255;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository30525;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository30552;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository32055;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository32505;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository32550;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35202;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository35520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50235;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50253;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50325;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50352;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50523;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository50532;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository52530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53025;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53052;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53205;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53250;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53502;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository53520;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55023;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55032;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55203;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55230;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55302;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository55320.Irepository55320;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Transactional
public class FieEsqDao55320 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository02355 irepository02355;
	@Autowired private Irepository02535 irepository02535;
	@Autowired private Irepository02553 irepository02553;
	@Autowired private Irepository03255 irepository03255;
	@Autowired private Irepository03525 irepository03525;
	@Autowired private Irepository03552 irepository03552;
	@Autowired private Irepository05235 irepository05235;
	@Autowired private Irepository05253 irepository05253;
	@Autowired private Irepository05325 irepository05325;
	@Autowired private Irepository05352 irepository05352;
	@Autowired private Irepository05523 irepository05523;
	@Autowired private Irepository05532 irepository05532;
	@Autowired private Irepository20355 irepository20355;
	@Autowired private Irepository20535 irepository20535;
	@Autowired private Irepository20553 irepository20553;
	@Autowired private Irepository23055 irepository23055;
	@Autowired private Irepository23505 irepository23505;
	@Autowired private Irepository23550 irepository23550;
	@Autowired private Irepository25035 irepository25035;
	@Autowired private Irepository25053 irepository25053;
	@Autowired private Irepository25305 irepository25305;
	@Autowired private Irepository25350 irepository25350;
	@Autowired private Irepository25503 irepository25503;
	@Autowired private Irepository25530 irepository25530;
	@Autowired private Irepository30255 irepository30255;
	@Autowired private Irepository30525 irepository30525;
	@Autowired private Irepository30552 irepository30552;
	@Autowired private Irepository32055 irepository32055;
	@Autowired private Irepository32505 irepository32505;
	@Autowired private Irepository32550 irepository32550;
	@Autowired private Irepository35025 irepository35025;
	@Autowired private Irepository35052 irepository35052;
	@Autowired private Irepository35202 irepository35202;
	@Autowired private Irepository35250 irepository35250;
	@Autowired private Irepository35502 irepository35502;
	@Autowired private Irepository35520 irepository35520;
	@Autowired private Irepository50235 irepository50235;
	@Autowired private Irepository50253 irepository50253;
	@Autowired private Irepository50325 irepository50325;
	@Autowired private Irepository50352 irepository50352;
	@Autowired private Irepository50523 irepository50523;
	@Autowired private Irepository50532 irepository50532;
	@Autowired private Irepository52035 irepository52035;
	@Autowired private Irepository52053 irepository52053;
	@Autowired private Irepository52305 irepository52305;
	@Autowired private Irepository52350 irepository52350;
	@Autowired private Irepository52503 irepository52503;
	@Autowired private Irepository52530 irepository52530;
	@Autowired private Irepository53025 irepository53025;
	@Autowired private Irepository53052 irepository53052;
	@Autowired private Irepository53205 irepository53205;
	@Autowired private Irepository53250 irepository53250;
	@Autowired private Irepository53502 irepository53502;
	@Autowired private Irepository53520 irepository53520;
	@Autowired private Irepository55023 irepository55023;
	@Autowired private Irepository55032 irepository55032;
	@Autowired private Irepository55203 irepository55203;
	@Autowired private Irepository55230 irepository55230;
	@Autowired private Irepository55302 irepository55302;
	@Autowired private Irepository55320 irepository55320; 
	
	//para o esquema fie gravar em banco
	
	public void gravarEsq32550(FieEsq32550 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq32505(FieEsq32505 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq32055(FieEsq32055 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq35250(FieEsq35250 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq35205(FieEsq35205 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35520(FieEsq35520 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35502(FieEsq35502 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq30255(FieEsq30255 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq30525(FieEsq30525 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq30552(FieEsq30552 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35025(FieEsq35025 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq35052(FieEsq35052 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23550(FieEsq23550 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23505(FieEsq23505 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq23055(FieEsq23055 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25350(FieEsq25350 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25305(FieEsq25305 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25530(FieEsq25530 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25503(FieEsq25503 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25035(FieEsq25035 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq25053(FieEsq25053 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq20355(FieEsq20355 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq20535(FieEsq20535 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq20553(FieEsq20553 esquemas){//
		manager.persist(esquemas);	
	}
	public void gravarEsq53250(FieEsq53250 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53205(FieEsq53205 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53520(FieEsq53520 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53502(FieEsq53502 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53025(FieEsq53025 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq53052(FieEsq53052 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq52350(FieEsq52350 esquemas){  
		manager.persist(esquemas);
	}
	public void gravarEsq52305(FieEsq52305 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq52530(FieEsq52530 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq52503(FieEsq52503 esquemas){
		manager.persist(esquemas);
	}
	public void gravarEsq52035(FieEsq52035 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq52053(FieEsq52053 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55320(FieEsq55320 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55302(FieEsq55302 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55230(FieEsq55230 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55203(FieEsq55203 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55032(FieEsq55032 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq55023(FieEsq55023 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50325(FieEsq50325 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50352(FieEsq50352 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50235(FieEsq50235 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50253(FieEsq50253 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50532(FieEsq50532 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq50523(FieEsq50523 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq03255(FieEsq03255 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq03525(FieEsq03525 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq03552(FieEsq03552 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq02355(FieEsq02355 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq02535(FieEsq02535 esquemas){//
		manager.persist(esquemas);	
	}
	public void gravarEsq02553(FieEsq02553 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq05325(FieEsq05325 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq05352(FieEsq05352 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq05235(FieEsq05235 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq05253(FieEsq05253 esquemas){//
		manager.persist(esquemas);
	}
	public void gravarEsq05532(FieEsq05532 esquemas){//
		manager.persist(esquemas);	
	}	
	public void gravarEsq05523(FieEsq05523 esquemas){//
		manager.persist(esquemas);
	}
	
	
	
//para listar em tela 32550
	
	public List<FieEsq32550> listarFieEsq32550(String filtro) {
	       String consulta = "select l from FieEsq32550 l where l.numEsq32550 like :nuncerc";
	          TypedQuery<FieEsq32550> query = manager.createQuery(consulta, FieEsq32550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 32505
	
	public List<FieEsq32505> listarFieEsq32505(String filtro) {
	       String consulta = "select l from FieEsq32505 l where l.numEsq32505 like :nuncerc";
	          TypedQuery<FieEsq32505> query = manager.createQuery(consulta, FieEsq32505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 32055
	
	public List<FieEsq32055> listarFieEsq32055(String filtro) {
	       String consulta = "select l from FieEsq32055 l where l.numEsq32055 like :nuncerc";
	          TypedQuery<FieEsq32055> query = manager.createQuery(consulta, FieEsq32055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 35250
	
	public List<FieEsq35250> listarFieEsq35250(String filtro) {
	       String consulta = "select l from FieEsq35250 l where l.numEsq35250 like :nuncerc";
	          TypedQuery<FieEsq35250> query = manager.createQuery(consulta, FieEsq35250.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq53052> listarFieEsq53052(String filtro) {
	       String consulta = "select l from FieEsq53052 l where l.numEsq53052 like :nuncerc";
	          TypedQuery<FieEsq53052> query = manager.createQuery(consulta, FieEsq53052.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53025> listarFieEsq53025(String filtro) {
	       String consulta = "select l from FieEsq53025 l where l.numEsq53025 like :nuncerc";
	          TypedQuery<FieEsq53025> query = manager.createQuery(consulta, FieEsq53025.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53502> listarFieEsq53502(String filtro) {
	       String consulta = "select l from FieEsq53502 l where l.numEsq53502 like :nuncerc";
	          TypedQuery<FieEsq53502> query = manager.createQuery(consulta, FieEsq53502.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53520> listarFieEsq53520(String filtro) {
	       String consulta = "select l from FieEsq53520 l where l.numEsq53520 like :nuncerc";
	          TypedQuery<FieEsq53520> query = manager.createQuery(consulta, FieEsq53520.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53205> listarFieEsq53205(String filtro) {
	       String consulta = "select l from FieEsq53205 l where l.numEsq53205 like :nuncerc";
	          TypedQuery<FieEsq53205> query = manager.createQuery(consulta, FieEsq53205.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53250> listarFieEsq53250(String filtro) {
	       String consulta = "select l from FieEsq53250 l where l.numEsq53250 like :nuncerc";
	          TypedQuery<FieEsq53250> query = manager.createQuery(consulta, FieEsq53250.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20553> listarFieEsq20553(String filtro) {
	       String consulta = "select l from FieEsq20553 l where l.numEsq20553 like :nuncerc";
	          TypedQuery<FieEsq20553> query = manager.createQuery(consulta, FieEsq20553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20535> listarFieEsq20535(String filtro) {
	       String consulta = "select l from FieEsq20535 l where l.numEsq20535 like :nuncerc";
	          TypedQuery<FieEsq20535> query = manager.createQuery(consulta, FieEsq20535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20355> listarFieEsq20355(String filtro) {
	       String consulta = "select l from FieEsq20355 l where l.numEsq20355 like :nuncerc";
	          TypedQuery<FieEsq20355> query = manager.createQuery(consulta, FieEsq20355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25053> listarFieEsq25053(String filtro) {
	       String consulta = "select l from FieEsq25053 l where l.numEsq25053 like :nuncerc";
	          TypedQuery<FieEsq25053> query = manager.createQuery(consulta, FieEsq25053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25035> listarFieEsq25035(String filtro) {
	       String consulta = "select l from FieEsq25035 l where l.numEsq25035 like :nuncerc";
	          TypedQuery<FieEsq25035> query = manager.createQuery(consulta, FieEsq25035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25503> listarFieEsq25503(String filtro) {
	       String consulta = "select l from FieEsq25503 l where l.numEsq25503 like :nuncerc";
	          TypedQuery<FieEsq25503> query = manager.createQuery(consulta, FieEsq25503.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25530> listarFieEsq25530(String filtro) {
	       String consulta = "select l from FieEsq25530 l where l.numEsq25530 like :nuncerc";
	          TypedQuery<FieEsq25530> query = manager.createQuery(consulta, FieEsq25530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25305> listarFieEsq25305(String filtro) {
	       String consulta = "select l from FieEsq25305 l where l.numEsq25305 like :nuncerc";
	          TypedQuery<FieEsq25305> query = manager.createQuery(consulta, FieEsq25305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25350> listarFieEsq25350(String filtro) {
	       String consulta = "select l from FieEsq25350 l where l.numEsq25350 like :nuncerc";
	          TypedQuery<FieEsq25350> query = manager.createQuery(consulta, FieEsq25350.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23505> listarFieEsq23505(String filtro) {
	       String consulta = "select l from FieEsq23505 l where l.numEsq23505 like :nuncerc";
	          TypedQuery<FieEsq23505> query = manager.createQuery(consulta, FieEsq23505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23550> listarFieEsq23550(String filtro) {
	       String consulta = "select l from FieEsq23550 l where l.numEsq23550 like :nuncerc";
	          TypedQuery<FieEsq23550> query = manager.createQuery(consulta, FieEsq23550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35052> listarFieEsq35052(String filtro) {
	       String consulta = "select l from FieEsq35052 l where l.numEsq35052 like :nuncerc";
	          TypedQuery<FieEsq35052> query = manager.createQuery(consulta, FieEsq35052.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35025> listarFieEsq35025(String filtro) {
	       String consulta = "select l from FieEsq35025 l where l.numEsq35025 like :nuncerc";
	          TypedQuery<FieEsq35025> query = manager.createQuery(consulta, FieEsq35025.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30552> listarFieEsq30552(String filtro) {
	       String consulta = "select l from FieEsq30552 l where l.numEsq30552 like :nuncerc";
	          TypedQuery<FieEsq30552> query = manager.createQuery(consulta, FieEsq30552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30525> listarFieEsq30525(String filtro) {
	       String consulta = "select l from FieEsq30525 l where l.numEsq30525 like :nuncerc";
	          TypedQuery<FieEsq30525> query = manager.createQuery(consulta, FieEsq30525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30255> listarFieEsq30255(String filtro) {
	       String consulta = "select l from FieEsq30255 l where l.numEsq30255 like :nuncerc";
	          TypedQuery<FieEsq30255> query = manager.createQuery(consulta, FieEsq30255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35502> listarFieEsq35502(String filtro) {
	       String consulta = "select l from FieEsq35502 l where l.numEsq35502 like :nuncerc";
	          TypedQuery<FieEsq35502> query = manager.createQuery(consulta, FieEsq35502.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35520> listarFieEsq35520(String filtro) {
	       String consulta = "select l from FieEsq35520 l where l.numEsq35520 like :nuncerc";
	          TypedQuery<FieEsq35520> query = manager.createQuery(consulta, FieEsq35520.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35205> listarFieEsq35205(String filtro) {
	       String consulta = "select l from FieEsq35205 l where l.numEsq35205 like :nuncerc";
	          TypedQuery<FieEsq35205> query = manager.createQuery(consulta, FieEsq35205.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq52350> listarFieEsq52350(String filtro) {
	       String consulta = "select l from FieEsq52350 l where l.numEsq52350 like :nuncerc";
	          TypedQuery<FieEsq52350> query = manager.createQuery(consulta, FieEsq52350.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52305
	
	public List<FieEsq52305> listarFieEsq52305(String filtro) {
	       String consulta = "select l from FieEsq52305 l where l.numEsq52305 like :nuncerc";
	          TypedQuery<FieEsq52305> query = manager.createQuery(consulta, FieEsq52305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52530
	
	public List<FieEsq52530> listarFieEsq52530(String filtro) {
	       String consulta = "select l from FieEsq52530 l where l.numEsq52530 like :nuncerc";
	          TypedQuery<FieEsq52530> query = manager.createQuery(consulta, FieEsq52530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52503
	
	public List<FieEsq52503> listarFieEsq52503(String filtro) {
	       String consulta = "select l from FieEsq52503 l where l.numEsq52503 like :nuncerc";
	          TypedQuery<FieEsq52503> query = manager.createQuery(consulta, FieEsq52503.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq05532> listarFieEsq05532(String filtro) {
	       String consulta = "select l from FieEsq05532 l where l.numEsq05532 like :nuncerc";
	          TypedQuery<FieEsq05532> query = manager.createQuery(consulta, FieEsq05532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05253> listarFieEsq05253(String filtro) {
	       String consulta = "select l from FieEsq05253 l where l.numEsq05253 like :nuncerc";
	          TypedQuery<FieEsq05253> query = manager.createQuery(consulta, FieEsq05253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05235> listarFieEsq05235(String filtro) {
	       String consulta = "select l from FieEsq05235 l where l.numEsq05235 like :nuncerc";
	          TypedQuery<FieEsq05235> query = manager.createQuery(consulta, FieEsq05235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05352> listarFieEsq05352(String filtro) {
	       String consulta = "select l from FieEsq05352 l where l.numEsq05352 like :nuncerc";
	          TypedQuery<FieEsq05352> query = manager.createQuery(consulta, FieEsq05352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05325> listarFieEsq05325(String filtro) {
	       String consulta = "select l from FieEsq05325 l where l.numEsq05325 like :nuncerc";
	          TypedQuery<FieEsq05325> query = manager.createQuery(consulta, FieEsq05325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02553> listarFieEsq02553(String filtro) {
	       String consulta = "select l from FieEsq02553 l where l.numEsq02553 like :nuncerc";
	          TypedQuery<FieEsq02553> query = manager.createQuery(consulta, FieEsq02553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02535> listarFieEsq02535(String filtro) {
	       String consulta = "select l from FieEsq02535 l where l.numEsq02535 like :nuncerc";
	          TypedQuery<FieEsq02535> query = manager.createQuery(consulta, FieEsq02535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02355> listarFieEsq02355(String filtro) {
	       String consulta = "select l from FieEsq02355 l where l.numEsq02355 like :nuncerc";
	          TypedQuery<FieEsq02355> query = manager.createQuery(consulta, FieEsq02355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03552> listarFieEsq03552(String filtro) {
	       String consulta = "select l from FieEsq03552 l where l.numEsq03552 like :nuncerc";
	          TypedQuery<FieEsq03552> query = manager.createQuery(consulta, FieEsq03552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03525> listarFieEsq03525(String filtro) {
	       String consulta = "select l from FieEsq03525 l where l.numEsq03525 like :nuncerc";
	          TypedQuery<FieEsq03525> query = manager.createQuery(consulta, FieEsq03525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03255> listarFieEsq03255(String filtro) {
	       String consulta = "select l from FieEsq03255 l where l.numEsq03255 like :nuncerc";
	          TypedQuery<FieEsq03255> query = manager.createQuery(consulta, FieEsq03255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50523> listarFieEsq50523(String filtro) {
	       String consulta = "select l from FieEsq50523 l where l.numEsq50523 like :nuncerc";
	          TypedQuery<FieEsq50523> query = manager.createQuery(consulta, FieEsq50523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50532> listarFieEsq50532(String filtro) {
	       String consulta = "select l from FieEsq50532 l where l.numEsq50532 like :nuncerc";
	          TypedQuery<FieEsq50532> query = manager.createQuery(consulta, FieEsq50532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50253> listarFieEsq50253(String filtro) {
	       String consulta = "select l from FieEsq50253 l where l.numEsq50253 like :nuncerc";
	          TypedQuery<FieEsq50253> query = manager.createQuery(consulta, FieEsq50253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50235> listarFieEsq50235(String filtro) {
	       String consulta = "select l from FieEsq50235 l where l.numEsq50235 like :nuncerc";
	          TypedQuery<FieEsq50235> query = manager.createQuery(consulta, FieEsq50235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23055> listarFieEsq23055(String filtro) {
	       String consulta = "select l from FieEsq23055 l where l.numEsq23055 like :nuncerc";
	          TypedQuery<FieEsq23055> query = manager.createQuery(consulta, FieEsq23055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50352> listarFieEsq50352(String filtro) {
	       String consulta = "select l from FieEsq50352 l where l.numEsq50352 like :nuncerc";
	          TypedQuery<FieEsq50352> query = manager.createQuery(consulta, FieEsq50352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50325> listarFieEsq50325(String filtro) {
	       String consulta = "select l from FieEsq50325 l where l.numEsq50325 like :nuncerc";
	          TypedQuery<FieEsq50325> query = manager.createQuery(consulta, FieEsq50325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55023> listarFieEsq55023(String filtro) {
	       String consulta = "select l from FieEsq55023 l where l.numEsq55023 like :nuncerc";
	          TypedQuery<FieEsq55023> query = manager.createQuery(consulta, FieEsq55023.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55032> listarFieEsq55032(String filtro) {
	       String consulta = "select l from FieEsq55032 l where l.numEsq55032 like :nuncerc";
	          TypedQuery<FieEsq55032> query = manager.createQuery(consulta, FieEsq55032.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55203> listarFieEsq55203(String filtro) {
	       String consulta = "select l from FieEsq55203 l where l.numEsq55203 like :nuncerc";
	          TypedQuery<FieEsq55203> query = manager.createQuery(consulta, FieEsq55203.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55230> listarFieEsq55230(String filtro) {
	       String consulta = "select l from FieEsq55230 l where l.numEsq55230 like :nuncerc";
	          TypedQuery<FieEsq55230> query = manager.createQuery(consulta, FieEsq55230.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55302> listarFieEsq55302(String filtro) {
	       String consulta = "select l from FieEsq55302 l where l.numEsq55302 like :nuncerc";
	          TypedQuery<FieEsq55302> query = manager.createQuery(consulta, FieEsq55302.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55320> listarFieEsq55320(String filtro) {
	       String consulta = "select l from FieEsq55320 l where l.numEsq55320 like :nuncerc";
	          TypedQuery<FieEsq55320> query = manager.createQuery(consulta, FieEsq55320.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52053> listarFieEsq52053(String filtro) {
	       String consulta = "select l from FieEsq52053 l where l.numEsq52053 like :nuncerc";
	          TypedQuery<FieEsq52053> query = manager.createQuery(consulta, FieEsq52053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52035> listarFieEsq52035(String filtro) {
	       String consulta = "select l from FieEsq52035 l where l.numEsq52035 like :nuncerc";
	          TypedQuery<FieEsq52035> query = manager.createQuery(consulta, FieEsq52035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05523> listarFieEsq05523(String filtro) {
	       String consulta = "select l from FieEsq05523 l where l.numEsq05523 like :nuncerc";
	          TypedQuery<FieEsq05523> query = manager.createQuery(consulta, FieEsq05523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	
}
