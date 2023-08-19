package com.fie.cercamento.cercamentoLF.resource.resourceEsq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq03543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq04533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq05433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq30543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq33540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq34530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq35430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq40533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq43530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq45330;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq50433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq53430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.model54330.FieEsq54330;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository03543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository04335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository04353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository04533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository05334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository05343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository05433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30345;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30354;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30435;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30453;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30534;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository30543;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33045;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33054;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33405;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33450;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33504;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository33540;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository34530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository35430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository40335;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository40353;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository40533;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43035;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43053;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43305;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43350;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43503;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository43530;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository45033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository45303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository45330;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository50334;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository50343;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository50433;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53034;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53043;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53304;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53340;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53403;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository53430;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository54033;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository54303;
import com.fie.cercamento.cercamentoLF.resource.resourceEsq.services.repository.repository54330.Irepository54330;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Transactional
public class FieEsqDao54330 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;

	@Autowired private Irepository03345 irepository03345;
	@Autowired private Irepository03354 irepository03354;
	@Autowired private Irepository03435 irepository03435;
	@Autowired private Irepository03453 irepository03453;
	@Autowired private Irepository03534 irepository03534;
	@Autowired private Irepository03543 irepository03543;
	@Autowired private Irepository04335 irepository04335;
	@Autowired private Irepository04353 irepository04353;
	@Autowired private Irepository04533 irepository04533;
	@Autowired private Irepository05334 irepository05334;
	@Autowired private Irepository05343 irepository05343;
	@Autowired private Irepository05433 irepository05433;
	@Autowired private Irepository30345 irepository30345;
	@Autowired private Irepository30354 irepository30354;
	@Autowired private Irepository30435 irepository30435;
	@Autowired private Irepository30453 irepository30453;
	@Autowired private Irepository30534 irepository30534;
	@Autowired private Irepository30543 irepository30543;
	@Autowired private Irepository33045 irepository33045;
	@Autowired private Irepository33054 irepository33054;
	@Autowired private Irepository33405 irepository33405;
	@Autowired private Irepository33450 irepository33450;
	@Autowired private Irepository33504 irepository33504;
	@Autowired private Irepository33540 irepository33540;
	@Autowired private Irepository34035 irepository34035;
	@Autowired private Irepository34053 irepository34053;
	@Autowired private Irepository34305 irepository34305;
	@Autowired private Irepository34350 irepository34350;
	@Autowired private Irepository34503 irepository34503;
	@Autowired private Irepository34530 irepository34530;
	@Autowired private Irepository35034 irepository35034;
	@Autowired private Irepository35043 irepository35043;
	@Autowired private Irepository35304 irepository35304;
	@Autowired private Irepository35340 irepository35340;
	@Autowired private Irepository35403 irepository35403;
	@Autowired private Irepository35430 irepository35430;
	@Autowired private Irepository40335 irepository40335;
	@Autowired private Irepository40353 irepository40353;
	@Autowired private Irepository40533 irepository40533;
	@Autowired private Irepository43035 irepository43035;
	@Autowired private Irepository43053 irepository43053;
	@Autowired private Irepository43305 irepository43305;
	@Autowired private Irepository43350 irepository43350;
	@Autowired private Irepository43503 irepository43503;
	@Autowired private Irepository43530 irepository43530;
	@Autowired private Irepository45033 irepository45033;
	@Autowired private Irepository45303 irepository45303;
	@Autowired private Irepository45330 irepository45330;
	@Autowired private Irepository50334 irepository50334;
	@Autowired private Irepository50343 irepository50343;
	@Autowired private Irepository50433 irepository50433;
	@Autowired private Irepository53034 irepository53034;
	@Autowired private Irepository53043 irepository53043;
	@Autowired private Irepository53304 irepository53304;
	@Autowired private Irepository53340 irepository53340;
	@Autowired private Irepository53403 irepository53403;
	@Autowired private Irepository53430 irepository53430;
	@Autowired private Irepository54033 irepository54033;
	@Autowired private Irepository54303 irepository54303;
	@Autowired private Irepository54330 irepository54330;
	
	public void gravarEsq54330(List<FieEsq54330> esquemas){  
		irepository54330.saveAll(esquemas);
	}
	public void gravarEsq54303(List<FieEsq54303> esquemas){
		irepository54303.saveAll(esquemas);
	}
	public void gravarEsq54033(List<FieEsq54033> esquemas){
		irepository54033.saveAll(esquemas);
	}
	public void gravarEsq53430(List<FieEsq53430> esquemas){
		irepository53430.saveAll(esquemas);
	}
	public void gravarEsq53403(List<FieEsq53403> esquemas){//
		irepository53403.saveAll(esquemas);
	}
	public void gravarEsq53340(List<FieEsq53340> esquemas){//
		irepository53340.saveAll(esquemas);
	}
	public void gravarEsq53304(List<FieEsq53304> esquemas){//
		irepository53304.saveAll(esquemas);
	}
	public void gravarEsq50433(List<FieEsq50433> esquemas){//
		irepository50433.saveAll(esquemas);
	}
	public void gravarEsq50343(List<FieEsq50343> esquemas){//
		irepository50343.saveAll(esquemas);
	}
	public void gravarEsq50334(List<FieEsq50334> esquemas){//
		irepository50334.saveAll(esquemas);
	}
	public void gravarEsq53043(List<FieEsq53043> esquemas){//
		irepository53043.saveAll(esquemas);
	}
	public void gravarEsq53034(List<FieEsq53034> esquemas){//
		irepository53034.saveAll(esquemas);
	}
	public void gravarEsq45330(List<FieEsq45330> esquemas){//
		irepository45330.saveAll(esquemas);
	}
	public void gravarEsq45303(List<FieEsq45303> esquemas){//
		irepository45303.saveAll(esquemas);
	}
	public void gravarEsq30534(List<FieEsq30534> esquemas){//
		irepository30534.saveAll(esquemas);
	}
	public void gravarEsq45033(List<FieEsq45033> esquemas){//
		irepository45033.saveAll(esquemas);
	}
	public void gravarEsq43530(List<FieEsq43530> esquemas){//
		irepository43530.saveAll(esquemas);
	}
	public void gravarEsq43503(List<FieEsq43503> esquemas){//
		irepository43503.saveAll(esquemas);
	}
	public void gravarEsq43350(List<FieEsq43350> esquemas){//
		irepository43350.saveAll(esquemas);
	}
	public void gravarEsq43305(List<FieEsq43305> esquemas){//
		irepository43305.saveAll(esquemas);
	}
	public void gravarEsq43053(List<FieEsq43053> esquemas){//
		irepository43053.saveAll(esquemas);
	}
	public void gravarEsq43035(List<FieEsq43035> esquemas){//
		irepository43035.saveAll(esquemas);
	}
	public void gravarEsq40533(List<FieEsq40533> esquemas){//
		irepository40533.saveAll(esquemas);
	}
	public void gravarEsq40353(List<FieEsq40353> esquemas){//
		irepository40353.saveAll(esquemas);	
	}
	public void gravarEsq40335(List<FieEsq40335> esquemas){//
		irepository40335.saveAll(esquemas);
	}
	public void gravarEsq35430(List<FieEsq35430> esquemas){//
		irepository35430.saveAll(esquemas);
	}
	public void gravarEsq35403(List<FieEsq35403> esquemas){//
		irepository35403.saveAll(esquemas);
	}
	public void gravarEsq35340(List<FieEsq35340> esquemas){//
		irepository35340.saveAll(esquemas);
	}
	public void gravarEsq35304(List<FieEsq35304> esquemas){//
		irepository35304.saveAll(esquemas);
	}
	public void gravarEsq35043(List<FieEsq35043> esquemas){//
		irepository35043.saveAll(esquemas);
	}
	public void gravarEsq35034(List<FieEsq35034> esquemas){  
		irepository35034.saveAll(esquemas);
	}
	public void gravarEsq34530(List<FieEsq34530> esquemas){
		irepository34530.saveAll(esquemas);
	}
	public void gravarEsq34503(List<FieEsq34530> esquemas){
		irepository34530.saveAll(esquemas);
	}
	public void gravarEsq34350(List<FieEsq34350> esquemas){
		irepository34350.saveAll(esquemas);
	}
	public void gravarEsq34305(List<FieEsq34305> esquemas){//
		irepository34305.saveAll(esquemas);
	}
	public void gravarEsq34053(List<FieEsq34053> esquemas){//
		irepository34053.saveAll(esquemas);
	}
	public void gravarEsq34035(List<FieEsq34035> esquemas){//
		irepository34035.saveAll(esquemas);
	}
	public void gravarEsq33540(List<FieEsq33540> esquemas){//
		irepository33540.saveAll(esquemas);
	}
	public void gravarEsq33504(List<FieEsq33504> esquemas){//
		irepository33504.saveAll(esquemas);
	}
	public void gravarEsq33450(List<FieEsq33450> esquemas){//
		irepository33450.saveAll(esquemas);
	}
	public void gravarEsq33405(List<FieEsq33405> esquemas){//
		irepository33405.saveAll(esquemas);
	}
	public void gravarEsq33054(List<FieEsq33054> esquemas){//
		irepository33054.saveAll(esquemas);
	}
	public void gravarEsq33045(List<FieEsq33045> esquemas){//
		irepository33045.saveAll(esquemas);
	}
	public void gravarEsq30543(List<FieEsq30543> esquemas){//
		irepository30543.saveAll(esquemas);
	}
	public void gravarEsq30453(List<FieEsq30453> esquemas){//
		irepository30453.saveAll(esquemas);
	}
	public void gravarEsq30435(List<FieEsq30435> esquemas){//
		irepository30435.saveAll(esquemas);
	}
	public void gravarEsq30354(List<FieEsq30354> esquemas){//
		irepository30354.saveAll(esquemas);
	}
	public void gravarEsq30345(List<FieEsq30345> esquemas){//
		irepository30345.saveAll(esquemas);
	}
	public void gravarEsq05433(List<FieEsq05433> esquemas){//
		irepository05433.saveAll(esquemas);
	}
	public void gravarEsq05343(List<FieEsq05343> esquemas){//
		irepository05343.saveAll(esquemas);
	}
	public void gravarEsq05334(List<FieEsq05334> esquemas){//
		irepository05334.saveAll(esquemas);
	}
	public void gravarEsq04533(List<FieEsq04533> esquemas){//
		irepository04533.saveAll(esquemas);
	}
	public void gravarEsq04353(List<FieEsq04353> esquemas){//
		irepository04353.saveAll(esquemas);	
	}
	public void gravarEsq04335(List<FieEsq04335> esquemas){//
		irepository04335.saveAll(esquemas);
	}
	public void gravarEsq03543(List<FieEsq03543> esquemas){//
		irepository03543.saveAll(esquemas);
	}
	public void gravarEsq03534(List<FieEsq03534> esquemas){//
		irepository03534.saveAll(esquemas);
	}
	public void gravarEsq03453(List<FieEsq03453> esquemas){//
		irepository03453.saveAll(esquemas);
	}
	public void gravarEsq03435(List<FieEsq03435> esquemas){//
		irepository03435.saveAll(esquemas);
	}
	public void gravarEsq03354(List<FieEsq03354> esquemas){//
		irepository03354.saveAll(esquemas);	
	}	
	public void gravarEsq03345(List<FieEsq03345> esquemas){//
		irepository03345.saveAll(esquemas);
	}
	
	
	
//para listar em tela 54330
	
	public List<FieEsq54330> listarFieEsq54330(String filtro) {
	       String consulta = "select l from FieEsq54330 l where l.numEsq54330 like :nuncerc";
	          TypedQuery<FieEsq54330> query = manager.createQuery(consulta, FieEsq54330.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 54303
	
	public List<FieEsq54303> listarFieEsq54303(String filtro) {
	       String consulta = "select l from FieEsq54303 l where l.numEsq54303 like :nuncerc";
	          TypedQuery<FieEsq54303> query = manager.createQuery(consulta, FieEsq54303.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 54033
	
	public List<FieEsq54033> listarFieEsq54033(String filtro) {
	       String consulta = "select l from FieEsq54033 l where l.numEsq54033 like :nuncerc";
	          TypedQuery<FieEsq54033> query = manager.createQuery(consulta, FieEsq54033.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53430
	
	public List<FieEsq53430> listarFieEsq53430(String filtro) {
	       String consulta = "select l from FieEsq53430 l where l.numEsq53430 like :nuncerc";
	          TypedQuery<FieEsq53430> query = manager.createQuery(consulta, FieEsq53430.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq35043> listarFieEsq35043(String filtro) {
	       String consulta = "select l from FieEsq35043 l where l.numEsq35043 like :nuncerc";
	          TypedQuery<FieEsq35043> query = manager.createQuery(consulta, FieEsq35043.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35304> listarFieEsq35304(String filtro) {
	       String consulta = "select l from FieEsq35304 l where l.numEsq35304 like :nuncerc";
	          TypedQuery<FieEsq35304> query = manager.createQuery(consulta, FieEsq35304.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35340> listarFieEsq35340(String filtro) {
	       String consulta = "select l from FieEsq35340 l where l.numEsq35340 like :nuncerc";
	          TypedQuery<FieEsq35340> query = manager.createQuery(consulta, FieEsq35340.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35403> listarFieEsq35403(String filtro) {
	       String consulta = "select l from FieEsq35403 l where l.numEsq35403 like :nuncerc";
	          TypedQuery<FieEsq35403> query = manager.createQuery(consulta, FieEsq35403.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35430> listarFieEsq35430(String filtro) {
	       String consulta = "select l from FieEsq35430 l where l.numEsq35430 like :nuncerc";
	          TypedQuery<FieEsq35430> query = manager.createQuery(consulta, FieEsq35430.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40335> listarFieEsq40335(String filtro) {
	       String consulta = "select l from FieEsq40335 l where l.numEsq40335 like :nuncerc";
	          TypedQuery<FieEsq40335> query = manager.createQuery(consulta, FieEsq40335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40353> listarFieEsq40353(String filtro) {
	       String consulta = "select l from FieEsq40353 l where l.numEsq40353 like :nuncerc";
	          TypedQuery<FieEsq40353> query = manager.createQuery(consulta, FieEsq40353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq40533> listarFieEsq40533(String filtro) {
	       String consulta = "select l from FieEsq40533 l where l.numEsq40533 like :nuncerc";
	          TypedQuery<FieEsq40533> query = manager.createQuery(consulta, FieEsq40533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43035> listarFieEsq43035(String filtro) {
	       String consulta = "select l from FieEsq43035 l where l.numEsq43035 like :nuncerc";
	          TypedQuery<FieEsq43035> query = manager.createQuery(consulta, FieEsq43035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43053> listarFieEsq43053(String filtro) {
	       String consulta = "select l from FieEsq43053 l where l.numEsq43053 like :nuncerc";
	          TypedQuery<FieEsq43053> query = manager.createQuery(consulta, FieEsq43053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43305> listarFieEsq43305(String filtro) {
	       String consulta = "select l from FieEsq43305 l where l.numEsq43305 like :nuncerc";
	          TypedQuery<FieEsq43305> query = manager.createQuery(consulta, FieEsq43305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43350> listarFieEsq43350(String filtro) {
	       String consulta = "select l from FieEsq43350 l where l.numEsq43350 like :nuncerc";
	          TypedQuery<FieEsq43350> query = manager.createQuery(consulta, FieEsq43350.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43503> listarFieEsq43503(String filtro) {
	       String consulta = "select l from FieEsq43503 l where l.numEsq43503 like :nuncerc";
	          TypedQuery<FieEsq43503> query = manager.createQuery(consulta, FieEsq43503.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43530> listarFieEsq43530(String filtro) {
	       String consulta = "select l from FieEsq43530 l where l.numEsq43530 like :nuncerc";
	          TypedQuery<FieEsq43530> query = manager.createQuery(consulta, FieEsq43530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45033> listarFieEsq45033(String filtro) {
	       String consulta = "select l from FieEsq45033 l where l.numEsq45033 like :nuncerc";
	          TypedQuery<FieEsq45033> query = manager.createQuery(consulta, FieEsq45033.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45303> listarFieEsq45303(String filtro) {
	       String consulta = "select l from FieEsq45303 l where l.numEsq45303 like :nuncerc";
	          TypedQuery<FieEsq45303> query = manager.createQuery(consulta, FieEsq45303.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq45330> listarFieEsq45330(String filtro) {
	       String consulta = "select l from FieEsq45330 l where l.numEsq45330 like :nuncerc";
	          TypedQuery<FieEsq45330> query = manager.createQuery(consulta, FieEsq45330.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53034> listarFieEsq53034(String filtro) {
	       String consulta = "select l from FieEsq53034 l where l.numEsq53034 like :nuncerc";
	          TypedQuery<FieEsq53034> query = manager.createQuery(consulta, FieEsq53034.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53043> listarFieEsq53043(String filtro) {
	       String consulta = "select l from FieEsq53043 l where l.numEsq53043 like :nuncerc";
	          TypedQuery<FieEsq53043> query = manager.createQuery(consulta, FieEsq53043.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50334> listarFieEsq50334(String filtro) {
	       String consulta = "select l from FieEsq50334 l where l.numEsq50334 like :nuncerc";
	          TypedQuery<FieEsq50334> query = manager.createQuery(consulta, FieEsq50334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50343> listarFieEsq50343(String filtro) {
	       String consulta = "select l from FieEsq50343 l where l.numEsq50343 like :nuncerc";
	          TypedQuery<FieEsq50343> query = manager.createQuery(consulta, FieEsq50343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50433> listarFieEsq50433(String filtro) {
	       String consulta = "select l from FieEsq50433 l where l.numEsq50433 like :nuncerc";
	          TypedQuery<FieEsq50433> query = manager.createQuery(consulta, FieEsq50433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53304> listarFieEsq53304(String filtro) {
	       String consulta = "select l from FieEsq53304 l where l.numEsq53304 like :nuncerc";
	          TypedQuery<FieEsq53304> query = manager.createQuery(consulta, FieEsq53304.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53340> listarFieEsq53340(String filtro) {
	       String consulta = "select l from FieEsq53340 l where l.numEsq53340 like :nuncerc";
	          TypedQuery<FieEsq53340> query = manager.createQuery(consulta, FieEsq53340.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53403> listarFieEsq53403(String filtro) {
	       String consulta = "select l from FieEsq53403 l where l.numEsq53403 like :nuncerc";
	          TypedQuery<FieEsq53403> query = manager.createQuery(consulta, FieEsq53403.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq35034> listarFieEsq35034(String filtro) {
	       String consulta = "select l from FieEsq35034 l where l.numEsq35034 like :nuncerc";
	          TypedQuery<FieEsq35034> query = manager.createQuery(consulta, FieEsq35034.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 34530
	
	public List<FieEsq34530> listarFieEsq34530(String filtro) {
	       String consulta = "select l from FieEsq34530 l where l.numEsq34530 like :nuncerc";
	          TypedQuery<FieEsq34530> query = manager.createQuery(consulta, FieEsq34530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 34503
	
	public List<FieEsq34503> listarFieEsq34503(String filtro) {
	       String consulta = "select l from FieEsq34503 l where l.numEsq34503 like :nuncerc";
	          TypedQuery<FieEsq34503> query = manager.createQuery(consulta, FieEsq34503.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 34350
	
	public List<FieEsq34350> listarFieEsq34350(String filtro) {
	       String consulta = "select l from FieEsq34350 l where l.numEsq34350 like :nuncerc";
	          TypedQuery<FieEsq34350> query = manager.createQuery(consulta, FieEsq34350.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq03354> listarFieEsq03354(String filtro) {
	       String consulta = "select l from FieEsq03354 l where l.numEsq03354 like :nuncerc";
	          TypedQuery<FieEsq03354> query = manager.createQuery(consulta, FieEsq03354.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03435> listarFieEsq03435(String filtro) {
	       String consulta = "select l from FieEsq03435 l where l.numEsq03435 like :nuncerc";
	          TypedQuery<FieEsq03435> query = manager.createQuery(consulta, FieEsq03435.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03453> listarFieEsq03453(String filtro) {
	       String consulta = "select l from FieEsq03453 l where l.numEsq03453 like :nuncerc";
	          TypedQuery<FieEsq03453> query = manager.createQuery(consulta, FieEsq03453.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03534> listarFieEsq03534(String filtro) {
	       String consulta = "select l from FieEsq03534 l where l.numEsq03534 like :nuncerc";
	          TypedQuery<FieEsq03534> query = manager.createQuery(consulta, FieEsq03534.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03543> listarFieEsq03543(String filtro) {
	       String consulta = "select l from FieEsq03543 l where l.numEsq03543 like :nuncerc";
	          TypedQuery<FieEsq03543> query = manager.createQuery(consulta, FieEsq03543.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04335> listarFieEsq04335(String filtro) {
	       String consulta = "select l from FieEsq04335 l where l.numEsq04335 like :nuncerc";
	          TypedQuery<FieEsq04335> query = manager.createQuery(consulta, FieEsq04335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04353> listarFieEsq04353(String filtro) {
	       String consulta = "select l from FieEsq04353 l where l.numEsq04353 like :nuncerc";
	          TypedQuery<FieEsq04353> query = manager.createQuery(consulta, FieEsq04353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq04533> listarFieEsq04533(String filtro) {
	       String consulta = "select l from FieEsq04533 l where l.numEsq04533 like :nuncerc";
	          TypedQuery<FieEsq04533> query = manager.createQuery(consulta, FieEsq04533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05334> listarFieEsq05334(String filtro) {
	       String consulta = "select l from FieEsq05334 l where l.numEsq05334 like :nuncerc";
	          TypedQuery<FieEsq05334> query = manager.createQuery(consulta, FieEsq05334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05343> listarFieEsq05343(String filtro) {
	       String consulta = "select l from FieEsq05343 l where l.numEsq05343 like :nuncerc";
	          TypedQuery<FieEsq05343> query = manager.createQuery(consulta, FieEsq05343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05433> listarFieEsq05433(String filtro) {
	       String consulta = "select l from FieEsq05433 l where l.numEsq05433 like :nuncerc";
	          TypedQuery<FieEsq05433> query = manager.createQuery(consulta, FieEsq05433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30345> listarFieEsq30345(String filtro) {
	       String consulta = "select l from FieEsq30345 l where l.numEsq30345 like :nuncerc";
	          TypedQuery<FieEsq30345> query = manager.createQuery(consulta, FieEsq30345.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30354> listarFieEsq30354(String filtro) {
	       String consulta = "select l from FieEsq30354 l where l.numEsq30354 like :nuncerc";
	          TypedQuery<FieEsq30354> query = manager.createQuery(consulta, FieEsq30354.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30435> listarFieEsq30435(String filtro) {
	       String consulta = "select l from FieEsq30435 l where l.numEsq30435 like :nuncerc";
	          TypedQuery<FieEsq30435> query = manager.createQuery(consulta, FieEsq30435.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30453> listarFieEsq30453(String filtro) {
	       String consulta = "select l from FieEsq30453 l where l.numEsq30453 like :nuncerc";
	          TypedQuery<FieEsq30453> query = manager.createQuery(consulta, FieEsq30453.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30534> listarFieEsq30534(String filtro) {
	       String consulta = "select l from FieEsq30534 l where l.numEsq30534 like :nuncerc";
	          TypedQuery<FieEsq30534> query = manager.createQuery(consulta, FieEsq30534.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30543> listarFieEsq30543(String filtro) {
	       String consulta = "select l from FieEsq30543 l where l.numEsq30543 like :nuncerc";
	          TypedQuery<FieEsq30543> query = manager.createQuery(consulta, FieEsq30543.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33045> listarFieEsq33045(String filtro) {
	       String consulta = "select l from FieEsq33045 l where l.numEsq33045 like :nuncerc";
	          TypedQuery<FieEsq33045> query = manager.createQuery(consulta, FieEsq33045.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33054> listarFieEsq33054(String filtro) {
	       String consulta = "select l from FieEsq33054 l where l.numEsq33054 like :nuncerc";
	          TypedQuery<FieEsq33054> query = manager.createQuery(consulta, FieEsq33054.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33405> listarFieEsq33405(String filtro) {
	       String consulta = "select l from FieEsq33405 l where l.numEsq33405 like :nuncerc";
	          TypedQuery<FieEsq33405> query = manager.createQuery(consulta, FieEsq33405.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33450> listarFieEsq33450(String filtro) {
	       String consulta = "select l from FieEsq33450 l where l.numEsq33450 like :nuncerc";
	          TypedQuery<FieEsq33450> query = manager.createQuery(consulta, FieEsq33450.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33504> listarFieEsq33504(String filtro) {
	       String consulta = "select l from FieEsq33504 l where l.numEsq33504 like :nuncerc";
	          TypedQuery<FieEsq33504> query = manager.createQuery(consulta, FieEsq33504.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33540> listarFieEsq33540(String filtro) {
	       String consulta = "select l from FieEsq33540 l where l.numEsq33540 like :nuncerc";
	          TypedQuery<FieEsq33540> query = manager.createQuery(consulta, FieEsq33540.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34035> listarFieEsq34035(String filtro) {
	       String consulta = "select l from FieEsq34035 l where l.numEsq34035 like :nuncerc";
	          TypedQuery<FieEsq34035> query = manager.createQuery(consulta, FieEsq34035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34053> listarFieEsq34053(String filtro) {
	       String consulta = "select l from FieEsq34053 l where l.numEsq34053 like :nuncerc";
	          TypedQuery<FieEsq34053> query = manager.createQuery(consulta, FieEsq34053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34305> listarFieEsq34305(String filtro) {
	       String consulta = "select l from FieEsq34305 l where l.numEsq34305 like :nuncerc";
	          TypedQuery<FieEsq34305> query = manager.createQuery(consulta, FieEsq34305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03345> listarFieEsq03345(String filtro) {
	       String consulta = "select l from FieEsq03345 l where l.numEsq03345 like :nuncerc";
	          TypedQuery<FieEsq03345> query = manager.createQuery(consulta, FieEsq03345.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	
}
